package br.senai.sp.diario;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Diario {
    public static void main(String[] args) {
        /** Declarar as variaveis */
        String professor;
        String disciplina;
        String nomeAluno;
        int frequencia;
        int nota1;
        int nota2;
        float media;


        /** Instanciar teclado Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Coletar dados */
        System.out.println("Olá Profº seja bem vindo!");
        System.out.println("Professor: ");
        professor = teclado.nextLine();
        System.out.println("Qual é sua disciplina: ");
        disciplina = teclado.nextLine();
        System.out.println("Qual o nome do Aluno: ");
        nomeAluno = teclado.nextLine();
        System.out.println("Qual é a frequência: ");
        frequencia = teclado.nextInt();
        System.out.println("Informe a nota 1: ");
        nota1 = teclado.nextInt();
        System.out.println("Informe a nota 2: ");
        nota2 = teclado.nextInt();


        /** Calcula a Média do Aluno */

        media = (nota1 + nota2) / 2;

        Boolean avaliaPRof = professor.equals("vitor");

        /** Define condição do Aluno */

        if (media >= 7 && frequencia >= 75 && !avaliaPRof || media >= 6 && frequencia >= 90 && !avaliaPRof) {
            System.out.println("Aluno Aprovado !!");
        } else {
            System.out.println("Aluno Reprovado !!");
        }


        /** Printa as Informações */
        System.out.println("--------------------------");
        System.out.println("Relatório");
        System.out.println("Olá Professor " + professor);
        System.out.println("A disciplina avaliada é " + disciplina);
        System.out.println("O aluno avaliado é: " + nomeAluno);
        System.out.println("A frequência do aluno é: " + frequencia);
        System.out.println("A nota 1 é: " + nota1);
        System.out.println("A nota 2 é: " + nota2);


    }


}


