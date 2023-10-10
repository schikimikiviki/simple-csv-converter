package com.csvconverter.scc.service;

import com.csvconverter.scc.data.OutputFormat;
import org.springframework.stereotype.Component;

@Component
public class OutputFormatterFactory {

    public static OutputFormatter createByFormat(OutputFormat outputFormat) {
        return switch (outputFormat) {
            case JSON -> new JsonOutputFormatter();
            case XML -> new XmlOutputFormatter();
            case TABLE -> new TableOutputFormatter();
            default -> throw new IllegalArgumentException("Unsupported output format: " + outputFormat);
        };
    }
}
