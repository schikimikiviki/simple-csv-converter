package com.csvconverter.scc.service;

import com.csvconverter.scc.data.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
@Component
public class JsonOutputFormatter implements OutputFormatter{

    @Override
    public void printToConsole(List<User> userList) {
        System.out.println("JSON is being formatted!");

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String json = objectMapper.writeValueAsString(userList);
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
