package com.netit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

public class CustomWriter {

    /**
     * Writes list of texts in a file, each one on a new line
     * @param data the list to be written
     * @param filePath the path and file name
     * @return true if operation completes successfuly, false otherwise
     */
    public static void writeLinesInFile(List<String> data, String filePath, WriteListener listener) {
        new Thread(() -> {
            try {
                writeLinesInFileUnSafely(data, filePath);
                listener.onWriteSuccess();
            } catch (IOException e) {
                e.printStackTrace();
                listener.onWriteFail();
            }
        }).start();
    }

    private static void writeLinesInFileUnSafely(List<String> data, String filePath) throws IOException {
        BufferedWriter nameWriterStream = new BufferedWriter(new FileWriter(filePath));
        data.forEach(s -> {
            try {
                nameWriterStream.write(s);
                nameWriterStream.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public interface WriteListener {
        void onWriteSuccess();
        void onWriteFail();
    }
}
