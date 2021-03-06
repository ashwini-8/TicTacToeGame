package com.project.regex;

import java.util.Arrays;
import java.util.Scanner;

public class TicTicToeGame {
    public  static void main(String[]args){
        System.out.println("Welcome to Tic Tac Toe Game");
        char[] board= createBoard();
        Scanner userInput = new Scanner(System.in);
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        showBoard(board);
        int userMove = getUserMove(board , userInput);
    }
    //uc1 - create empty 10 size array for board
    private static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        System.out.println(board);
        return board;
            }
    //uc2 - choose letter X or O
    private static char chooseUserLetter(Scanner userInput){
        System.out.println("Choose your letter");
        return userInput.next().toUpperCase().charAt(0);
        }
    //uc3 -print tic-tae-toe board
    public static void showBoard(char[] board) {
        System.out.println(" |  " + board[1] + "  |  " + board[2] + "  |  " + board[3] + "  |");
        System.out.println(" |-----|-----|-----| ");
        System.out.println(" |  " + board[4] + "  |  " + board[5] + "  |  " + board[6] + "  |");
        System.out.println(" |-----|-----|-----| ");
        System.out.println(" |  " + board[7] + "  |  " + board[8] + "  |  " + board[9] + "  |");
        }
    //uc4 - get user move
    private static int getUserMove(char [] board, Scanner userInput) {
        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (true) {
            System.out.println("What is your next move? (1-9): ");
            int index = userInput.nextInt();
            if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index))
                return index;
            }
        }
    public static boolean isSpaceFree(char[] gameBoard, int position) {
        return gameBoard[position] == ' ';
        }
    }