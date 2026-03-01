import java.util.Scanner;
public class Question5 {
    public static void main (String[]args) {
        int[] numeros = new int[5];
        leitura(numeros);
        boolean validacaoRepetidos = verificacao(numeros);

        if (validacaoRepetidos == true ) {
            System.out.println("Tem números repetidos.");
        } else {
            System.out.println("Não tem números repetidos.");
        }

}

    public static  void leitura (int [] numeros){
        int i, j;
        int cont =1;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + cont + " número : ");
            cont++;
            numeros[i]= scanner.nextInt();
        }

    }
    public static boolean verificacao(int [] numeros){
        int i, j;
        boolean repetido  = false;
        for (i = 0; i < numeros.length - 1; i++) {

            for (j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                }
            }

        }
        return  repetido;

    }




}
