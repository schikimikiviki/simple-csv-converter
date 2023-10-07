package com.csvconverter.scc.service;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(String outputFormat) {
        return switch (outputFormat.toLowerCase()) {
            case "json" -> new JsonOutputFormatter();
            case "xml" -> new XmlOutputFormatter();
            case "table" -> new TableOutputFormatter();
            default -> throw new IllegalArgumentException("Unsupported output format: " + outputFormat);
        };
    }
}
