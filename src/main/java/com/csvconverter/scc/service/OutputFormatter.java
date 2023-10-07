package com.csvconverter.scc.service;

import com.csvconverter.scc.data.User;

import java.util.List;

public interface OutputFormatter {

     void printToConsole(List<User> userList);

}
