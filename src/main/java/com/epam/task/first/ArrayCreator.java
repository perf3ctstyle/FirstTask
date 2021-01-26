package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private final DataReader dataReader;
    private final ArrayValidator validator;
    private final ArrayParser parser;

    public ArrayCreator(final DataReader dataReader, final ArrayValidator validator, final ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Array> process(String filename) throws DataException {
        List<String> processedLines = dataReader.readData(filename);
        int numOfProcessedLines = processedLines.size();
        for (int i=0; i<numOfProcessedLines; i++) {
            String lineToValidate = processedLines.get(i);
            if (!validator.validate(lineToValidate)) {
                processedLines.remove(i);
                numOfProcessedLines--;
            }
        }
        List<Array> receivedArrays = new ArrayList();
        for (int i=0; i<numOfProcessedLines; i++) {
            String lineToInitializeArray = processedLines.get(i);
            receivedArrays.add(parser.create(lineToInitializeArray));
        }
        return receivedArrays;
    }
}
