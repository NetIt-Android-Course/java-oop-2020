package com.netit.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileManager {

    private static final String SCORE_FILE_DIR = "leaderboard.txt";
    private static final String TEMPERATURE_FILE_DIR = "temperatures.txt";
    private static FileManager instance;

    public static FileManager getInstance() {
        if(instance == null) instance = new FileManager();
        return instance;
    }

    private FileManager(){

    }

    public void writeScore(String name, int score) {
        try {
            writeScoreUnsafely(name, score);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeTemperature(int temp) {
        try {
            writeTemperatureUnsafely(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeScoreUnsafely(String name, int score) throws IOException {
        Writer writer = new FileWriter(SCORE_FILE_DIR, true);
        writer
                .append(name)
                .append(" - ")
                .append(String.valueOf(score))
                .append("\n");
        writer.close();
    }

    private void writeTemperatureUnsafely(int temperature) throws IOException {
        Writer writer = new FileWriter(TEMPERATURE_FILE_DIR, true);
        writer
                .append(String.valueOf(temperature))
                .append("\n");
        writer.close();
    }
}
