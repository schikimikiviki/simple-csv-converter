package com.csvconverter.scc.service;

public class TableOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(String data) {
        System.out.println("Table is being formatted");
    }

}
