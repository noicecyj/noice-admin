package com.example.cyjuser.listener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.cyjcommon.annotation.InterFaceMapping;
import com.example.cyjuser.entity.dto.AuthorityDTO;
import com.example.cyjuser.service.Impl.InterFaceMappingImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Method;
import java.util.Map;

@Component
public class ApplicationStartupRunner implements CommandLineRunner {

        @Value("${spring.application.name}")
        private String appName;
        private ApplicationContext applicationContext;
        private InterFaceMappingImpl interFace;

        @Autowired
        public void setApplicationContext(ApplicationContext applicationContext) {
                this.applicationContext = applicationContext;
        }

        @Autowired
        public void setInterFace(InterFaceMappingImpl interFace) {
                this.interFace = interFace;
        }

        @Override
        public void run(String... args) {
                interFaceHandler();
        }

        private void interFaceHandler() {
                Map<String, Object> Tag = applicationContext.getBeansWithAnnotation(io.swagger.v3.oas.annotations.tags.Tag.class);
                for (Map.Entry<String, Object> entry : Tag.entrySet()) {
                        Method[] methods = ReflectionUtils.getAllDeclaredMethods(entry.getValue().getClass());
                        for (Method method : methods) {
                                InterFaceMapping interFaceMapping = AnnotationUtils.findAnnotation(method, InterFaceMapping.class);
                                if (interFaceMapping != null) {
                                        AuthorityDTO dto = new AuthorityDTO();
                                        dto.setAppApi(interFaceMapping.api());
                                        dto.setVersion(interFaceMapping.version());
                                        Operation operation = AnnotationUtils.findAnnotation(method, Operation.class);
                                        PostMapping postMapping = AnnotationUtils.findAnnotation(method, PostMapping.class);
                                        GetMapping getMapping = AnnotationUtils.findAnnotation(method, GetMapping.class);
                                        if (operation != null) {
                                                dto.setName(operation.summary());
                                        }
                                        if (postMapping != null) {
                                                dto.setPath(postMapping.path()[0]);
                                                dto.setMethod("POST");
                                        }
                                        if (getMapping != null) {
                                                dto.setPath(getMapping.path()[0]);
                                                dto.setMethod("GET");
                                        }
                                        dto.setAppService(appName);
                                        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(dto));
                                        interFace.InterFaceMethod(jsonObject);
                                }
                        }
                }
        }

}