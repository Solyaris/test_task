package org.eagleinvsys.test.converters.impl;

import org.eagleinvsys.test.converters.ConvertibleMessage;

import java.util.LinkedHashMap;
import java.util.Map;

public class Message extends LinkedHashMap<String, String> implements ConvertibleMessage {

    public Message(Map<? extends String, ? extends String> m) {
        super(m);
    }

    @Override
    public String getElement(String elementId) {
        return this.get(elementId);
    }
}
