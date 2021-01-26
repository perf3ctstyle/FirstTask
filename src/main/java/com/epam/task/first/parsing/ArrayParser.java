package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayParser {

    public Array create(String data) {
        List<Integer> elements = new ArrayList();
        for (String part : data.split("\\s")) {
            elements.add(Integer.parseInt(part));
        }
        Array array = new Array(elements);
        return array;
    }
}
