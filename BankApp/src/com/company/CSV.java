package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    //Read data from CSV file and return as a list
    public static List<String[]> readFile(String file){
        List<String[]> data = new LinkedList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String dataRow;
                        while ((dataRow = bufferedReader.readLine()) != null) {
                            String[] dataRecords = dataRow.split(",");
                            data.add(dataRecords);
                        }

            } catch (IOException e) {
                System.out.println("Could not read file");
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return data;
    }
}
