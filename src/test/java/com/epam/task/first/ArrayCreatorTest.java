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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private DataReader reader = new DataReader();
    private ArrayValidator validator = new ArrayValidator();
    private ArrayParser parser = new ArrayParser();

    private final ArrayCreator creator = new ArrayCreator(reader, validator, parser);

    private final static List<String> TEST_DATA = Arrays.asList("1 2 3", "1 2 4 11");
    private final static String TEST_PATH = "./src/test/resources/testfile.txt";

    @Test
    public void testShouldCreateArrayConsistingOfTwoIntegerLists() throws DataException {
        reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        Array expectedArray1 = new Array(1, 2, 3);
        Array expectedArray2 = new Array(1, 2, 4, 11);

        parser = Mockito.mock(ArrayParser.class);
        when(parser.create(anyString())).thenReturn(expectedArray1);

        List<Array> expectedList = new ArrayList();
        expectedList.add(expectedArray1);
        expectedList.add(expectedArray2);

        List<Array> actualList = creator.process(TEST_PATH);

        Assert.assertEquals(expectedList, actualList);
    }
}
