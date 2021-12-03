package com.example.cyjuser.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.cyjuser.dao.AuthorityDao;
import com.example.cyjuser.entity.po.AuthorityPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

@Service
public class InterFaceMappingImpl implements HandlerInterceptor {

        private AuthorityDao authorityDao;

        @Autowired
        public void setAuthorityDao(AuthorityDao authorityDao) {
                this.authorityDao = authorityDao;
        }

        public void InterFaceMethod(JSONObject jsonObject) {
                AuthorityPO po = authorityDao.findByPathAndName(jsonObject.getString("path"), jsonObject.getString("name"));
                if (po == null) {
                        AuthorityPO insertPo = JSONObject.parseObject(jsonObject.toJSONString(), AuthorityPO.class);
                        insertPo.setSortCode("0010");
                        authorityDao.save(insertPo);
                }
        }

}
