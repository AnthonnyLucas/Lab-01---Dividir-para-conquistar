import java.util.Scanner;

//Faça uma classe em Java com dois métodos

//public static boolean binarySearch (int [] array, int num) ... Implemente a busca binária iterativa (ou seja, com for);

public class Busca_Binaria {
    // Implementação da busca binária interativa com for
    public static void main(String[] args) throws Exception {
       int[] vetor = new int[8];

       for(int i=0; i < vetor.length; i++){
            vetor[i] = i * 2;
            System.out.println(vetor[i]);
    }

    System.out.println("Qual número você busca?");
    Scanner leitor = new Scanner(System.in);
    int buscado = leitor.nextInt();

    int contador = 0;
    boolean achou = false;
    int inicio = 0;
    int fim = vetor.length - 1;
    int meio;

    while(inicio <= fim){
        meio = (int) ((inicio + fim) / 2);
        contador++; //Conta a quantidade de testes realizados.
        if (vetor[meio] == buscado){
            achou = true;
            break;
        }else if (vetor[meio] < buscado){
            inicio = meio + 1;
        }else{ //Só pode ser maior.
            fim = meio - 1;
        }
    }

    System.out.println("Quantidade de testes: " + contador);
    if (achou == true){
        System.out.println("Achou");
    }else{
        System.out.println("Não achou");
    }
}

}