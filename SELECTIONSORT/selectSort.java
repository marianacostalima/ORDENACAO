import java.util.Scanner;
import java.util.Random;

public class selectSort {

    final static Scanner LER = new Scanner(System.in);
    final static Random gerador = new Random();

    public static void main(String[] args) {
        int vet[] = new int[10];

        
        //gerar();

        vet = lerVetor(vet);

        insertionSortCres(vet);
        insertionSortDec(vet);

    }

    public static void gerar() {
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(10));
        }
    }

    public static void insertionSortCres(int[] vet) {
        int contador = 0;
        int movimentacao = 0;
        for (int i = 0; i < vet.length - 1; i++) {
            int p = i;
            contador++;
            for (int j = i + 1; j < vet.length; j++) {
                contador++;
                if (vet[j] < vet[p]) {
                    contador++;
                    p = j;
                }
            }
            if (p != i) {
                contador++;
                swap(vet, i, p);
                movimentacao += 3;
            }
        }
        print(vet, contador, movimentacao);
    }

    public static void insertionSortDec(int[] vet) {
        int contador = 0;
        int movimentacao = 0;
        for (int i = 0; i < vet.length - 1; i++) {
            int p = i;
            contador++;
            for (int j = i + 1; j < vet.length; j++) {
                contador++;
                if (vet[j] > vet[p]) {
                    contador++;
                    p = j;
                }
            }
            if (p != i) {
                contador++;
                swap(vet, i, p);
                movimentacao += 3;
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

    public static void print(int[] vet, int contador, int movimentacao) {
        System.out.println("Foram realizadas " + movimentacao + " movimentações!");
        System.out.println("Foram realizadas " + contador + " contadores!");

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        System.out.println();
    }

    public static void print2(int[] vet, int contador, int movimentacao) {
        System.out.println("Foram realizadas " + movimentacao + " movimentações!");
        System.out.println("Foram realizadas " + contador + " contadores!");

        for (int j = 0; j < vet.length; j++) {
            System.out.println(vet[j]);
        }
    }
}
