import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        int fib_ant = 0;
        int fib_atual = 1;
        int fib_prox = 1;
        
        while (fib_prox <= num) {
            if (fib_prox == num) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci!");
                return;
            }
            fib_ant = fib_atual;
            fib_atual = fib_prox;
            fib_prox = fib_ant + fib_atual;
        }
        
        System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
    }
}
