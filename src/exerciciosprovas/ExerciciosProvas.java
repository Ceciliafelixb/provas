/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosprovas;

import java.util.Scanner;

public class ExerciciosProvas {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        final int NumeroAlunos = 10;
        String[] Nome = new String[NumeroAlunos];
        double[] P1 = new double[NumeroAlunos];
        double[] P2 = new double[NumeroAlunos];
        double[] P3 = new double[NumeroAlunos];
        double[] P4 = new double[NumeroAlunos];
        double[] P5 = new double[NumeroAlunos];
        int i;
        double cont;
        //Entrada de Dados
        for (i = 0; i < NumeroAlunos; i++) {
            System.out.println("------------------------------------");
            System.out.print("Entre com o Nome do Aluno [" + (i + 1) + "]");
            Nome[i] = Teclado.next();

            System.out.print("Entre com a nota da Prova 1 [" + (i + 1) + "]");
            P1[i] = Teclado.nextDouble();
            System.out.print("Entre com a nota da Prova 2 [" + (i + 1) + "]");
            P2[i] = Teclado.nextDouble();
            System.out.print("Entre com a nota da Prova 3 [" + (i + 1) + "]");
            P3[i] = Teclado.nextDouble();
            System.out.print("Entre com a nota da Prova 4 [" + (i + 1) + "]");
            P4[i] = Teclado.nextDouble();
            System.out.print("Entre com a nota da Prova 5 [" + (i + 1) + "]");
            P5[i] = Teclado.nextDouble();

        }
        //Processamento de Dados

        for (i = 0; i < NumeroAlunos; i++) {
            if ((P1[i] >= 6) && (P2[i] >= 6) && (P3[i] >= 6) && (P4[i] >= 6) && (P5[i] >= 6)) {

                System.out.println("Aprovado em todas as provas=" + Nome[i]);

            }
        }
            for (i = 0; i < NumeroAlunos; i++) {
                if ((P1[i] >= 6) && (P4[i] >= 6)) {
                    System.out.println(" Foi Aprovado Apenas na Prova 1 e 4=" + Nome[i]);
                }
            }
                cont = 0;
        for (i = 0; i < NumeroAlunos; i++) {
                if (P3[i]>=6){
                    cont++;
                }                
        }
                    System.out.println("A porcentagem dos que acertaram a PROVA 3 é igual a=" + (100*cont/NumeroAlunos));
                }
                 
            
        }
    

