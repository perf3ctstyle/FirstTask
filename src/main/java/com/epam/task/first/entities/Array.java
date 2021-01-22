package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    private final List<Integer> elements;

    public Array(List<Integer> elements) {
        this.elements = elements;
    }

    public Array(Integer... elements) {
        this.elements = new ArrayList();
        this.elements.addAll(Arrays.asList(elements));
    }

    public List<Integer> getElements() {
        return elements;
    }
}
