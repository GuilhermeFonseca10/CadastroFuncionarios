
package br.ifrn.edu.dominio;


public class Professor extends Pessoa{
    private String nomeDisciplina;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    @Override
    public void imprimirInformacoes() {
     
     System.out.println("__________Informações do professor____________");
         System.out.println();
         System.out.println("Nome do professor: "+this.getNome());
        System.out.println("Disciplina: "+this.getNomeDisciplina());
        System.out.println("Email: "+this.getEmail());
        System.out.println("Cidade: "+this.getCidade().getCidade());
        System.out.println("EStado: "+this.getCidade().getEstado());
        System.out.println("Cadastrado!");
        
        System.out.println();
      
}
}