package com.languagelearnquiz.webquiz.game.CSV.CSVFileWithRecords;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CSVFileWithRecords {
    @Value("classpath:files/CSV/records.csv")
    static Resource fileResource;
    static String fileName = "src/main/resources/files/CSV/records.csv";
    static String[] header = new String[]{"User","Number of Words Given","Type of Game","Using Parts of Speech","Achieved Points","Time of the Record"};
    //User,Number of Words Given,Type of Game,Using Parts of Speech,Achieved Points,Time of the Record

    static List<String[]> words;
    @PostConstruct
    void init() throws IOException {
        words = getWords();
    }

    private List<String[]> getWords() {
//        try {
//            CSVReader csvreader = new CSVReader(new FileReader(fileResource.getFile()));
//            return csvreader.readAll();
//        } catch (IOException e){
//            throw new RuntimeException("Could not find file", e);
//        }
        try {
            CSVReader csvreader = new CSVReader(new FileReader(fileName));
            return csvreader.readAll();
        } catch (IOException e){
            throw new RuntimeException("Could not find file", e);
        }
    }


//    public static void makeRecord(String[] record) {
//        try {
//            CSVWriter writer = new CSVWriter(new FileWriter(fileResource.getFile(), true));
//            writer.writeNext(record);
//            writer.close();
//        } catch (IOException e){
//            throw new RuntimeException("Could not find file", e);
//        }
//    }

    public static List<String[]> getRecords() {
        return words;
    }

    public static List<String> getUsernames() {
        // When game is being setup, user chooses a username and usernames cannot repeat,
        // so program needs to know what usernames are already taken
        List<String[]> records = getRecords();
        List<String> usernames = new ArrayList<>();
        records.forEach(i -> usernames.add(i[0]));
        return usernames;
    }
}
