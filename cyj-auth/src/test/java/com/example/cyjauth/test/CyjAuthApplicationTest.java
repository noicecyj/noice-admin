package com.example.cyjauth.test;

import com.example.cyjauth.CyjAuthApplication;
import com.example.cyjauth.service.bean.auto.AuthorityServiceImpl;
import com.example.cyjcommon.mapper.bean.UserMapper;
import lombok.Data;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author Noice
 */
@Data
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CyjAuthApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CyjAuthApplicationTest {

    @Autowired
    public WebApplicationContext wac;
    private MockMvc mockMvc;

    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    }

    @Autowired
    private AuthorityServiceImpl authorityServiceImpl;
    @Autowired
    private UserMapper userMapper;


//    @Test
//    @Transactional
//    public void Test1() {
//        Set<String> authorityList = authorityService.authorityByRole("40f07e85-5e7c-43de-8569-d7bc4e445fdb");
//        System.out.println(authorityList);
//    }
//
//    @Test
////    @Transactional
//    public void Test2() {
//        Set<String> a = new HashSet<>();
////        a.add("310b7d6b-18c0-4a15-9e9e-2adfda01d9bb");
////        a.add("29f2fb85-d720-4043-a64d-991fba51b078");
//        a.add("cff6232d-465d-48b0-a259-fe213a80e385");
//        authorityService.authoritySaveRole("613cd04b-b988-46d6-af34-76c6e3abdde6", a);
//    }

}
