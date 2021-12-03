package com.example.cyjuser.listener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.cyjuser.service.Impl.InterFaceMappingImpl;
import com.example.cyjuser.service.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(MessageProvider.class)
public class HelloListener {

        private InterFaceMappingImpl interFace;

        @Autowired
        public void setInterFace(InterFaceMappingImpl interFace) {
                this.interFace = interFace;
        }

        @StreamListener(target = "greetingChannel")
        public void processHelloChannelGreeting(String msg) {
                JSONArray interFaceList = JSONObject.parseArray(msg);
                for (Object o : interFaceList) {
                        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(o));
                        interFace.InterFaceMethod(jsonObject);
                }
        }

}
