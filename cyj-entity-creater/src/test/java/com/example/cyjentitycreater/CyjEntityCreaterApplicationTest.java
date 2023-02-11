package com.example.cyjentitycreater;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.cyjcommon.contants.Constant;
import com.example.cyjcommon.entity.bean.MenuBean;
import com.example.cyjcommon.entity.bean.PersistentBean;
import com.example.cyjcommon.utils.BeanUtils;
import com.example.cyjentitycreater.service.bean.custom.MenuCustomServiceImpl;
import com.example.cyjentitycreater.service.bean.custom.PersistentCustomServiceImpl;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import java.util.Map;

/**
 * @author Noice
 */
@Data
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CyjEntityCreaterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CyjEntityCreaterApplicationTest {

    private static final Logger logger = LoggerFactory.getLogger(CyjEntityCreaterApplicationTest.class);


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
//    @Transactional
    public void entityTest() {
        List<PersistentBean> persistentList = new PersistentBean().selectAll();
        for (PersistentBean persistent : persistentList) {
            persistentCustomServiceImpl.entityHandler(persistent, "create");
        }
    }

    @Test
    @Transactional
    public void findDataTableAndFormByNameTest() {
        List<PersistentBean> persistentList = new PersistentBean().selectAll();
        for (PersistentBean persistent : persistentList) {
            persistentCustomServiceImpl.findDataTableAndFormByName(persistent.getPersistentCode());
        }
    }

    @Autowired
    private MenuCustomServiceImpl menuCustomService;

    @Test
//    @Transactional
    public void menuTest() {
        menuCustomService.generateMenuFile();
    }

    @Test
//    @Transactional
    public void menuTest2() {
        List<MenuBean> menuBeanList = new MenuBean()
                .selectList(new LambdaQueryWrapper<MenuBean>()
                        .eq(MenuBean::getStatus, Constant.STATUS));
        List<Map<String, Object>> maps = BeanUtils
                .listToTree(menuBeanList, "menuUrl", "menuParentUrl");
        logger.info(JSON.toJSONString(maps));
    }

}
