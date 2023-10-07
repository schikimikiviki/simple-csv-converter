package com.csvconverter.scc.service;

public class XmlOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole() {
        System.out.println("XML is being formatted!");
    }
}
