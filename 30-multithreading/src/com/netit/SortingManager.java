package com.netit;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class SortingManager {

    public static List<String> getSortedList(BufferedReader readerStream) {
        return readerStream
                .lines()
                .sorted()
                .collect(Collectors.toList());
    }
}
