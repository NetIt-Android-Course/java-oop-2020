package com.netit;

import com.netit.pond.PondSimulator;
import com.netit.singleton.FileManager;
import com.netit.starbucks.Starbucks;
import com.netit.ui.LoginScreen;
import com.netit.weather.MainScreen;
import com.netit.weather.WeatherSource;

public class Main {

    public static void main(String[] args) {
//        new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                FileManager.getInstance().writeScore("Peter" + i, 10 + i);
//            }
//        }).start();
//
//        for (int i = 0; i < 1000; i++) {
//            FileManager.getInstance().writeScore("Ivan" + i, 10 + i);
//        }

//        PondSimulator pondSimulator = new PondSimulator();
//        pondSimulator.drawDucks();
////        pondSimulator.makeDucksSwim();
//        pondSimulator.makeDucksFly();

//        WeatherSource.getInstance().start();
//        new MainScreen();
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException exception) {
//            exception.printStackTrace();
//        }

//        new Starbucks();

        new LoginScreen();
    }

    public static void test(int...inputs) {
        int a = inputs[0];
    }

    public static void testDumb(int[] inputs) {
        int a = inputs[0];
    }

}
