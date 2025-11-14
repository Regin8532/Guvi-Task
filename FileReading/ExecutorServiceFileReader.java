package FileReading;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.*;

public class ExecutorServiceFileReader {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        String[] filePaths = {
                "src/oopsPractice/file1.txt",
                "src/oopsPractice/file2.txt",
                "src/oopsPractice/file3.txt"
        };

        for (String filePath : filePaths) {
            executorService.execute(() -> readFile(filePath));
        }

        executorService.shutdown();
    }

    private static void readFile(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(Thread.currentThread().getName() + ": " + line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }
    }
}
