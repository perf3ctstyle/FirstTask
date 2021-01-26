package com.epam.task.first.parsing;

public class ArrayValidator {

    public boolean validate(String line) {
        int i = 0;
        int length = line.length();
        while (i<length) {
            if ((line.charAt(i) < 48 || line.charAt(i) > 57 ) && line.charAt(i) != 32 && line.charAt(i) != 45) {
                return false;
            }
            i++;
        }
        return true;
    }
}
