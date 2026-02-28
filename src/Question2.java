import java.util.Scanner;

public class Question2 {


    public static void main(String[] args) {
        int numero = Leitura();

        int notasDe50 = Calcularnotas(numero, 50);
        int resto50 = numero % 50;
        int notasDe20 = Calcularnotas(resto50,20);
        int resto20= resto50 % 20;
        int notasDe10 =Calcularnotas(resto20,10);

        System.out.println("Sao " + notasDe50 + " notas de 50");
        System.out.println("Sao " + notasDe20 + " notas de 20");
        System.out.println("Sao " + notasDe10 + " notas de 10");

    }
        public static int Leitura (){

            // numero lido
            int n = 0;
            System.out.println("Digite um numero:");
            Scanner scanner = new Scanner(System.in);
            return  scanner.nextInt();
        }


    public static int Calcularnotas (int  valor, int valorNotas){
        return valor / valorNotas;
    }



}
