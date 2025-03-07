package src;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java. io. FileReader;

public class MapToTextDemo {
    public static void main(String[] args) {
        Map<String, Integer> stockMap = new HashMap<String, Integer>();

        stockMap.put("apple", 10);
        stockMap.put("banan", 20);
        stockMap.put("cherry", 30);

        saveInFile(stockMap, "stock.txt");
        System.out.println(loadFromFile("stock.txt"));
    }


    public static void saveInFile(Map<String, Integer> stockMap, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("stock.txt"))) {
            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {
                bw.write(entry.getKey() + ":" + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Integer> loadFromFile(String filename){
        Map<String, Integer> result = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("stock.txt"))) {
            String line;
            while ((line = br.readLine()) != null){
                String[] tokens = line.split(":");
                String key = tokens[0];
                Integer value = Integer.parseInt(tokens[1]);
                result.put(key, value);

            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }



}
