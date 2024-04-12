public class Busca_Binaria_Recursiva {

    //Faça uma classe em Java com dois métodos

    //public static boolean binarySearch (int [] array, int num, int indiceInicio, int indiceFim) ... Implemente a busca binária recursiva (ou seja, a função chamando a si mesma). Considere que iniciamente o valor do parâmetro indiceInicio deve ser 0 (zero) e do indiceFim deve ser o tamanho do array (array.length).

    // Implementação da busca binária recursiva
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[5];
    
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }
    
        System.out.println("Vetor");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    
        System.out.println("Soma");
        System.out.println(somar(0, 0, vetor));
     }
        private static int somar(int soma, int posicao, int[] vetor){
            if(posicao < vetor.length){
            soma = soma + vetor[posicao];
            return somar(soma, posicao + 1, vetor);
            }else{
                return soma;
            }
}
}
