package com.netit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainController {

    private LatLng userLocation = new LatLng(5, 5);
    private SimpleTime userTime = new SimpleTime(22, 0);

    public void start() {
        int userOption;

        do {
            printUserOptions();
            userOption = getOptionFromUser();
            switch (userOption) {
                case 1 -> showNearbyBars();
                case 2 -> showOpenBars();
                case 3 -> showBarMap();
            }
        } while (userOption != 4);
    }

    private void showBarMap() {
        BarMap map = new BarMap(10, 10);
        map.setMiddlePointCoordinate(userLocation);
        map.addPins(BarRepository.getInstance().getBars());
        map.print();
    }

    private void showOpenBars() {
        List<Bar> barsByWorkingHours = new ArrayList<>();
        barsByWorkingHours.addAll(BarRepository.getInstance().getBars());
        barsByWorkingHours.removeIf(bar -> !bar.getWorkingHours().isOpenAt(userTime));
        print(barsByWorkingHours);
    }

    private void showNearbyBars() {
        List<Bar> barsByLocation = new ArrayList<>();
        barsByLocation.addAll(BarRepository.getInstance().getBars());
        Collections.sort(barsByLocation, (bar1, bar2) -> {
            double dist1 = bar1.getLocation().distanceTo(userLocation);
            double dist2 = bar2.getLocation().distanceTo(userLocation);
            return dist1 > dist2 ? 1 : -1;
        });
        print(barsByLocation);
    }

    private void print(List<Bar> barsByLocation) {
        int index = 1;
        for (Bar b : barsByLocation) {
            System.out.print(index + ". ");
            System.out.print(b.toString());
            System.out.println(" ----> " + b.getLocation().distanceTo(userLocation));
            index++;
        }
    }

    private int getOptionFromUser() {
        return new Scanner(System.in).nextInt();
    }

    private void printUserOptions() {
        System.out.println("1 -> see all bars nearby");
        System.out.println("2 -> see all open bars");
        System.out.println("3 -> see all bars on a map");
        System.out.println("4 -> exit");
    }
}
