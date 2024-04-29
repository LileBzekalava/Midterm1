package midterm.lile_bzekalava_1.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Set to store all different words
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);
        System.out.println("Set of Different Words: " + uniqueWords);

        // Map to store word length and frequency
        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }
        System.out.println("Word Length Map: " + wordLengthMap);

        // Update task4.txt file with the console output
        try {
            FileWriter writer = new FileWriter("task4.txt", true);
            writer.write("\n\nSet of Different Words: " + uniqueWords + "\n");
            writer.write("Word Length Map: " + wordLengthMap + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}





