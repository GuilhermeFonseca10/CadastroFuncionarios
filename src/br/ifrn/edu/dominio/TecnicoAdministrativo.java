
package br.ifrn.edu.dominio;


public class TecnicoAdministrativo extends Pessoa{
    private String setorTrabalho;

    public String getSetorTrabalho() {
        return setorTrabalho;
    }

    public void setSetorTrabalho(String setorTrabalho) {
        this.setorTrabalho = setorTrabalho;
    }

    @Override
    public void imprimirInformacoes() {
       System.out.println();
    System.out.println("________Informações do técnico administrativo__________");
    System.out.println("Nome: "+this.getNome());
    System.out.println("Setor de trabaho: "+this.getSetorTrabalho());
    System.out.println("Email: "+this.getEmail());
    System.out.println("Cidade: "+this.getCidade().getCidade());
    System.out.println("Estado: "+this.getCidade().getEstado());
    System.out.println("Cadastrado!");
    System.out.println();
    }
    
}
