package com.csvconverter.scc.service;

public class JsonOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole() {
        System.out.println("JSON is being formatted!");
    }
}
