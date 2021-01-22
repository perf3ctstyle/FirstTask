package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArrayLogic {

    private void arrayEmtpinessCheck(List<Integer> elements) {
        if (elements.size() == 0) {
            throw new IllegalArgumentException("Array is empty!");
        }
    }

    public int findMaxElement(Array array) {
        List<Integer> elements = array.getElements();
        arrayEmtpinessCheck(elements);
        int maxElement = elements.get(0);
        for (int element : elements) {
            if (maxElement < element) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    public double findAverage(Array array) {
        List<Integer> elements = array.getElements();
        double average = 0;
        for (double element : elements) {
            average+=element;
        }
        average/=elements.size();
        return average;
    }

    public int findSum(Array array) {
        List<Integer> elements = array.getElements();
        int sum = 0;
        for (int element : elements) {
            sum+=element;
        }
        return sum;
    }

    public int findNumOfPositiveNumbers(Array array) {
        List<Integer> elements = array.getElements();
        int num = 0;
        for (int element : elements) {
            if (element > 0) {
                num++;
            }
        }
        return num;
    }

    public List<Integer> changeSignOfNumbers(Array array) {
        List<Integer> elements = array.getElements();
        int i = 0;
        for (int element : elements) {
            elements.set(i, -element);
            i++;
        }
        return elements;
    }
}
