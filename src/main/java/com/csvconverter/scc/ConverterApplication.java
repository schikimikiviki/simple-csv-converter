package com.csvconverter.scc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConverterApplication {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input file defined");
            return;
        }

        for (String arg : args) {
            System.out.println(arg);
        }

        SpringApplication.run(ConverterApplication.class, args);
    }

}
