package com.csvconverter.scc.service;

import com.csvconverter.scc.data.User;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<User> userList) {
        System.out.println("XML is being formatted!");


        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xmlBuilder.append("<users>\n");

        for (User user : userList) {
            xmlBuilder.append("  <user>\n");
            xmlBuilder.append("    <username>").append(user.getUsername()).append("</username>\n");
            xmlBuilder.append("    <id>").append(user.getId()).append("</id>\n");
            xmlBuilder.append("    <firstName>").append(user.getFirstName()).append("</firstName>\n");
            xmlBuilder.append("    <lastName>").append(user.getLastName()).append("</lastName>\n");
            xmlBuilder.append("  </user>\n");
        }

        xmlBuilder.append("</users>");

        System.out.println(xmlBuilder.toString());
    }
}
