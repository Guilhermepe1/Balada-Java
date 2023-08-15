package br.senai.sp.balada;

/**
 * Balada
 * Data: 15/08/2023
 * Autor: Guilherme Pereira
 * */

import java.util.Scanner;

public class Balada {

    public static void main(String[] args) {

        /** Declara variaveis */
        String nome1, nome2, resp, acompanha;
        int idade1, idade2;
        boolean continua = true;    // Variavel referente a continuaçao do laço while
        long cpf1, cpf2;
        boolean entrada = true;     // Variavel que valida a permissao referente a entrada

        /** Instanciar teclado */
        Scanner teclado = new Scanner(System.in);

        /** Inicia programa */
        System.out.println("-------------------------------------------------");
        System.out.println("Olá, seja bem vindo à balada Tuts-Tats!!!");
        System.out.println("-----------> FESTA DOS PARES <------------");
        System.out.println("-------------------------------------------------");

        /** Laço de repetição do sistema */
        while (continua) {
            /** Coleta dados */
            System.out.print("Nome: ");
            nome1 = teclado.next();
            System.out.print("CPF: ");
            cpf1 = teclado.nextLong();
            System.out.println("Você é maior de idade? (Não minta!!!)");
            System.out.print("Informe sua idade: ");
            idade1 = teclado.nextInt();
            System.out.println("-------------------------------------------------");

            /** Verificando condicao */
            if (idade1 >= 18 && idade1 % 2 == 0) {
                entrada = true;

            } else if (idade1 >= 18) {
                entrada = true;
                /** Verifica outras condiçoes */
                System.out.println("Você está acompanhando(a)?[S/N] ");
                acompanha = teclado.next();
                System.out.println("-------------------------------------------------");
                if (acompanha.equalsIgnoreCase("n")) {
                    entrada = false;
                }
                /** Coleta informacoes do acompanhante */
                if (entrada) {
                    System.out.println("Informe os dados do(a) acompanhante:");
                    System.out.print("Nome: ");
                    nome2 = teclado.next();
                    System.out.print("CPF: ");
                    cpf2 = teclado.nextLong();
                    System.out.println("É maior de idade? (Não minta!!!)");
                    System.out.print("Informe a idade: ");
                    idade2 = teclado.nextInt();
                    System.out.println("-------------------------------------------------");
                    /** Verifica a idade do acompanhante e se a soma das idades é par */
                    if (idade2 <= 18 || (idade1 + idade2) % 2 != 0) {
                        entrada = false;
                    }
                }
            } else { entrada = false; }

            /** Confirma entrada */
            if (entrada) {
                System.out.println("ENTRADA PERMITIDA!!!");
            } else {
                System.out.println("ENTRADA NEGADA!!!");
            }

            /** Verifica outra pessoa */
            System.out.println("-------------------------------------------------");
            System.out.println("Deseja verificar outra pessoa?[S/N] ");
            resp = teclado.next();
            if (resp.equalsIgnoreCase("n")) {
                continua = false;
            }
            System.out.println("-------------------------------------------------");
        }

        /** Finaliza programa */
        System.out.println("Até a próxima!");
    }
}
