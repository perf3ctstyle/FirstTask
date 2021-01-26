package com.epam.task.first.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> readData(String filename) throws DataException {
        List<String> processedLines = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processedLines.add(line);
            }
        } catch (IOException e) {
            throw new DataException("The file hasn't been found!", e, filename);
        }
        return processedLines;
    }
}
