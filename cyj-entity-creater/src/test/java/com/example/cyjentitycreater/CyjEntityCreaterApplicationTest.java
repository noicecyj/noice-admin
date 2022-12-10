package com.example.cyjentitycreater;

import com.example.cyjcommon.entity.bean.Persistent;
import com.example.cyjentitycreater.service.bean.custom.PersistentCustomServiceImpl;
import lombok.Data;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.identity.User;
import org.camunda.bpm.engine.rest.dto.identity.UserCredentialsDto;
import org.camunda.bpm.engine.rest.dto.identity.UserProfileDto;
import org.camunda.bpm.engine.rest.exception.InvalidRequestException;
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

import javax.ws.rs.core.Response;
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
        Persistent persistent1 = new Persistent().selectById("edd90446-98bc-4330-8d93-1ba4ff003af0");
        persistentCustomServiceImpl.entityHandler(persistent1,"delete");
        Persistent persistent2 = new Persistent().selectById("f6c2d230-8e6b-431e-948a-13a07d06846c");
        persistentCustomServiceImpl.entityHandler(persistent2,"delete");
        Persistent persistent3 = new Persistent().selectById("ea17ecb7-4ab9-4f93-8546-3da3483400aa");
        persistentCustomServiceImpl.entityHandler(persistent3,"delete");
        Persistent persistent4 = new Persistent().selectById("d94c5c86-ba27-4e8f-8fd2-0d203da69a5b");
        persistentCustomServiceImpl.entityHandler(persistent4,"delete");
//        Persistent persistent5 = new Persistent().selectById("1b6e7b0d-8758-4de0-a80f-b54505ac9e91");
//        persistentCustomServiceImpl.entityHandler(persistent5);
//        Persistent persistent6 = new Persistent().selectById("1b6e7b0d-8758-4de0-a80f-b54505ac9e9d");
//        persistentCustomServiceImpl.entityHandler(persistent6);
//        Persistent persistent7 = new Persistent().selectById("0c9f71bf-be44-4629-9d42-46bb0950647d");
//        persistentCustomServiceImpl.entityHandler(persistent7);
    }

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private IdentityService identityService;

    @Test
//    @Transactional
    public void taskUserTes2() {
        if (identityService.isReadOnly()) {
            throw new InvalidRequestException(Response.Status.FORBIDDEN, "Identity service implementation is read-only.");
        } else {
            UserProfileDto profile = new UserProfileDto();
            profile.setId("234");
            profile.setFirstName("234");
            profile.setLastName("234");
            profile.setEmail("");
            UserCredentialsDto userCredentialsDto = new UserCredentialsDto();
            userCredentialsDto.setPassword("3434");
            if (profile != null && profile.getId() != null) {
                User newUser = identityService.newUser(profile.getId());
                profile.update(newUser);
                if (userCredentialsDto != null) {
                    newUser.setPassword(userCredentialsDto.getPassword());
                }

                identityService.saveUser(newUser);
            } else {
                throw new InvalidRequestException(Response.Status.BAD_REQUEST, "request object must provide profile information with valid id.");
            }
        }
    }

}
