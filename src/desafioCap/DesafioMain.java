package desafioCap;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMain {

    public static void main(String[] args) {

        menuPrincipal();

    }

    private static void menuPrincipal() {

        // Cria o método opção
        Integer opcao = 0;

        // Importa a classe Escada
        Escada e = new Escada();

        // Importa a classe Anagramas
        Anagramas a = new Anagramas();

        // Importa a classe TestaSenha
        TestaSenha t = new TestaSenha();

        // Cria uma instância da classe Scanner
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Bem vindo ao desafio da academia Capgemini\n\n" +
                    "Para a questão 01 digite: 1\n" +
                    "Para a questão 02 digite: 2\n" +
                    "Para a questão 03 digite: 3\n" +
                    "Para sair do programa digite: 9\n");

            //Valida as opções e trata exceções
            try {
                opcao = scan.nextInt();
                if (!Arrays.asList(1, 2, 3, 9).contains(opcao)) {
                    System.out.println("Opção inválida, digite uma opção válida\n");
                }
            } catch (Exception MenuException) {
                scan = new Scanner(System.in);
                System.out.println("Opção inválida, digite uma opção válida\n");
            }

            //Confirma a opção escolhida
            if (opcao.equals(1)) {
                System.out.println("Será gerada uma escada de * baseado no numero informado\n");
                System.out.println("Digite um número aleatório: \n");

                // Confirma se a entrada do teclado é um número inteiro
                // caso contrário retorna ao menu principal
                if (scan.hasNextInt()) {
                    int num = scan.nextInt();
                    e.gerarEscada(num);
                } else {
                    System.out.println("Apenas números inteiros são aceitos.\n");
                    scan = new Scanner(System.in);
                }
            }

            // Confirma a opção escolhida
            if (opcao.equals(2)) {

                System.out.println("Uma senha forte atende aos seguintes requisitos:\n"+
                        "Possui no mínimo 6 caracteres.\n" +
                        "Contém no mínimo 1 dígito.\n" +
                        "Contém no mínimo 1 letra em minúsculo.\n" +
                        "Contém no mínimo 1 letra em maiúsculo.\n" +
                        "Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
                System.out.println("Digite uma senha forte:");
                String senha = scan.next();
                System.out.println(t.validaSenha(senha));
            }

            // Confirma a opção escolhida
            if (opcao.equals(3)) {
                System.out.println("Será retoranda a quantidade de anagramas contidos na palavra informada\n");
                System.out.println("Digite uma palavra:\n");
                String palavra = scan.next();
                a.contarAnagramas(palavra);
            }
        // O programa permanece em execução enquanto a opção 9 não for escolhida
        } while (!opcao.equals(9));

    }
}
