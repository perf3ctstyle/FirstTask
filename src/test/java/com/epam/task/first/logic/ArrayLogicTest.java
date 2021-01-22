package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLogicTest {

    private final ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testShouldFindMaxWhenPositiveNumbersApplied() {
        // given
        Array array = new Array(1, 3, 2);

        // when
        int actual = arrayLogic.findMaxElement(array);

        // then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testShouldFindMaxWhenNegativeNumbersApplied() {
        // given
        Array array = new Array(-5, -1, -3);

        // when
        int actual = arrayLogic.findMaxElement(array);

        // then
        Assert.assertEquals(-1, actual);
    }

   @Test
    public void testShouldFindMaxWhenNoNumbersApplied() {
        // given
        Array array = new Array();

        // when
        double actual = arrayLogic.findMaxElement(array);

        // then
    }

    @Test
    public void testShouldFindAverageWhenPositiveNumbersApplied() {
        // given
        Array array = new Array(5, 4, 8);

        // when
        double actual = arrayLogic.findAverage(array);

        // then
        Assert.assertEquals(17/3.0f, actual, 0.1);
    }

    @Test
    public void testShouldFindAverageWhenNegativeNumbersApplied() {
        // given
        Array array = new Array(-2, -3, -4);

        // when
        double actual = arrayLogic.findAverage(array);

        // then
        Assert.assertEquals(-9/3.0f, actual, 0.1);
    }

    @Test
    public void testShouldFindAverageWhenNoNumbersApplied() {
        // given
        Array array = new Array();

        // when
        double actual = arrayLogic.findAverage(array);

        // then
        Assert.assertEquals(Double.NaN, actual, 0);
    }

    @Test
    public void shouldFindSumWhenPositiveNumbersApplied() {
        // given
        Array array = new Array(1, 9, 5);

        // when
        int actual = arrayLogic.findSum(array);

        // then
        Assert.assertEquals(15, actual);
    }

    @Test
    public void shouldFindSumWhenNegativeNumbersApplied() {
        // given
        Array array = new Array(-1, -4, -6);

        // when
        int actual = arrayLogic.findSum(array);

        // then
        Assert.assertEquals(-11, actual);
    }

    @Test
    public void shouldFindSumWhenNoNumbersApplied() {
        // given
        Array array = new Array();

        // when
        int actual = arrayLogic.findSum(array);

        // then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void shouldFindNumOfPositiveNumsWhenPositiveNumsApplied() {
        // given
        Array array = new Array(1, 3, 8, 1);

        // when
        int actual = arrayLogic.findNumOfPositiveNumbers(array);

        // then
        Assert.assertEquals(4, actual);
    }

    @Test
    public void shouldFindNumOfPositiveNumsWhenNegativeNumsApplied() {
        // given
        Array array = new Array(-1, -3, -5, -9);

        // when
        int actual = arrayLogic.findNumOfPositiveNumbers(array);

        // then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void shouldFindNumOfPositiveNumsWhenPosNNegatNumsApplied() {
        // given
        Array array = new Array(2, -2, 3, -3, -5, -9, 10, 9);

        // when
        int actual = arrayLogic.findNumOfPositiveNumbers(array);

        // then
        Assert.assertEquals(4, actual);
    }

    @Test
    public void shouldChangeSignOfNumsWhenPositiveNumsApplied() {
        // given
        Array array = new Array(2, 3, 4);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(-2, -3, -4));

        // when
        List<Integer> actual = arrayLogic.changeSignOfNumbers(array);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSignOfNumsWhenNegativeNumsApplied() {
        // given
        Array array = new Array(-5, -2, -1);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(5, 2, 1));

        // when
        List<Integer> actual = arrayLogic.changeSignOfNumbers(array);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSignOfNumsWhenNullsApplied() {
        // given
        Array array = new Array(0, 0, 0);
        List<Integer> expected = new ArrayList();
        expected.addAll(Arrays.asList(0, 0, 0));

        // when
        List<Integer> actual = arrayLogic.changeSignOfNumbers(array);

        // then
        Assert.assertEquals(expected, actual);
    }
}
