
package br.ifrn.edu.controller;

import br.ifrn.edu.dominio.Aluno;
import br.ifrn.edu.dominio.Cidade;
import br.ifrn.edu.dominio.Pessoa;
import br.ifrn.edu.dominio.Professor;
import br.ifrn.edu.dominio.TecnicoAdministrativo;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa{
    ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
    public void adicionarPessoa(Pessoa pessoa) {
        int opcao;
        
        do {  
            System.out.println("___________GRUPO DE PESSOAS____________");
            System.out.println("Escolha uma opção de cadastro");
            System.out.println("1 - Cadastrar Aluno.");
            System.out.println("2 - Cadastrar Professor.");
            System.out.println("3 - Cadastrar Técnico Administrativo.");
            System.out.println("4 - Voltar Menu Inicial.");
            System.out.println("_________________________________________");
            Scanner ler = new Scanner(System.in);
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:                     
                    Scanner aluno = new Scanner(System.in);
                
                    Aluno a1 = new Aluno();
                    System.out.println("_________________________________________");
                    System.out.println();
                    System.out.println("--------Cadastro do aluno--------");
                    System.out.println("Digite seu nome: ");
                    a1.setNome(aluno.nextLine());
                    System.out.println("Digite seu Email: ");
                    a1.setEmail(aluno.nextLine());
                    System.out.println("Qual curso deseja? ");
                    a1.setNomeCurso(aluno.nextLine());
                   Cidade c = new Cidade();               
                    System.out.println("Digite sua cidade: ");
                    c.setCidade(aluno.nextLine());                  
                    System.out.println("Digite seu estado: ");
                    c.setEstado(aluno.nextLine());
                    a1.setCidade(c);
                    System.out.println("_________________________________________");                 
                    lista.add(a1);
                    break;

                case 2:
                    Scanner professor = new Scanner(System.in);
                    Professor p1 = new Professor();
                    Cidade c1 = new Cidade();
                     System.out.println("_________________________________________");
                        System.out.println();
                    System.out.println("---------Cadastro do professor--------- ");
                    System.out.println("Digite seu nome: ");
                    p1.setNome(professor.nextLine());
                   System.out.println("Nome da disciplina: ");
                    p1.setNomeDisciplina(professor.nextLine());
                    System.out.println("Digite seu Email: ");
                    p1.setEmail(professor.nextLine());
                    System.out.println("Digite sua cidade: ");
                    c1.setCidade(professor.nextLine());
                    System.out.println("Digite seu estado: ");
                    c1.setEstado(professor.nextLine());
                   p1.setCidade(c1);
                  System.out.println("_________________________________________");
                    
                    lista.add(p1);
                    break;

                case 3:
                    Scanner tec = new Scanner(System.in);
                    TecnicoAdministrativo t1 = new TecnicoAdministrativo();
                    Cidade c2 = new Cidade();
                    
                        System.out.println("_________________________________________");
                           System.out.println();
                    System.out.println("-------Cadastro do Técnico Administrativo--------");
                    System.out.println("Digite seu nome: ");
                    t1.setNome(tec.nextLine());
                    System.out.println("Digite seu Email: ");
                    t1.setEmail(tec.nextLine());
                    System.out.println("Digite sua cidade: ");
                    c2.setCidade(tec.nextLine());
                    System.out.println("Digite seu estado: ");
                   c2.setEstado(tec.nextLine());
                    System.out.println("Setor de trabalho: ");
                    t1.setSetorTrabalho(tec.nextLine());
                    t1.setCidade(c2);
                        System.out.println("_________________________________________");                                   
                   
                    lista.add(t1);
                    break;

                case 4:
                    opcao = 0;
                    break;
                default : 
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao !=0);
        }
        
    public void imprimirTodasPessoa() {
        System.out.println();
        System.out.println("___________Lista de Pessoas_____________");
        for (Pessoa pessoa : lista) {
            pessoa.imprimirInformacoes();
        }

    }

    public void removerPessoa(String nome) {
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals(nome)) {
                lista.remove(i);
     
          
            }
        }
    }

}