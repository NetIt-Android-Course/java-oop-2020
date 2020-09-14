package com.netit;

import java.util.List;

public class BarMap {

    private char[][] map;
    private LatLng middleCoordinate;

    public BarMap(int width, int height) {
        width = width % 2 == 0 ? (width + 1) : width;
        height = height % 2 == 0 ? (height + 1) : height;
        this.map = new char[width][height];
        fillMap(map);
    }

    private void fillMap(char[][] map) {
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[0].length; col++) {
                map[col][row] = ' ';
            }
        }
    }

    public void print() {
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[0].length; col++) {
                System.out.print(map[col][row]);
            }
            System.out.println();
        }
    }

    public void setMiddlePointCoordinate(LatLng middleCoord) {
        this.middleCoordinate = middleCoord;
        map[map[0].length / 2][map.length / 2] = 'X';
    }

    public void addPins(List<Bar> pins) {
        int index = 0;
        for (MapPin pin : pins) {
            addPin((char) ('A' + index), pin);
            index++;
        }
    }

    private void addPin(char index, MapPin pin) {
        int deltaX = (int) (middleCoordinate.latitude - pin.getLocation().latitude);
        int deltaY = (int) (middleCoordinate.longtitude - pin.getLocation().longtitude);
        int middleX = map[0].length / 2;
        int middleY = map.length / 2;
        map[middleX + deltaX][middleY + deltaY] = index;
    }
}
