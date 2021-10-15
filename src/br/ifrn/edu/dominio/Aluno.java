
package br.ifrn.edu.dominio;


public class Aluno extends Pessoa{
   
    private String nomeCurso;

  

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println();
        System.out.println("__________Informações do aluno___________");
        System.out.println("Nome do aluno: "+this.getNome());
        System.out.println("Nome do curso: "+this.getNomeCurso()); 
        System.out.println("Email: "+this.getEmail());       
        System.out.println("Cidade: "+this.getCidade().getCidade());
        System.out.println("Estado: "+this.getCidade().getEstado());
        
        System.out.println("Cadastrado!");
        System.out.println();
    }
    
}
