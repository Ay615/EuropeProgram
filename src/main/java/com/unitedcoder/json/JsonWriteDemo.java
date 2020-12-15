package com.unitedcoder.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JsonWriteDemo {
    public static void main(String[] args) {
        User user=new User();
        user.setUsername("testautomation");
        user.setPassword("automation123!");
        user.setUsertype("Admin");
        user.setAge("29");
        String userInfo=null;
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            userInfo=objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            FileUtils.writeStringToFile(new File("testdata\\userInfo.json"),userInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
