package noice.common.contants;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson2.JSONObject;

import java.util.List;

import static noice.common.contants.Constant.USER_ID;

public class UserContext {

    private static final ThreadLocal<JSONObject> userHolder = new ThreadLocal<>();

    public static JSONObject getUser() {
        if (userHolder.get() == null) {
            JSONObject map = new JSONObject();
            map.put(USER_ID, "1");
            map.put("userCode", "admin");
            map.put("userName", "管理员");
            userHolder.set(map);
        }
        return userHolder.get();
    }

    public static void setUser(JSONObject map) {
        if (map == null) {
            map = new JSONObject();
            map.put(USER_ID, "1");
            map.put("userCode", "admin");
            map.put("userName", "管理员");
        }
        userHolder.set(map);
    }

    public static String getUserId() {
        return getUser().getString(USER_ID);
    }

    public static String getUserCode() {
        return getUser().getString("userCode");
    }

    public static String getUserName() {
        return getUser().getString("userName");
    }

    public static void remove() {
        userHolder.remove();
    }

    public static List<String> getUserRole() {
        return getUser().getList("userRole", String.class);
    }

    public static void setUserRole(String userRole) {
        List<String> roleList = StrUtil.split(userRole, ";");
        getUser().put("userRole", roleList);
    }

    public static List<String> getUserMenu() {
        return getUser().getList("userMenu", String.class);
    }

    public static void setUserMenu(String userMenu) {
        List<String> menuList = StrUtil.split(userMenu, ";");
        getUser().put("userMenu", menuList);
    }

    public static List<String> getUserInterface() {
        return getUser().getList("userInterface", String.class);
    }

    public static void setUserInterface(String userInterface) {
        List<String> interfaceList = StrUtil.split(userInterface, ";");
        getUser().put("userInterface", interfaceList);
    }

    public static List<String> getUserForm() {
        return getUser().getList("userForm", String.class);
    }

    public static void setUserForm(String userForm) {
        List<String> formList = StrUtil.split(userForm, ";");
        getUser().put("userForm", formList);
    }

    public static List<String> getUserTable() {
        return getUser().getList("userTable", String.class);
    }

    public static void setUserTable(String userTable) {
        List<String> tableList = StrUtil.split(userTable, ";");
        getUser().put("userTable", tableList);
    }

    public static List<String> getUserButton() {
        return getUser().getList("userButton", String.class);
    }

    public static void setUserButton(String userButton) {
        List<String> buttonList = StrUtil.split(userButton, ";");
        getUser().put("userButton", buttonList);
    }

}
