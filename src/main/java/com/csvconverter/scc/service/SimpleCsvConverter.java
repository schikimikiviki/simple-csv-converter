package com.csvconverter.scc.service;

import com.csvconverter.scc.data.OutputFormat;

import java.io.File;

public class SimpleCsvConverter {

    public void convert (File file, OutputFormat outputFormat){

        if (outputFormat == null) {
            //default
            outputFormat = OutputFormat.TABLE;
            System.out.println("input detected, output is default");

        } else {

            System.out.println("input and output detected");
        }



        System.out.println("I convert CSV to output format");
    }
}
