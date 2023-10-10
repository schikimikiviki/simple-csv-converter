package com.csvconverter.scc.service;

import com.csvconverter.scc.data.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OutputFormatter {

     void printToConsole(List<User> userList);

}
