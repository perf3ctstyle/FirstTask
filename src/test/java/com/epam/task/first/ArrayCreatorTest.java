package com.epam.task.first;

import com.epam.task.first.ArrayCreator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final DataReader dataReader = Mockito.mock(DataReader.class);
    private final ArrayValidator validator = Mockito.mock(ArrayValidator.class);
    private final ArrayParser parser = Mockito.mock(ArrayParser.class);

    private final ArrayCreator creator = new ArrayCreator(dataReader, validator, parser);

    private final static List<String> TEST_DATA_1 = Arrays.asList("1 2 3", "1 2 4 11");
    private final static List<String> TEST_DATA_2 = Arrays.asList("2 4 9 1 2", "1 1 1 1", "1111 3 5 7");

    @Test
    public void testShouldCreateArrayConsistingOfTwoIntegerLists() throws DataException {
        when(dataReader.readData(anyString())).thenReturn(TEST_DATA_1);
        when(validator.validate(anyString())).thenReturn(true);

        Array expectedArray1 = new Array(1, 2, 3);
        Array expectedArray2 = new Array(1, 2, 4, 11);

        when(parser.create("1 2 3")).thenReturn(expectedArray1);
        when(parser.create("1 2 4 11")).thenReturn(expectedArray2);

        List<Array> expectedList = new ArrayList();
        expectedList.add(expectedArray1);
        expectedList.add(expectedArray2);

        List<Array> actualList = creator.process(anyString());

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void testShouldCreateArrayConsistingOfThreeIntegerLists() throws DataException {
        when(dataReader.readData(anyString())).thenReturn(TEST_DATA_2);
        when(validator.validate(anyString())).thenReturn(true);

        Array expectedArray1 = new Array(2, 4, 9, 1, 2);
        Array expectedArray2 = new Array(1, 1, 1, 1);
        Array expectedArray3 = new Array(1111, 3, 5, 7);

        when(parser.create("2 4 9 1 2")).thenReturn(expectedArray1);
        when(parser.create("1 1 1 1")).thenReturn(expectedArray2);
        when(parser.create("1111 3 5 7")).thenReturn(expectedArray3);

        List<Array> expectedList = new ArrayList();
        expectedList.add(expectedArray1);
        expectedList.add(expectedArray2);
        expectedList.add(expectedArray3);

        List<Array> actualList = creator.process(anyString());

        Assert.assertEquals(expectedList, actualList);
    }
}
