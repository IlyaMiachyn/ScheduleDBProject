package utils;

import java.io.*;

public class IFileReader {
    public static String readFile(File file) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            while (reader.ready()) {
                builder.append(reader.readLine());
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return builder.toString();
    }
}
