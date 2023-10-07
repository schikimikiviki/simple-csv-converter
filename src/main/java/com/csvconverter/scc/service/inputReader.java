package com.csvconverter.scc.service;

import com.csvconverter.scc.data.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class inputReader {

    public List<User> readData(String filePath) throws IOException {
        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    // Skip the header line
                    firstLine = false;
                    continue;
                }

                String[] userData = line.split(";");

                if (userData.length >= 4) {
                    String username = userData[0];
                    int identifier = Integer.parseInt(userData[1]);
                    String firstName = userData[2];
                    String lastName = userData[3];

                    User user = new User(username, identifier, firstName, lastName);
                    users.add(user);
                }
            }
        }
        System.out.println("Data is being read");

        return users;
    }
}
