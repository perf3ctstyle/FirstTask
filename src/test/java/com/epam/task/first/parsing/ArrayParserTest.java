package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayParserTest {

    ArrayParser parser = new ArrayParser();

    @Test
    public void testShouldCreateArrayWhenGivenDataHasSimpleDigits() {
        String data = "3 5 1 2 4";
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(3, 5, 1, 2, 4));

        Array actual = parser.create(data);
        List<Integer> actualNumbers = actual.getElements();

        Assert.assertEquals(actualNumbers, expected);
    }

    @Test
    public void testShouldCreateArrayWhenGivenDataHasComplexNumbers() {
        String data = "311 52 1 24 491023";
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(311, 52, 1, 24, 491023));

        Array actual = parser.create(data);
        List<Integer> actualNumbers = actual.getElements();

        Assert.assertEquals(actualNumbers, expected);
    }

    @Test
    public void testShouldCreateArrayWhenGivenDataHasNegativeNumbers() {
        String data = "-1 2 3 -24 25";
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(-1, 2, 3, -24, 25));

        Array actual = parser.create(data);
        List<Integer> actualNumbers = actual.getElements();

        Assert.assertEquals(actualNumbers, expected);
    }
}
