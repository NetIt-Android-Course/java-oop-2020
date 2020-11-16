package com.netit;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        tryCatchDemo();
//        readTextFileDemoSafely();
//        writeTextDemo();
        reorderNamesTask();
    }

    private static void reorderNamesTask() {
        BufferedReader nameReaderStream = null;
        BufferedWriter nameWriterStream = null;
        try {
            Path outputFilePath = Path.of("namesAtoZ.txt");
            nameWriterStream = new BufferedWriter(new FileWriter(outputFilePath.toAbsolutePath().toString()));
            nameReaderStream = new BufferedReader(new FileReader("c:\\Users\\teodo\\Desktop\\javatest.txt")); //C:\Users\teodo\Desktop

            List<String> namesInAz = nameReaderStream
                    .lines()
                    .sorted()
                    .collect(Collectors.toList());

            BufferedWriter finalNameWriterStream = nameWriterStream;
            namesInAz.forEach(s -> {
                try {
                    finalNameWriterStream.write(s);
                    finalNameWriterStream.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStreamSafely(nameWriterStream);
            closeStreamSafely(nameReaderStream);
        }
    }

    private static void writeTextDemo() {
        Writer os = null;
        try {
            os = new FileWriter("helloyou.txt");
            os.write("Нищо не става!");
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readTextFileDemoSafely() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader("c:\\Users\\teodo\\Desktop\\javatest.txt"))) {
             //C:\Users\teodo\Desktop
            String data;
            while ((data = inputStream.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void closeStreamSafely(Reader inputStream) {
        try {
            if (inputStream != null) inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void closeStreamSafely(Writer inputStream) {
        try {
            if (inputStream != null) inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void tryCatchDemo() {
        while (true) {
            System.out.println("---");
            try {
                Thread.sleep(5000);
                getText().toString();
                System.out.println("no error is thrown");
            } catch (InterruptedException | NullPointerException exception) {
                System.out.println(exception.toString());
            } finally {
                System.out.println("prints every time");
            }
        }
    }

    public static String getText() {
        return null;
    }
}
