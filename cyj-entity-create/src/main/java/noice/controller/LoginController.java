package noice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import noice.assembler.TreeMenuControllerAssembler;
import noice.assembler.bean.UserControllerAssembler;
import noice.common.entity.vo.ResultVO;
import noice.converter.LoginControllerConverter;
import noice.entity.vo.LoginResultVo;
import noice.entity.vo.LoginVo;
import noice.entity.vo.TreeMenuVo;
import noice.entity.vo.bean.UserVo;
import noice.service.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("userApi/v1")
@Tag(name = "Login")
public class LoginController {

    private LoginService service;

    private LoginControllerConverter converter;

    private UserControllerAssembler userControllerAssembler;

    private TreeMenuControllerAssembler treeMenuControllerAssembler;


    @Autowired
    public void setUserControllerAssembler(UserControllerAssembler userControllerAssembler) {
        this.userControllerAssembler = userControllerAssembler;
    }

    @Autowired
    public void setTreeMenuControllerAssembler(TreeMenuControllerAssembler treeMenuControllerAssembler) {
        this.treeMenuControllerAssembler = treeMenuControllerAssembler;
    }

    @Autowired
    public void setService(LoginService service) {
        this.service = service;
    }

    @Autowired
    public void setConverter(LoginControllerConverter converter) {
        this.converter = converter;
    }

    @Operation(summary = "登录")
    @PostMapping(value = "login")
    public ResultVO login(@RequestBody LoginVo vo) {
        String token = service.login(converter.voToDto(vo));
        LoginResultVo resultVo = new LoginResultVo();
        if (StringUtils.isEmpty(token)) {
            resultVo.setSuccess(false);
            return ResultVO.success(resultVo);
        }
        resultVo.setToken(token);
        return ResultVO.success(resultVo);
    }

    @Operation(summary = "登出")
    @GetMapping(value = "logout")
    public ResultVO logout() {
        service.logout();
        return ResultVO.success();
    }

    @Operation(summary = "获取用户信息")
    @GetMapping(value = "getUserInfo")
    public ResultVO getUserInfo() {
        UserVo userVo = userControllerAssembler.dtoToVo(service.getUserInfo());
        return ResultVO.success(userVo);
    }

    @Operation(summary = "获取用户菜单")
    @GetMapping(value = "getUserMenu")
    public ResultVO getUserMenu() {
        List<TreeMenuVo> treeMenuVoList = treeMenuControllerAssembler.treeDtoListToTreeVoList(service.getUserMenu());
        return ResultVO.success(treeMenuVoList);
    }

}
