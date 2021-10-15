
package br.ifrn.edu.teste;

import br.ifrn.edu.controller.CadastroPessoa;
import br.ifrn.edu.dominio.Pessoa;

import java.util.Scanner;

public class Teste{

    public static void main(String[] args) {

        CadastroPessoa cadastro = new CadastroPessoa();
        int opcao;

        do {
            System.out.println("_________SISTEMA CADASTRO DE FUNCIONARIOS__________");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Imprimir Lista");
            System.out.println("3 - Remover Pessoa");
            System.out.println("0 - Sair do Sistema");
            System.out.println("_______________________________________");
            Scanner ler = new Scanner(System.in);
            opcao = ler.nextInt();
            switch (opcao) {
                case 1: {
                    Pessoa pessoa = null;
                    cadastro.adicionarPessoa(pessoa);
                }

                break;

                case 2:
                    cadastro.imprimirTodasPessoa();
                    break;

                case 3:      
                     Scanner nome = new Scanner(System.in);
                    System.out.println("Digite o nome de quem você deseja remover da lista: ");
                    String  n =  nome.nextLine();
           
                    cadastro.removerPessoa(n);
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;

            }
        } while (opcao != 0);
    }
}