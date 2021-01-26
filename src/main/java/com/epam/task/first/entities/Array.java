package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Objects.equals(elements, array.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}
