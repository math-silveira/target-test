import java.util.Scanner;

public class Questao5{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma String para ser invertida");
        String string = ler.next();
        char[] palavra = string.toCharArray();
        for(int i=string.length()-1; i>=0; i--){
            System.out.print(palavra[i]);
        }
    }
}