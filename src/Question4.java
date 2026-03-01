import java.util.Scanner;
public class Question4 {
    public static void main(String[]args) {
       int numsegundos = leitura();
        int horas = calculo(numsegundos,3600);
        int restohoras =  numsegundos% 3600;
        int minutos = calculo(restohoras,60);
        int restoSegundos = restohoras % 60;
        System.out.println(" São horas: " + horas);
        System.out.printf(" São minutos: %d%n",minutos);
        System.out.printf(" São segundos: %d%n", restoSegundos);
    }

    public static int  leitura (){
        int segundos;
        Scanner scanner = new Scanner(System.in);
        segundos = scanner.nextInt();
        return segundos;
    }

      public static int calculo(int valorSeg, int divisor){
        return valorSeg / divisor;
     }



}
