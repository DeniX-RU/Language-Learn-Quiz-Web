package com.languagelearnquiz.webquiz.game.CSV.CSVFileWithRecords;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

class CSVFileWithRecordsTest {
    @Value("classpath:files/CSV/records.csv")
    static Resource fileResource;

    @Test
    void getRecords() {
        System.out.println(fileResource);
//        try {
//            CSVReader csvreader = new CSVReader(new FileReader(fileResource.getFile()));
//            return csvreader.readAll();
//        } catch (IOException e){
//            throw new RuntimeException("Could not find file", e);
//        }
    }

//    @Test
//    List<String> getUsernames() {
//        // When game is being setup, user chooses a username and usernames cannot repeat,
//        // so program needs to know what usernames are already taken
//        List<String[]> records = getRecords();
//        List<String> usernames = new ArrayList<>();
//        records.forEach(i -> usernames.add(i[0]));
//        return usernames;
//    }
}
