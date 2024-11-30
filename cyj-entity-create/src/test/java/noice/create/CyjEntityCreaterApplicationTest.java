package noice.create;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.LoginDto;
import noice.entity.dto.bean.AppServiceDto;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.AppServicePo;
import noice.entity.vo.bean.AppServiceVo;
import noice.entity.vo.bean.CatalogDictionaryVo;
import noice.entity.vo.bean.CatalogVo;
import noice.handler.factory.bean.ClassBeanFactoryImpl;
import noice.handler.factory.relation.ClassRelationFactoryImpl;
import noice.repository.bean.AppServiceRepository;
import noice.service.LoginService;
import noice.service.bean.AppServiceService;
import noice.service.bean.CatalogDictionaryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TestPropertySource(properties = {"spring.config.location=classpath:application-test.yml"})
@SpringBootTest(classes = CyjEntityCreaterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CyjEntityCreaterApplicationTest extends AbstractJUnit4SpringContextTests {

    private static final Logger logger = LoggerFactory.getLogger(CyjEntityCreaterApplicationTest.class);

    @Autowired
    public WebApplicationContext wac;
    private MockMvc mockMvc;

    @Autowired
    private ClassBeanFactoryImpl classBeanFactory;

    @Autowired
    private ClassRelationFactoryImpl classRelationFactory;
    //    @Test
    /// /    @Transactional
//    public void menuTest2() {
//        List<MenuPo> menuPoList = new MenuPo()
//                .selectList(new LambdaQueryWrapper<MenuPo>()
//                        .eq(MenuPo::getStatus, Constant.STATUS));
//        List<Map<String, Object>> maps = BeanUtils
//                .listToTree(menuPoList, "menuUrl", "menuParentUrl");
//        logger.info(JSON.toJSONString(maps));
//    }
    @Autowired
    private AppServiceRepository appServiceRepository;
    @Autowired
    private AppServiceService appServiceService;
    @Autowired
    private CatalogDictionaryService catalogDictionaryService;
    @Autowired
    private LoginService loginService;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("开始计算的年份：");
        int setYear = sc.nextInt();
        System.out.println("需要计算几个年：");
        int time = sc.nextInt();
        int yearTime = time * 12;
        System.out.println("本金为：");
        double a = sc.nextDouble();
        LocalDate localDate = LocalDate.of(setYear, 1, 1);

        DecimalFormat df = new DecimalFormat("#.00");
        double b = 0.003;
        double c = 5000;
        double q = 0;
        for (int i = 1; i <= yearTime; i++) {
            int year = localDate.getYear();
            int month = localDate.getMonth().getValue();
            System.out.println("当前为" + year + "年" + month + "月份");
            double t = asd(year, month, a, b);
            q = q + t;
            qwe(year, month, a, t);
            a = a + c;
            localDate = localDate.plusMonths(1);

            if (month == 12) {
                System.out.println(year + "年总收益为" + df.format(q) + "元");
                q = 0;
            }
        }

    }

    public static double asd(int year, int month, double a, double b) {
        DecimalFormat df = new DecimalFormat("#.00");
        double d = a * b;
        System.out.println("当前为" + year + "年" + month + "月份收益为" + df.format(d) + "元");
        return d;
    }

    public static double qwe(int year, int month, double a, double d) {
        DecimalFormat df = new DecimalFormat("#.00");
        double e = a + d;
        System.out.println("当前为" + year + "年" + month + "月份总资产为" + df.format(e) + "元");
        return e;
    }

    @Test
    @Transactional
    public void createEntityBeanTest() {
        classBeanFactory.create();
    }

    @Test
    @Transactional
    public void createEntityRelationTest() {
        classRelationFactory.create();
    }

    @Test
    public void menuBeanTest() {
        classBeanFactory.initData();
    }


//    @Test

    /// /    @Transactional
//    public void menuTest() {
//        menuCustomService.generateMenuFile();
//    }
    @Test
    public void menuRelationTest() {
        classRelationFactory.initData();
    }

    @Test
    public void menuTest() {
        classBeanFactory.initData();
        classRelationFactory.initData();
    }

    @Test
    @Transactional
    public void createEntityRelationTest2() {
        classBeanFactory.create();
//        classRelationFactory.create();
    }
//    @Autowired
//    private CommonBeanRepository commonBeanRepository;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    }

    @Test
    @Transactional
    public void PersistentBeanQuery() {
        AppServicePo appServicePo = new AppServicePo();
        appServicePo.setAppServiceName("服务");
        appServicePo.setStatus(true);
        IPage<AppServicePo> page = appServiceRepository.findPage(new Page<>(-1, 10), appServicePo);
        logger.info(JSON.toJSONString(page.getRecords()));
    }

    @Test
    @Transactional
    public void loginTest() {
        LoginDto dto = new LoginDto();
        dto.setUserName("123123");
        dto.setPassword("111111");
        loginService.login(dto);
    }

//    @Test
//    @Transactional
//    public void menuTreeTest() {
//        List<TreeMenuDto> treeMenu = loginService.getTreeMenu("40f07e85-5e7c-43de-8569-d7bc4e445fdb");
//        List<FormDto> authorityPersistentFormDtoList = loginService.getForm("40f07e85-5e7c-43de-8569-d7bc4e445fdb");
//        List<TableDto> authorityPersistentTableDtoList = loginService.getTable("40f07e85-5e7c-43de-8569-d7bc4e445fdb");
//        logger.info(JSON.toJSONString(treeMenu));
//        logger.info(JSON.toJSONString(authorityPersistentFormDtoList));
//        logger.info(JSON.toJSONString(authorityPersistentTableDtoList));
//    }

//    @Test
//    @Transactional
//    public void CommonBeanRepositoryTest() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
//        AppServicePo appServicePo = new AppServicePo();
//        appServicePo.setAppServiceName("用户服务");
//        appServicePo.setStatus(true);
//        String res = commonBeanRepository.find(AppServicePo.PO, appServicePo.eqAppServiceName().getQueryWrapper());
//        logger.info(res);
//    }

//    @Test
//    @Transactional
//    public void CommonBeanServiceTest() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
//        AppServicePo appServicePo = new AppServicePo();
//        appServicePo.setAppServiceName("用户服务");
//        appServicePo.setStatus(true);
//        String res = commonBeanService.findOne(AppServicePo.PO, appServicePo.eqAppServiceName().getQueryWrapper());
//        logger.info(res);
//    }

    @Test
    @Transactional
    public void PersistentServiceQuery() {
        AppServiceDto appServiceDto = new AppServiceDto();
        appServiceDto.setAppServiceName("服务");
        appServiceDto.setStatus(true);
        appServiceDto.setCurrent(-1);
        appServiceDto.setPageSize(10);
        IPage<AppServiceDto> page = appServiceService.findPage(appServiceDto);
        logger.info(JSON.toJSONString(page.getRecords()));
    }

    @Test
    @Transactional
    public void PersistentServiceQuery2() {
        CatalogDictionaryDto catalogDictionaryDto = new CatalogDictionaryDto();
        catalogDictionaryDto.setCatalogId("4028818573531708017353282db10003");
        catalogDictionaryDto.setStatus(true);
        catalogDictionaryDto.setCurrent(-1);
        catalogDictionaryDto.setPageSize(10);
        IPage<CatalogDictionaryDto> page = catalogDictionaryService.findPage(catalogDictionaryDto);
        logger.info(JSON.toJSONString(page.getRecords()));
    }

    @Test
    @Transactional
    public void PersistentServiceQuery3() {
        CatalogDictionaryDto one = catalogDictionaryService.findOne("1c1fe698-7310-4689-b7aa-eed9e94f8261");
        logger.info(JSON.toJSONString(one));
    }

    @Test
    @Transactional
    public void test() throws Exception {
        AppServiceVo appServiceVo = new AppServiceVo();
        appServiceVo.setAppServiceName("服务");
//        appServiceVo.setAppServiceCode("user");
        appServiceVo.setStatus(true);
        appServiceVo.setCurrent(-1);
        appServiceVo.setPageSize(10);
        String jsonString = JSON.toJSONString(appServiceVo);
        JSONObject object = JSON.parseObject(jsonString);
        object.put("asdasd", "123123");

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/entityCreateApi/AppService/page")
                        .content(object.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

    @Test
    @Transactional
    public void test2() throws Exception {
        CatalogVo catalogVo = new CatalogVo();
//        catalogVo.setCatalogCode("类型");
        catalogVo.setCatalogName("类型");
        catalogVo.setStatus(true);
        catalogVo.setCurrent(-1);
        catalogVo.setPageSize(10);
        String jsonString = JSON.toJSONString(catalogVo);
        JSONObject object = JSON.parseObject(jsonString);
        object.put("asdasd", "123123");

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/dictionaryApi/Catalog/page")
                        .content(object.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

    @Test
    @Transactional
    public void test3() throws Exception {
        CatalogDictionaryVo catalogDictionaryVo = new CatalogDictionaryVo();
//        catalogVo.setCatalogCode("类型");
        catalogDictionaryVo.setCatalogId("4028818573531708017353282db10003");
        catalogDictionaryVo.setStatus(true);
        catalogDictionaryVo.setCurrent(-1);
        catalogDictionaryVo.setPageSize(10);
        String jsonString = JSON.toJSONString(catalogDictionaryVo);
        JSONObject object = JSON.parseObject(jsonString);
        object.put("asdasd", "123123");

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/dictionaryApi/CatalogDictionary/page")
                        .content(object.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

    @Test
    @Transactional
    public void PersistentBeanAspect() {
        AppServicePo appServicePo = new AppServicePo();
        appServicePo.setAppServiceApi("123123");
        appServicePo.setAppServiceCode("123123");
        appServicePo.setAppServiceName("123123");
        appServiceRepository.add(appServicePo);
    }

}


