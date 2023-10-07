package com.csvconverter.scc.service;

public class XmlOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(String data) {
        System.out.println("XML is being formatted!");
    }
}
