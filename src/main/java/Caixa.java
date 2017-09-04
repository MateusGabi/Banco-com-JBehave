/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 04/09/2017.
 * @see http://www.javaprogressivo.net/2012/10/Aplicativo-Simulacao-simples-de-conta-bancaria-caixa-eletronico-em-Java.html
 */


import java.util.Scanner;
import java.util.Random;

public class Caixa {


    public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

        //Obtendo os dados iniciais do Cliente
        System.out.println("Cadastrando novo cliente.");
        System.out.print("Ente com seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();

        //Criando a conta de um cliente
        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();
    }


}
