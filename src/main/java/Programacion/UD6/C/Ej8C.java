package Programacion.UD6.C;

import java.sql.SQLOutput;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Random;

public class Ej8C {
    public static void main(String[] args) {
        String[] paises = {"España", "Itália", "Alemania", "Francia"};
        int[][] arrayAlturas = new int[4][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                arrayAlturas[i][j] = 140 + (int) (Math.random() * ((140-210) + 1));
            }
        }
        arrayAlturas[0] = Arrays.stream(arrayAlturas[0]).sorted().toArray();
        arrayAlturas[1] = Arrays.stream(arrayAlturas[1]).sorted().toArray();
        arrayAlturas[2] = Arrays.stream(arrayAlturas[2]).sorted().toArray();
        arrayAlturas[3] = Arrays.stream(arrayAlturas[3]).sorted().toArray();
        int[] arrayMedia = new int[4];
        int media = 0;
        for (int i = 0; i < arrayAlturas.length; i++) {
            for (int j = 0; j < arrayAlturas[i].length; j++) {
                media += arrayAlturas[i][j];
            }
            arrayMedia[i] = media / 10;
        }
        int mediaP1 = arrayMedia[0];
        int mediaP2 = arrayMedia[1];
        int mediaP3 = arrayMedia[2];
        int mediaP4 = arrayMedia[3];
        int minP1 = arrayAlturas[0][0];
        int minP2 = arrayAlturas[1][0];
        int minP3 = arrayAlturas[2][0];
        int minP4 = arrayAlturas[3][0];
        int maxP1 = arrayAlturas[0][9];
        int maxP2 = arrayAlturas[1][9];
        int maxP3 = arrayAlturas[2][9];
        int maxP4 = arrayAlturas[3][9];
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t   MED MIN MAX");
        System.out.println(MessageFormat.format("\t{13}:\t{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t{6}\t{7}\t{8}\t{9}  | {10}  {11} {12}", arrayAlturas[0][0], arrayAlturas[0][1], arrayAlturas[0][2], arrayAlturas[0][3], arrayAlturas[0][4], arrayAlturas[0][5], arrayAlturas[0][6], arrayAlturas[0][7], arrayAlturas[0][8], arrayAlturas[0][9], mediaP1,minP1,maxP1, paises[0]));
        System.out.println(MessageFormat.format("\t{13}:\t{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t{6}\t{7}\t{8}\t{9}  | {10}  {11} {12}", arrayAlturas[1][0], arrayAlturas[1][1], arrayAlturas[1][2], arrayAlturas[1][3], arrayAlturas[1][4], arrayAlturas[1][5], arrayAlturas[1][6], arrayAlturas[1][7], arrayAlturas[1][8], arrayAlturas[1][9], mediaP2,minP2,maxP2, paises[1]));
        System.out.println(MessageFormat.format("  {13}:\t{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t{6}\t{7}\t{8}\t{9}  | {10}  {11} {12}", arrayAlturas[2][0], arrayAlturas[2][1], arrayAlturas[2][2], arrayAlturas[2][3], arrayAlturas[2][4], arrayAlturas[2][5], arrayAlturas[2][6], arrayAlturas[2][7], arrayAlturas[2][8], arrayAlturas[2][9], mediaP3,minP3,maxP3, paises[2]));
        System.out.println(MessageFormat.format("   {13}:\t{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t{6}\t{7}\t{8}\t{9}  | {10}  {11} {12}", arrayAlturas[3][0], arrayAlturas[3][1], arrayAlturas[3][2], arrayAlturas[3][3], arrayAlturas[3][4], arrayAlturas[3][5], arrayAlturas[3][6], arrayAlturas[3][7], arrayAlturas[3][8], arrayAlturas[3][9], mediaP4,minP4,maxP4, paises[3]));
    }
}
