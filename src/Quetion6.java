public class Quetion6 {

    public static void main(String[] args){
        int [] numeros = { 10,20,30,40,50} ;
        System.out.println("Vetor Original  ");
        imprimirVetor(numeros);
        System.out.println(numeros);

    }



    public static int[] inverter_list( int [] numeros ){
       int i, j;
        for (i = 0, j < numeros.length ; i < j; i++, j--){
             int auxiliar = numeros[i];
             numeros[i]= numeros[j];
             numeros[j] = auxiliar;

    }


}
    public static void imprimirVetor(int [] numeros){
    int i ;
     for(i = 0; i < numeros.length; i++){
        System.out.println(numeros[i]);
     }

}
