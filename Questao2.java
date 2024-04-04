import java.util.Scanner;

public class Questao2{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero para saber se ele pertence a sequencia de Fibonacci.");
        int numero = ler.nextInt();
        int aux = 0;

        if(numero == 0 || numero == 1){
            System.out.println("Numero informado pertence à sequencia de Fibonacci!");
        }else{
            int i = 0, j = 1;
            while(j < numero){
                aux = i+j;
                i = j;
                j = aux;
                System.out.print(aux + " ");
                
            }
            //System.out.println("Numero informado pertence à sequencia de Fibonacci!");
            if(numero == aux){
                System.out.println("\nNumero informado pertence a sequencia de Fibonacci!");
            }else{
                System.out.println("\nNumero informado NAO pertence a sequencia de Fibonacci!");
            }
        }
    }
}