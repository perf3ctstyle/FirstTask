package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySorterTest {

    private final ArraySorter arraySorter = new ArraySorter();

    @Test
    public void testShouldBubbleSortArrayWhenPositiveNumbersApplied() {
        Array array = new Array(9, 5, 1, 2, 3, 4, 6);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 9));

        List<Integer> actual = arraySorter.bubbleSort(array);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldBubbleSortArrayWhenRecurringNumbersApplied() {
        Array array = new Array(5, 3, 4, 3, 8, 7, 1, 8);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(1, 3, 3, 4, 5, 7, 8, 8));

        List<Integer> actual = arraySorter.bubbleSort(array);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldBubbleSortArrayWhenNegativeNumbersApplied() {
        Array array = new Array(1, -1, -2, 3, 6, 5, 9);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(-2, -1, 1, 3, 5, 6, 9));

        List<Integer> actual = arraySorter.bubbleSort(array);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldInsertSortArrayWhenPositiveNumbersApplied() {
        Array array = new Array(9, 5, 1, 2, 3, 4, 6);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 9));

        List<Integer> actual = arraySorter.insertSort(array);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldInsertSortArrayWhenRecurringNumbersApplied() {
        Array array = new Array(5, 3, 4, 3, 8, 7, 1, 8);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(1, 3, 3, 4, 5, 7, 8, 8));

        List<Integer> actual = arraySorter.insertSort(array);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldInsertSortArrayWhenNegativeNumbersApplied() {
        Array array = new Array(1, -1, -2, 3, 6, 5, 9);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(-2, -1, 1, 3, 5, 6, 9));

        List<Integer> actual = arraySorter.insertSort(array);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldSelectSortArrayWhenPositiveNumbersApplied() {
        Array array = new Array(9, 5, 1, 2, 3, 4, 6);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 9));

        List<Integer> actual = arraySorter.selectSort(array);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldSelectSortArrayWhenRecurringNumbersApplied() {
        Array array = new Array(5, 3, 4, 3, 8, 7, 1, 8);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(1, 3, 3, 4, 5, 7, 8, 8));

        List<Integer> actual = arraySorter.selectSort(array);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldSelectSortArrayWhenNegativeNumbersApplied() {
        Array array = new Array(1, -1, -2, 3, 6, 5, 9);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(-2, -1, 1, 3, 5, 6, 9));

        List<Integer> actual = arraySorter.selectSort(array);

        Assert.assertEquals(expected, actual);
    }
}
