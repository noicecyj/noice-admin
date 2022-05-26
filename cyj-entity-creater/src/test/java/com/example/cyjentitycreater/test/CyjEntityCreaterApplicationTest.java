package com.example.cyjentitycreater.test;

import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.entity.po.EntityPO;
import com.example.cyjentitycreater.CyjEntityCreaterApplication;
import com.example.cyjentitycreater.service.custom.EntityCustomService;
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
    private EntityCustomService entityCustomService;
    @Autowired
    private EntityDao entityDao;

    @Test
    @Transactional
    public void entityTest() {
        EntityPO entityPO = entityDao.getOne("edd90446-98bc-4330-8d93-1ba4ff003af0");
        entityCustomService.entityHandler(entityPO);
    }

}
