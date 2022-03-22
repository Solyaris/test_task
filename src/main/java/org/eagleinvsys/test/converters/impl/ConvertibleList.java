package org.eagleinvsys.test.converters.impl;

import org.eagleinvsys.test.converters.ConvertibleCollection;
import org.eagleinvsys.test.converters.ConvertibleMessage;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ConvertibleList extends LinkedList<Map<String, String>> implements ConvertibleCollection {
    public ConvertibleList(Collection<? extends Map<String, String>> c) {
        super(c);
    }

    @Override
    public Collection<String> getHeaders() {

        return this.getFirst().keySet();
    }

    @Override
    public Iterable<ConvertibleMessage> getRecords() {
        List<ConvertibleMessage> messageList = new LinkedList<>();
        for (Map<String, String> map : this) {
            messageList.add(new Message(map));
        }
        return messageList;

    }
}
