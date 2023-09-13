import java.util.Scanner;
import java.util.Random;

public class Sort {

    final static Scanner LER = new Scanner(System.in);
    final static Random gerador = new Random();

    public static void main(String[] args) {
        int vet[] = new int[10];
        

        gerar();

        vet = lerVetor(vet);
        
        bubbleSortCres(vet);
        bubbleSortDec(vet);
        insertionSortCres(vet);
        insertionSortDec(vet);
        selectionSortCres(vet);
        selectionSortDec(vet);

    }

    //gerar número aleatorio
    public static void gerar() {
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(10));
        }
    }

    //realiza a troca
    public static void swap(int[] vet, int i, int j) {
        int test = 0;

        test = vet[i];
        vet[i] = vet[j];
        vet[j] = test;
    }

    //ler o vetor
    public static int[] lerVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }
        return vet;
    }

    //Bubble
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
    //imprimindo o Bubble
    public static void print(int[] vet,int contador, int movimentacao) {
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


    //Insertion
    public static void insertionSortCres(int[] vet) {
        int contador = 0;
        int movimentacao = 0;
        for (int i = 1; i < vet.length; i++) {
            contador++;
            int eleito = vet[i];
            int j = i - 1;
            while (j >= 0 && vet[j] > eleito) {
                contador++;
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = eleito;
            movimentacao += 3;
            
        }
        print(vet, contador, movimentacao);
    }
    public static void insertionSortDec(int[] vet) {
        int contador = 0;
        int movimentacao = 0;
        for (int i = 1; i < vet.length; i++) {
            contador++;
            int eleito = vet[i];
            int j = i - 1;
            while (j >= 0 && vet[j] < eleito) {
                contador++;
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = eleito;
            movimentacao += 3;
            
        }
        print2(vet, contador, movimentacao);
    }
    //imprimindo o insertion
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


    //Selection
    public static void selectionSortCres(int[] vet) {
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
    public static void selectionSortDec(int[] vet) {
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
    //imprimir o selection
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