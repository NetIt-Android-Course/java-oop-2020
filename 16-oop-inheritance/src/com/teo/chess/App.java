package com.teo.chess;

import java.util.Scanner;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        while (true) {
            board.printBoard();
            System.out.println("Enter figure column and row and new position column and row");
            String[] userInput = scanner.nextLine().split(" ");

            Integer[] input = Stream.of(userInput).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

            if(!board.moveFigure(input[0], input[1], input[2], input[3])) {
                System.out.println("Move is illegal");
            }
        }
    }
}
