/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author UTN
 */
public class Cartoon {

    public static void main(String[] args) {
        int Cartoon[][] = new int[5][5];
        fillCartoon(Cartoon);
        PrintCartoon(Cartoon);
    }

    public static void PrintCartoon(int Cartoon[][]) {
        for (int f = 0; f < Cartoon.length; f++) {
            for (int c = 0; c < Cartoon[0].length; c++) {
                if (Cartoon[f][c] < 10) {
                    System.out.print(" " + Cartoon[f][c] + "  ");
                } else {
                    System.out.print(Cartoon[f][c] + "  ");
                }
            }
            System.out.println("");
        }

    }

    public static void fillCartoon(int Cartoon[][]) {
        for (int f = 0; f < Cartoon.length; f++) {
            for (int c = 0; c < Cartoon[0].length; c++) {
                switch (f) {
                    case 0: //Rango de 1 a 15
                        Cartoon[c][f] = (int) (Math.random() * 15) + 1;
                        break;
                    case 1: //Rango de 16 a 30
                        Cartoon[c][f] = (int) (Math.random() * 15) + 16;
                        break;
                    case 2: //Rango de 31 a 45
                        Cartoon[c][f] = (int) (Math.random() * 15) + 31;
                        break;
                    case 3: //Rango de 46 a 60
                        Cartoon[c][f] = (int) (Math.random() * 15) + 46;
                        break;
                    case 4: //Rango de 61 a 75
                        Cartoon[c][f] = (int) (Math.random() * 15) + 61;
                        break;
                }
            }

        }
    }
}
