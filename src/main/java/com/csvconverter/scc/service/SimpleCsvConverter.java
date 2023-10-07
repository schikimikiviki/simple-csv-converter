package com.csvconverter.scc.service;

import com.csvconverter.scc.data.OutputFormat;
import com.csvconverter.scc.data.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SimpleCsvConverter {

    public void convert (String inputString, OutputFormat outputFormat) throws IOException {

        if (outputFormat == null) {
            outputFormat = OutputFormat.TABLE;
        }


        inputReader inputReader = new inputReader();
        List<User> userList = inputReader.readData(inputString);
        OutputFormatter formatter = OutputFormatterFactory.createByFormat(outputFormat);

        formatter.printToConsole(userList);

        System.out.println("Conversion complete");
    }
}
