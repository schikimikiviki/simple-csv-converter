package com.csvconverter.scc.service;

import com.csvconverter.scc.data.OutputFormat;
import com.csvconverter.scc.data.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SimpleCsvConverter {

    public void convert (String inputString, OutputFormat outputFormat) throws IOException {

        if (outputFormat == null) {
            //default
            outputFormat = OutputFormat.TABLE;
            System.out.println("input detected, output is default");

        } else {
            System.out.println("input and output detected");
        }


        inputReader inputReader = new inputReader();
        List<User> userList = inputReader.readData(inputString);
        System.out.println(userList);
        OutputFormatter formatter = OutputFormatterFactory.createByFormat(outputFormat);

        String data = "";
        formatter.printToConsole(data);

        System.out.println("Conversion complete");
    }
}
