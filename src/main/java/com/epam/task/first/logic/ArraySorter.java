package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArraySorter {

    public List<Integer> swap(List<Integer> elements, int i) {
        int biggerNumber = elements.get(i-1);
        int smallerNumber = elements.get(i);
        elements.set(i, biggerNumber);
        elements.set(i-1, smallerNumber);
        return elements;
    }

    public List<Integer> bubbleSort(Array array) {
        List<Integer> elements = array.getElements();
        int numberOfElements = elements.size();
        do {
            int swappedNumberNo = 0;
            for (int i=1; i<=numberOfElements-1; i++) {
                if (elements.get(i-1) > elements.get(i)) {
                    elements = swap(elements, i);
                    swappedNumberNo = i;
                }
            }
            numberOfElements = swappedNumberNo;
        } while (numberOfElements>1);
        return elements;
    }

    public List<Integer> insertSort(Array array) {
        List<Integer> elements = array.getElements();
        int numberOfElements = elements.size();
        int i = 1;
        int j;
        while (i<numberOfElements) {
            j = i;
            while (j>0 && elements.get(j-1) > elements.get(j)) {
                elements = swap(elements, j);
                j-=1;
            }
            i++;
        }
        return elements;
    }

    public List<Integer> selectSort(Array array) {
        List<Integer> elements = array.getElements();
        int numberOfElements = elements.size();
        int i, j;
        for (i=0; i<numberOfElements-1; i++) {
            int minElementIndex = i;
            for (j=i+1; j<numberOfElements; j++) {
                if (elements.get(j) < elements.get(minElementIndex)) {
                    minElementIndex = j;
                }
            }
            if (minElementIndex != i) {
                int biggerNumber = elements.get(i);
                int smallerNumber = elements.get(minElementIndex);
                elements.set(minElementIndex, biggerNumber);
                elements.set(i, smallerNumber);
            }
        }
        return elements;
    }
}
