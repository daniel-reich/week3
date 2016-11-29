package com.MyInputOutput.Data;
import com.MyInputOutput.entities.$Book;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * Created by Daniel on 11/29/16.
 */
public class DataJson {
    private static DataJson instance = null;

    private static HashMap<String, $Book> booksHashMap;
    private static Path booksFilePath = Paths.get("/Users/Daniel/learnjava/week3/MyInputOutput/Book.json");

    private DataJson() {
        // Exists only to defeat instantiation.
    }

    public static synchronized DataJson getInstance() {
        if(instance == null) {
            instance = new DataJson();
        }
        return instance;
    }

    private static void checkLoaded() {
        if(booksHashMap==null || booksHashMap.isEmpty()) {
            loadDataCache();
        }
    }

    public static ArrayList<$Book> getBooks() {
        checkLoaded();
        return new ArrayList<>(booksHashMap.values());
    }

    public static $Book getBook(String bookTitle) {
        checkLoaded();
        $Book book = null;
        if(booksHashMap.containsKey(bookTitle)) {
            book = booksHashMap.get(bookTitle);
        }
        return book;
    }

    public static void setBook ($Book book) {
        checkLoaded();
        booksHashMap.put(book.getTitle()+"",book);
        saveAllToFiles();
    }



    private static void saveAllToFiles() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(Files.newOutputStream(booksFilePath), booksHashMap);
        } catch (IOException ioe) {
            System.out.println("Issue writing HashMaps to JSON files in DataCacheJson.saveAllToFiles()");
            ioe.printStackTrace();
        }
    }

    private static void loadDataCache() {
        if(!Files.exists(booksFilePath)) {
            initalLoadDataCache();
            saveAllToFiles();
        }
        try {
            ObjectMapper mapper = new ObjectMapper();
            booksHashMap = mapper.readValue(Files.newInputStream(booksFilePath), new TypeReference<HashMap<String,$Book>>(){});
        } catch (IOException ioe) {
            System.out.println("Issue reading HashMaps from JSON files in DataCacheJson.loadDataCache()");
            ioe.printStackTrace();
        }
    }

    private static void initalLoadDataCache() {
        booksHashMap = new HashMap<>();

        String bookTitle = "Huckleberry Finn";
        booksHashMap.put(bookTitle,new $Book(bookTitle,"Mark Twain","1847","Fiction"));

    }
}
