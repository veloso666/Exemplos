import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        String palavraInvertida = inverteString(palavra);
        
        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
    
    public static String inverteString(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int i = 0;
        int j = caracteres.length - 1;
        
        while (i < j) {
            char aux = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = aux;
            i++;
            j--;
        }
        
        return new String(caracteres);
    }
}
