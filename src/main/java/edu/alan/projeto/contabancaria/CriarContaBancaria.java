package edu.alan.projeto.contabancaria;
import java.util.Scanner;

public class CriarContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        int adicionarSaldo;
        System.out.println("Cadastro de cliente BancoCoders: ");
        System.out.printf("Nome Completo: ");
        validarNomeDaPessoa(conta.setNome(sc.nextLine()));
        System.out.printf("CPF: ");
        conta.setCpf(sc.nextDouble());
        System.out.printf("Data de Nascimento: ");
        conta.setDataNascimento(sc.nextDouble());

        System.out.println("Conta criada com sucesso!");
        System.out.println("Bem vindo ao BanCoders " + conta.getNome());
        System.out.println("Saldo atual : "+ conta.getSaldoBancario()+"R$");
        System.out.print("Para adicionar saldo bancario digite 0 para sair digite 1: ");
        adicionarSaldo = sc.nextInt();

        if(adicionarSaldo == 0){
            System.out.print("Digite o valor desejado: ");
            double valorDesejado = sc.nextDouble();
            conta.setSaldoBancario(valorDesejado);
            System.out.println("Saldo da conta: "+conta.getSaldoBancario());
        }else{
            sc.close();
        }
    }
    public static String validarNomeDaPessoa(String nome){
        if(nome.equals("")){
            throw new RuntimeException();
        }
        return nome;
    }
}
