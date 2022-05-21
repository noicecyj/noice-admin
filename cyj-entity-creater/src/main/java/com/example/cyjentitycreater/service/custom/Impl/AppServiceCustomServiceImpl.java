package com.example.cyjentitycreater.service.custom.Impl;

import com.example.cyjcommon.dao.AppServiceDao;
import com.example.cyjcommon.entity.po.AppServicePO;
import com.example.cyjcommon.entity.po.DictionaryPO;
import com.example.cyjcommon.service.BaseService;
import com.example.cyjcommon.utils.CommonUtils;
import com.example.cyjdictionary.service.custom.DictionaryCustomService;
import com.example.cyjentitycreater.service.custom.AppServiceCustomService;
import com.example.cyjentitycreater.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AppServiceCustomServiceImpl extends BaseService implements AppServiceCustomService {

    private AppServiceDao appServiceDao;
    private DictionaryCustomService dictionaryCustomService;

    @Autowired
    public void setAppServiceDao(AppServiceDao appServiceDao) {
        this.appServiceDao = appServiceDao;
    }

    @Autowired
    public void setDictionaryCustomService(DictionaryCustomService dictionaryCustomService) {
        this.dictionaryCustomService = dictionaryCustomService;
    }

    @Override
    public void createAppFile(String id) {
        Optional<AppServicePO> opt = appServiceDao.findById(id);
        if (opt.isPresent()) {
            AppServicePO appServicePO = opt.get();
            String AppName = BeanUtils.captureName(BeanUtils.underline2Camel2(appServicePO.getAppServicename()));
            List<DictionaryPO> pos = dictionaryCustomService.findCatalogByValue("PROJECT_PATH");
            HashMap<String, DictionaryPO> mapPo = CommonUtils.listToMap(pos, "dictionaryName");
            String AppFilePath = mapPo.get("BACK_END").getDictionaryValue() + "\\" + appServicePO.getAppServicename() + "\\src\\main\\java\\com\\example\\" + AppName;
            String[] AppResult = appGenerate(appServicePO);
            String ymlFilePath = mapPo.get("BACK_END").getDictionaryValue() + "\\" + appServicePO.getAppServicename() + "\\src\\main\\resources";
            String[] ymlResult = ymlGenerate(appServicePO);
            String xmlFilePath = mapPo.get("BACK_END").getDictionaryValue() + "\\" + appServicePO.getAppServicename() + "\\src\\main\\resources";
            String[] xmlResult = xmlGenerate(appServicePO);
            String configFilePath = mapPo.get("BACK_END").getDictionaryValue() + "\\" + appServicePO.getAppServicename() + "\\src\\main\\resources";
            String[] configResult = configGenerate();
            String pomFilePath = mapPo.get("BACK_END").getDictionaryValue() + "\\" + appServicePO.getAppServicename();
            String[] pomResult = pomGenerate(appServicePO);
            try {
                createJavaFile(AppFilePath, AppResult);
                createJavaFile(ymlFilePath, ymlResult);
                createJavaFile(xmlFilePath, xmlResult);
                createJavaFile(configFilePath, configResult);
                createJavaFile(pomFilePath, pomResult);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public String[] appGenerate(AppServicePO po) {
        String AppName = BeanUtils.captureName(BeanUtils.underline2Camel2(po.getAppServicename()));
        StringBuilder sb = new StringBuilder();
        sb.append("package com.example.").append(AppName.toLowerCase()).append(";\r\n");
        sb.append("\r\n");
        sb.append("import org.springframework.boot.SpringApplication;\r\n");
        sb.append("import org.springframework.boot.autoconfigure.SpringBootApplication;\r\n");
        sb.append("import org.springframework.boot.autoconfigure.domain.EntityScan;\r\n");
        sb.append("import org.springframework.cloud.netflix.eureka.EnableEurekaClient;\r\n");
        sb.append("import org.springframework.cloud.openfeign.EnableFeignClients;\r\n");
        sb.append("import org.springframework.context.annotation.ComponentScan;\r\n");
        sb.append("import org.springframework.data.jpa.repository.config.EnableJpaRepositories;\r\n");
        sb.append("\r\n");
        generateAuthor(sb);
        sb.append("@SpringBootApplication\r\n");
        sb.append("@EnableEurekaClient\r\n");
        sb.append("@EnableFeignClients\r\n");
        sb.append("@EnableJpaRepositories(value = \"com.example\")\r\n");
        sb.append("@EntityScan(value = \"com.example\")\r\n");
        sb.append("@ComponentScan(value=\"com.example\")\r\n");
        sb.append("public class ").append(AppName).append("Application {\r\n");
        sb.append("\r\n");
        sb.append("    public static void main(String[] args) {\r\n");
        sb.append("        SpringApplication.run(").append(AppName).append("Application.class, args);\r\n");
        sb.append("    }\r\n");
        sb.append("\r\n");
        sb.append("}\r\n");
        String serviceFileData = sb.toString();
        return new String[]{serviceFileData, BeanUtils.AppFileName(po)};
    }

    public String[] ymlGenerate(AppServicePO po) {
        String serviceFileData =
                "server:\r\n" +
                        "  port: " + po.getAppServicePort() + "\r\n" +
                        "eureka:\r\n" +
                        "  client:\r\n" +
                        "    serviceUrl:\r\n" +
                        "      defaultZone: http://localhost:8761/eureka\r\n" +
                        "    fetch-registry: true\r\n" +
                        "  instance:\r\n" +
                        "    prefer-ip-address: true\r\n" +
                        "spring:\r\n" +
                        "  application:\r\n" +
                        "    name: " + po.getAppServicename() + "\r\n" +
                        "  jpa:\r\n" +
                        "    generate-ddl: false\r\n" +
                        "    show-sql: true\r\n" +
                        "    hibernate:\r\n" +
                        "      ddl-auto: update\r\n" +
                        "  datasource:\r\n" +
                        "    platform: mysql\r\n" +
                        "    driver-class-name: com.mysql.cj.jdbc.Driver\r\n" +
                        "    url: jdbc:mysql://localhost:3306/data_user?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC\r\n" +
                        "    username: root\r\n" +
                        "    password: 68762306\r\n";
        return new String[]{serviceFileData, "application.yml"};
    }

    public String[] xmlGenerate(AppServicePO po) {
        String serviceFileData =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" +
                        "<!--该日志将日志级别不同的log信息保存到不同的文件中 -->\r\n" +
                        "<configuration debug=\"false\">\r\n" +
                        "    <!--定义日志文件的存储地址 勿在 LogBack 的配置中使用相对路径-->\r\n" +
                        "    <property name=\"LOG_HOME\" value=\"C:\\log\"/>\r\n" +
                        "\r\n" +
                        "    <!-- 控制台输出 -->\r\n" +
                        "    <appender name=\"stdout\" class=\"ch.qos.logback.core.ConsoleAppender\">\r\n" +
                        "        <encoder class=\"ch.qos.logback.classic.encoder.PatternLayoutEncoder\">\r\n" +
                        "            <!--格式化输出：%d表示日期，%thread表示线程名，%-5level：级别从左显示5个字符宽度%msg：日志消息，%n是换行符-->\r\n" +
                        "            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{50} - %msg%n</pattern>\r\n" +
                        "        </encoder>\r\n" +
                        "    </appender>\r\n" +
                        "\r\n" +
                        "    <!--2. 输出到文档-->\r\n" +
                        "    <!-- 2.1 level为 DEBUG 日志，时间滚动输出 -->\r\n" +
                        "    <appender name=\"LOG_FILE\" class=\"ch.qos.logback.core.rolling.RollingFileAppender\">\r\n" +
                        "        <!-- 正在记录的日志文档的路径及文档名 -->\r\n" +
                        "        <file>${LOG_HOME}/" + po.getAppServicename() + ".log</file>\r\n" +
                        "        <!--日志文档输出格式-->\r\n" +
                        "        <encoder>\r\n" +
                        "            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{50} - %msg%n</pattern>\r\n" +
                        "            <charset>UTF-8</charset> <!-- 设置字符集 -->\r\n" +
                        "        </encoder>\r\n" +
                        "        <!-- 日志记录器的滚动策略，按日期，按大小记录 -->\r\n" +
                        "        <rollingPolicy class=\"ch.qos.logback.core.rolling.TimeBasedRollingPolicy\">\r\n" +
                        "            <!-- 日志归档 -->\r\n" +
                        "            <fileNamePattern>${LOG_HOME}/" + po.getAppServicename() + "-%d{yyyy-MM-dd}.%i.log</fileNamePattern>\r\n" +
                        "            <timeBasedFileNamingAndTriggeringPolicy class=\"ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP\">\r\n" +
                        "                <maxFileSize>100MB</maxFileSize>\r\n" +
                        "            </timeBasedFileNamingAndTriggeringPolicy>\r\n" +
                        "            <!--日志文档保留天数-->\r\n" +
                        "            <maxHistory>3</maxHistory>\r\n" +
                        "        </rollingPolicy>\r\n" +
                        "    </appender>\r\n" +
                        "\r\n" +
                        "    <!-- 日志输出级别 -->\r\n" +
                        "    <root level=\"INFO\">\r\n" +
                        "        <appender-ref ref=\"stdout\"/>\r\n" +
                        "        <appender-ref ref=\"LOG_FILE\"/>\r\n" +
                        "    </root>\r\n" +
                        "\r\n" +
                        "</configuration>\r\n";
        return new String[]{serviceFileData, "logback-spring.xml"};
    }

    public String[] configGenerate() {
        String serviceFileData = "";
        return new String[]{serviceFileData, "config.properties"};
    }

    public String[] pomGenerate(AppServicePO po) {
        String serviceFileData =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" +
                        "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" +
                        "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">\r\n" +
                        "    <modelVersion>4.0.0</modelVersion>\r\n" +
                        "\r\n" +
                        "    <groupId>com.example</groupId>\r\n" +
                        "    <artifactId>" + po.getAppServicename() + "</artifactId>\r\n" +
                        "    <version>0.0.1-SNAPSHOT</version>\r\n" +
                        "    <packaging>jar</packaging>\r\n" +
                        "\r\n" +
                        "    <name>" + po.getAppServicename() + "</name>\r\n" +
                        "    <description>Demo project for Spring Boot</description>\r\n" +
                        "\r\n" +
                        "    <parent>\r\n" +
                        "        <groupId>noice</groupId>\r\n" +
                        "        <artifactId>cyj</artifactId>\r\n" +
                        "        <version>1.0-SNAPSHOT</version>\r\n" +
                        "    </parent>\r\n" +
                        "\r\n" +
                        "    <dependencyManagement>\r\n" +
                        "        <dependencies>\r\n" +
                        "            <dependency>\r\n" +
                        "                <groupId>org.springframework.cloud</groupId>\r\n" +
                        "                <artifactId>spring-cloud-dependencies</artifactId>\r\n" +
                        "                <version>Hoxton.SR10</version>\r\n" +
                        "                <type>pom</type>\r\n" +
                        "                <scope>import</scope>\r\n" +
                        "            </dependency>\r\n" +
                        "        </dependencies>\r\n" +
                        "    </dependencyManagement>\r\n" +
                        "\r\n" +
                        "    <properties>\r\n" +
                        "        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\r\n" +
                        "        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>\r\n" +
                        "        <java.version>1.8</java.version>\r\n" +
                        "    </properties>\r\n" +
                        "\r\n" +
                        "    <dependencies>\r\n" +
                        "        <dependency>\r\n" +
                        "            <groupId>com.example</groupId>\r\n" +
                        "            <artifactId>cyj-common</artifactId>\r\n" +
                        "            <version>0.0.1-SNAPSHOT</version>\r\n" +
                        "        </dependency>\r\n" +
                        "        <dependency>\r\n" +
                        "            <groupId>com.example</groupId>\r\n" +
                        "            <artifactId>cyj-dictionary</artifactId>\r\n" +
                        "            <version>0.0.1-SNAPSHOT</version>\r\n" +
                        "        </dependency>\r\n" +
                        "        <dependency>\r\n" +
                        "            <groupId>com.example</groupId>\r\n" +
                        "            <artifactId>cyj-query</artifactId>\r\n" +
                        "            <version>0.0.1-SNAPSHOT</version>\r\n" +
                        "        </dependency>\r\n" +
                        "    </dependencies>\r\n" +
                        "\r\n" +
                        "    <build>\r\n" +
                        "        <plugins>\r\n" +
                        "            <plugin>\r\n" +
                        "                <groupId>org.springframework.boot</groupId>\r\n" +
                        "                <artifactId>spring-boot-maven-plugin</artifactId>\r\n" +
                        "            </plugin>\r\n" +
                        "            <plugin>\r\n" +
                        "                <groupId>com.mysema.maven</groupId>\r\n" +
                        "                <artifactId>apt-maven-plugin</artifactId>\r\n" +
                        "                <version>1.1.3</version>\r\n" +
                        "                <executions>\r\n" +
                        "                    <execution>\r\n" +
                        "                        <goals>\r\n" +
                        "                            <goal>process</goal>\r\n" +
                        "                        </goals>\r\n" +
                        "                        <configuration>\r\n" +
                        "                            <outputDirectory>target/generated-sources/java</outputDirectory>\r\n" +
                        "                            <processor>com.querydsl.apt.jpa.JPAAnnotationProcessor</processor>\r\n" +
                        "                        </configuration>\r\n" +
                        "                    </execution>\r\n" +
                        "                </executions>\r\n" +
                        "            </plugin>\r\n" +
                        "        </plugins>\r\n" +
                        "    </build>\r\n" +
                        "\r\n" +
                        "</project>\r\n";
        return new String[]{serviceFileData, "pom.xml"};
    }

    public void generateAuthor(StringBuilder sb) {
        sb.append("/**\r\n");
        sb.append(" * @author 曹元杰\r\n");
        sb.append(" * @version 1.0\r\n");
        sb.append(" */\r\n");
    }

}
