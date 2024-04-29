package edu.alan.estudos.javabasico;

public class EstruturasCondicionais {

    /*
    * Estrutura Condicional Simples -> É quando o código segue o caminho do true, ou seja temos uma condicional de validação
    * e nessa condicional se for true -> executa algo se for false -> termina o codigo!
    *
    * Estrutura Condicional Composta -> É quando precisamos executar alguma regra de negocio e geralmente ele segue por varios caminhos, caso seja true
    * ele executa um bloco de código e caso seja false também executa um bloco de códigos e ações.
    *
    * Condicionais encadeadas -> É uma sequencia de fluxos condicionais, podendo ter inumeras condições if e else.
    *
    * Condição Ternaria -> É uma condição in-line <Nome da Variavel> = <condição> ? <true> : <false>;
    *
    * */

    public static void main(String[] args) {
        int valor = 10;

        if(valor == 10){
             System.out.println("Condicional Simples");
        }

        if(valor < 10){
            System.out.println("Condicional Composta");
        }else{
            System.out.println("Condicional Composta");
        }

        boolean ternario = valor == 10 ? true : false;
    }
}
