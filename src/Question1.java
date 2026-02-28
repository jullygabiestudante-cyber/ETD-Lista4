public class Question1 {

    public static void main(String[] args) {

        double [] notas = {7.5,4.0,9.3,5.5,8.0,6.5,3.2,10.0,5.8};

        double soma = soma(notas);
        double media = media (soma,notas.length);
        double acimaMedia = maiorMedia(notas, media);
        double maior = maiorNumero(notas);

        System.out.println ("A soma e:" + soma);
        System.out.println("A media das notas: " + media);
        System.out.println ("A quantidade de numeros acima da media e: " + acimaMedia);
        System.out.println ("O maior numero e :" + maior) ;


    }
    public  static double soma(double [] notas){
        double soma =0;
        int i;
        for (i =0 ; i < notas.length; i++){
            soma = notas[i] + soma;
        }
        return soma;

    }
    public static double media ( double soma,  int quantidade ){
        double media =0;
        return media = soma/quantidade;
    }

    public static int maiorMedia ( double [] notas, double media ){
        int contador = 0, i;
        for (i =0 ; i < notas.length; i++) {
            if (notas[i] > media) {
                contador += 1;
            }
        }
        return contador;
    }

    public static double maiorNumero(double [] notas){
        double maior = 0;
        int i;
        for (i =0 ; i < notas.length; i++){
            double auxiliar = notas[i];
            if (auxiliar > maior){
                maior = auxiliar;
            }
        }
        return maior;
    }





}

