package com.unitedcoder.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReadDemo {
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        Users loginUser=null;
        try {
           loginUser=objectMapper.readValue(new File("testdata\\loginUsers.json"),Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<User> users=loginUser.getUsers();
        for(User user:users){
            System.out.println(String.format("%s %s %s %s",
                    user.getUsername(),
                    user.getPassword(),
                    user.getUsertype(),
                    user.getAge()
            ));
        }
    }
}
