import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        String mensagem = Leitura();
        boolean validaçao1 = tamanhoValido(mensagem);
        boolean validacao2 = ValidacaoCaracter(mensagem);

        if (validaçao1 && validacao2) {
            System.out.println("Sua senha é valida ");
        } else {
            System.out.println("Sua é invalida ");
            if (!validacao2) {
                System.out.println("Sua senha deve possuir caracter especial");
            }
            if (!validaçao1) {
                System.out.println("Sua senha deve ter no minimo 8 caracteres");

            }
        }
    }

    public static String Leitura(){
        String mens;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha : ");
         mens= scanner.nextLine();
         return  mens;
    }
    public static boolean tamanhoValido(String mens) {
        boolean ver1 = false;
        if (8 > mens.length()) {
            return ver1;
        }
        ver1 = true;
        return ver1;
    }
    public static boolean ValidacaoCaracter(String mens) {
        int i;
        boolean ver2 = false;
        for (i = 0; i < mens.length(); i++) {

            char c = mens.charAt(i);
            if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c)) {
                ver2 = true;
            }
        }
        return  ver2;
    }





}
