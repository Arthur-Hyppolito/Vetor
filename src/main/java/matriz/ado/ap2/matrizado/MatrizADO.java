package matriz.ado.ap2.matrizado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class MatrizADO {

    public static void main(String[] args) {
        //exercicio 1
        int[][] Matriz = new int[2][3];
        Matriz = carregarNumeros(Matriz);
        int[][] Matriz2 = new int[2][3];
        Matriz2 = carregarNumeros(Matriz2);
        int[][] MatrizSoma = new int[2][3];
        MatrizSoma = SomaMatrizes(Matriz, Matriz2, MatrizSoma);

        //exercicio2
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de linhas e colunas da sua matriz:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] transposta = new int[x][y];
        transposta = carregarNumeros(transposta);
        transpostaDaMatriz(transposta);
        System.out.println("");
        // exercicio3

        int[][] mat = new int[2][3];
        mat = carregarNumeros(mat);
        mat = somaDosElementos(mat);
        
        //exercicio4
      System.out.println("");  
      diagonalPrincipalSomaElementosAbaixo();
       

    }

    private static int[][] carregarNumeros(int[][] Matriz) {
        Random rd = new Random();
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = rd.nextInt(10);
                System.out.printf(Matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        return Matriz;
    }

    private static int[][] SomaMatrizes(int[][] Matriz, int[][] Matriz2, int[][] MatrizSoma) {
        for (int i = 0; i < MatrizSoma.length; i++) {
            for (int j = 0; j < MatrizSoma[i].length; j++) {
                MatrizSoma[i][j] = Matriz[i][j] + Matriz2[i][j];
                System.out.printf(MatrizSoma[i][j] + "\t");
            }
            System.out.println("");
        }
        return Matriz;
    }

    private static int[][] transpostaDaMatriz(int[][] transposta) {

        int[][] transposta2 = new int[transposta[0].length][transposta.length];

        for (int i = 0; i < transposta2.length; i++) {
            for (int j = 0; j < transposta2[i].length; j++) {
                transposta2[i][j] = transposta[j][i];
                System.out.printf(transposta2[i][j] + "\t");
            }
            System.out.println("");
        }

        return transposta;
    }

    private static int[][] somaDosElementos(int[][] mat) {
        int soma = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                soma += mat[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz a cima e: " + soma);
        return mat;
    }

    private static void diagonalPrincipalSomaElementosAbaixo() {
        Random rd = new Random();
        int [][] mat = new int[4][4];
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rd.nextInt(10);
                System.out.printf(mat[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i>j){
                    soma += mat[i][j];
                }
            }
        }
        System.out.println("A soma dos elementos a baixo da diagonal principal e: " + soma);

    }

}
