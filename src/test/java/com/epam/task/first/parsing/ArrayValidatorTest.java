package com.epam.task.first.parsing;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {
    ArrayValidator validator = new ArrayValidator();

    @Test
    public void testShouldValidateLineWhenLineHasSimpleDigits() {
        String line = "1 2 3 4";

        boolean actual = validator.validate(line);

        Assert.assertTrue(actual);
    }

    @Test
    public void testShouldValidateLineWhenLineHasComplexNumbers() {
        String line = "11 1231 11 22 44 66666";

        boolean actual = validator.validate(line);

        Assert.assertTrue(actual);
    }

    @Test
    public void testShouldValidateLineWhenLineIsnotCorrect() {
        String line = "1g 2 3f 55 6";

        boolean actual = validator.validate(line);

        Assert.assertFalse(actual);
    }

    @Test
    public void testShouldValidateWhenLineHasNegativeNumbers() {
        String line = "-11 11 2 -3 4 5 -1111";

        boolean actual = validator.validate(line);

        Assert.assertTrue(actual);
    }
}
