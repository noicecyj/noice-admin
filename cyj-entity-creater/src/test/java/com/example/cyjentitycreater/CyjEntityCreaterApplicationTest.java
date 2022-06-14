package com.example.cyjentitycreater;

import com.example.cyjcommon.dao.EntityDao;
import com.example.cyjcommon.entity.Persistent;
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
        Persistent persistent1 = entityDao.getOne("edd90446-98bc-4330-8d93-1ba4ff003af0");
        entityCustomService.entityHandler(persistent1);
        Persistent persistent2 = entityDao.getOne("ea17ecb7-4ab9-4f93-8546-3da3483400aa");
        entityCustomService.entityHandler(persistent2);
        Persistent persistent3 = entityDao.getOne("a714354b-0fbd-4cb0-89b5-4ff3663755cf");
        entityCustomService.entityHandler(persistent3);
        Persistent persistent4 = entityDao.getOne("8e954fce-ac50-45b9-9bbd-fb5eaa839b4f");
        entityCustomService.entityHandler(persistent4);
    }

}
