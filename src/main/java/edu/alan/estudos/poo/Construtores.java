package edu.alan.estudos.poo;


public class Construtores {

    /*
    * Metodos construtores -> Em uma classe podemos ter um metodo construtor que fica encarregado de receber
    * por parametro dados e setar eles na hora de instanciar.
    *
    * Ou seja se eu quero passar dados na hora de instanciar eu posso usar o set nesse metodo construtor.
    *
    * ESSE METODO PRECISA TER O MESMO NOME DA CLASSE E NAO TER RETORNO!
    * */
    private String name;
    private int idade;
    private String endereco;

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // METODO CONSTRUTOR:
    public Construtores(String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Construtores pessoa1 = new Construtores("Alan", 20);
        pessoa1.setEndereco("Eduvirge Whietorn");
        System.out.println("O "+pessoa1.getName() + " tem "+pessoa1.getIdade() +" anos de idade"+ " e mora na Rua:"+pessoa1.getEndereco());
    }
}
