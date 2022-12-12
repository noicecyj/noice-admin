package com.example.cyjentitycreater;

import com.example.cyjcommon.entity.bean.Persistent;
import com.example.cyjentitycreater.service.bean.custom.PersistentCustomServiceImpl;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

/**
 * @author Noice
 */
@Data
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CyjEntityCreaterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CyjEntityCreaterApplicationTest {

    @Autowired
    public WebApplicationContext wac;
    private MockMvc mockMvc;

    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    }

    @Autowired
    private PersistentCustomServiceImpl persistentCustomServiceImpl;

    @Test
    @Transactional
    public void entityTest() {
//        List<Persistent> persistentList = new Persistent().selectAll();
//        for (Persistent persistent : persistentList) {
//            persistentCustomServiceImpl.entityHandler(persistent, "create");
//        }
        Persistent persistent1 = new Persistent().selectById("60f843a3-9842-4f1b-a029-726c6e764331");
        persistentCustomServiceImpl.entityHandler(persistent1,"create");
//        Persistent persistent2 = new Persistent().selectById("f6c2d230-8e6b-431e-948a-13a07d06846c");
//        persistentCustomServiceImpl.entityHandler(persistent2,"delete");
//        Persistent persistent3 = new Persistent().selectById("ea17ecb7-4ab9-4f93-8546-3da3483400aa");
//        persistentCustomServiceImpl.entityHandler(persistent3,"delete");
//        Persistent persistent4 = new Persistent().selectById("d94c5c86-ba27-4e8f-8fd2-0d203da69a5b");
//        persistentCustomServiceImpl.entityHandler(persistent4,"delete");
    }

}
