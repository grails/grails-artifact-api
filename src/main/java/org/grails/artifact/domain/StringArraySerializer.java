package org.grails.artifact.domain;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class StringArraySerializer extends StdSerializer<String> {

    StringArraySerializer() {
        this(null);
    }

    protected StringArraySerializer(Class<String> t) {
        super(t);
    }

    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider provider) throws IOException {

        gen.writeStartArray();
        if (value != null) {

            if (value.contains(";")) {
                String[] segments = value.split(";");
                for (String arg : segments) {
                    gen.writeString(arg);
                }
            } else {
                gen.writeString(value);
            }

        }
        gen.writeEndArray();
    }
}
