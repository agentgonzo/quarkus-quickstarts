package org.acme.converters;

import org.eclipse.microprofile.config.spi.Converter;

public class DoNothingConverter implements Converter<String> {
    @Override
    public String convert(String value) {
        return value;
    }
}
