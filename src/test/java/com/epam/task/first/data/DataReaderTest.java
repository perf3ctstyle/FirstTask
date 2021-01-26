package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private final DataReader reader = new DataReader();
    private final static String TEST_DATA = "./src/test/resources/input.txt";
    private final static String NON_EXISTENT_TEST_DATA = "./src/test/resources/doesntExist.txt";

    @Test
    public void testShouldReadLinesFromExistingFile() throws DataException {
        List<String> expected = new ArrayList();
        expected.addAll(Arrays.asList("2 5 7 0 1 2", "2g 1 9 3", "1 4 5 8z", "9 5 11 0 4"));

        List<String> actual = reader.readData(TEST_DATA);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldThrowExceptionBecauseOfNonExistentFile() {
        try {
            List<String> actual = reader.readData(NON_EXISTENT_TEST_DATA);
        } catch (DataException e) {
            System.out.println(e.getMessage());
        }
    }
}
