package com.company;

public class Main {

    public static void main(String[] args) {
        Sudoku.main(null);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TODO Auto-generated method stub
        int[][] array = GUI.readIn();
        int[][] sudoku = GUI.generate(array);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        new GUI(sudoku);
    }
}

