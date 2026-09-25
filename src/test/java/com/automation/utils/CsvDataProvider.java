package com.automation.utils;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvDataProvider {

    @DataProvider(name = "loginData")
    public static Object[][] getLoginData() throws IOException, CsvValidationException {
        String csvFile = System.getProperty("user.dir") + "/src/test/resources/testdata/login-data.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        
        // Skip header
        reader.readNext();
        
        List<Object[]> dataList = new ArrayList<>();
        String[] line;
        while ((line = reader.readNext()) != null) {
            dataList.add(new Object[]{line[0], line[1]});
        }
        reader.close();
        
        Object[][] data = new Object[dataList.size()][2];
        for (int i = 0; i < dataList.size(); i++) {
            data[i] = dataList.get(i);
        }
        return data;
    }
}
