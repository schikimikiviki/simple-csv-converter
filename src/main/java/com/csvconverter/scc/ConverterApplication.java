package com.csvconverter.scc;

import com.csvconverter.scc.data.OutputFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ConverterApplication {

    public static void main(String[] args) {

        File inputFile = null;
        OutputFormat outputFormat = null;

        if (args.length == 0) {
            System.out.println("No input file defined");

        } else if (args.length == 1) {
            // Only the input file path is defined
            inputFile = new File(args[0]);
            System.out.println("Only input file defined");

        } else if (args.length == 2) {
            // Both input file path and output format are defined
            inputFile = new File(args[0]);
            outputFormat = OutputFormat.valueOf(args[1].toUpperCase());
            System.out.println("Both input and output files defined");

        } else {

            System.out.println("Invalid number of arguments");
        }

        System.out.println("Input File: " + inputFile);
        System.out.println("Output Format: " + outputFormat);
        return;

        //SpringApplication.run(ConverterApplication.class, args);
    }

}
