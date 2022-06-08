package com.example.cyjauth.service.auto;

import com.example.cyjcommon.entity.Role;
import org.springframework.data.domain.Page;

import java.util.Set;

/**
 * @author Noice
 */
public interface RoleService {

    Set<String> roleByUser(String userId);

    void roleSaveUser(String userId, Set<String> roleIds);

}
