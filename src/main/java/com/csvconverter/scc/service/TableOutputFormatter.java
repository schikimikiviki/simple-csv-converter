package com.csvconverter.scc.service;

import com.csvconverter.scc.data.User;

import java.util.List;

public class TableOutputFormatter implements OutputFormatter {



    @Override
    public void printToConsole(List<User> userList) {
        System.out.println("Table is being formatted");

        if (userList.isEmpty()) {
            System.out.println("No data to format.");
            return;
        }


        System.out.println("| Username | ID    | First Name | Last Name |");
        System.out.println("|----------|-------|------------|-----------|");


        for (User user : userList) {
            System.out.printf("| %-8s | %-5d | %-10s | %-9s |\n",
                    user.getUsername(), user.getId(), user.getFirstName(), user.getLastName());
        }
    }
}
