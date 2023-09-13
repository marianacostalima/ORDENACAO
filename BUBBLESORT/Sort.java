import java.util.Scanner;
import java.util.Random;

public class Sort {

    final static Scanner LER = new Scanner(System.in);
    final static Random gerador = new Random();

    public static void main(String[] args) {
        int vet[] = new int[10];
        

        //gerar();

        vet = lerVetor(vet);
        
        bubbleSortCres(vet);
        bubbleSortDec(vet);

    }

    public static void gerar() {
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(10));
        }
    }

    public static void bubbleSortCres(int[] vet) {
        int contador = 0;
        int movimentacao = 0;
        boolean troca = true;
        int tam = vet.length;
        while (troca) {
            troca = false;
            tam--;
            for (int i = 0; i < tam; i++) {
                contador++;
                if (vet[i] > vet[i + 1]) {
                    contador++;
                    swap(vet, i, i + 1);
                    movimentacao += 3;
                    troca = true;
                }
            }
        }
        print(vet, contador, movimentacao);

    }

    public static void bubbleSortDec(int[] vet) {
        int contador = 0;
        int movimentacao = 0;
        boolean troca = true;
        int tam = vet.length;
        while (troca) {
            troca = false;
            tam--;
            for (int i = 0; i < tam; i++) {
                contador++;
                if (vet[i] < vet[i + 1]) {
                    contador++;
                    swap(vet, i, i + 1);
                    movimentacao += 3;
                    troca = true;
                }
            }

        }
        print2(vet, contador, movimentacao);

    }

    public static void swap(int[] vet, int i, int j) {
        int test = 0;

        test = vet[i];
        vet[i] = vet[j];
        vet[j] = test;
    }

    public static int[] lerVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }
        return vet;
    }

    public static void print(int[] vet,int contador, int movimentacao) {
        System.out.println(contador);
        System.out.println(movimentacao);
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        System.out.println();
    }
    public static void print2(int[] vet, int contador, int movimentacao) {
        System.out.println(contador);
        System.out.println(movimentacao);
        for (int j = 0; j < vet.length; j++) {
            System.out.println(vet[j]);
        }
    }

}

