import listas.ListaIntCrescente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe um valor positivo para inserir (negativo sair):");
        int valor = sc.nextInt();
        ListaIntCrescente lista = new ListaIntCrescente();
        do{
            lista.insere(valor);

            lista.mostra();

            System.out.print("Informe um valor positivo para inserir (negativo sair):");
            valor = sc.nextInt();
        }while (valor >= 0);

        System.out.print("Informe um valor positivo para inserir (negativo sair):");
        valor = sc.nextInt();
        do{
            lista.remove(valor);

            lista.mostra();

            System.out.print("Informe um valor positivo para inserir (negativo sair):");
            valor = sc.nextInt();
        }while (valor >= 0);

        sc.close();
    }
}