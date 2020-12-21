package com.project.regex;

public class TicTicToeGame {
    public  static void main(String[]args){
        System.out.println("Welcome to Tic Tac Toe Game");
        char[] board= createBoard();
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
    }