package com.netit;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        reorderNamesTask();
    }

    private static void reorderNamesTask() {
        BufferedReader nameReaderStream = null;
        try {
            nameReaderStream = new BufferedReader(new FileReader("c:\\Users\\teodo\\Desktop\\javatest.txt")); //C:\Users\teodo\Desktop
            List<String> namesInAz = SortingManager.getSortedList(nameReaderStream);
            CustomWriter.writeLinesInFile(namesInAz, "namesAtoZ.txt", new CustomWriter.WriteListener() {
                @Override
                public void onWriteSuccess() {
                    System.out.println("yes, file written");
                }

                @Override
                public void onWriteFail() {
                    System.out.println("no, file not written");
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStreamSafely(nameReaderStream);
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
}
