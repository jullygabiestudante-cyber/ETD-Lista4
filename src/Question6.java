public class Question6 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Números na Posição Atual :");
        imprimirVetor(numeros);
        System.out.println("Números na Posição Invertida :");
        inverter_list(numeros);
        imprimirVetor(numeros);
    }


    public static void inverter_list(int[] numeros) {
        int i, j;
        for (i = 0, j = numeros.length - 1; i < j; i++, j--) {
            int auxiliar = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = auxiliar;

        }
    }

    public static void imprimirVetor(int[] numeros) {
        int i;
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
