import java.util.Scanner;

public class InverterString {
    
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);
        
        // Pede ao usuário para digitar uma string
        System.out.print("Digite uma string: ");
        
        // Lê a string digitada pelo usuário
        String str = input.nextLine();
        
        // Converte a string em um array de caracteres usando o método toCharArray()
        char[] chars = str.toCharArray();
        
        // Cria uma nova string para armazenar a string invertida
        String strInvertida = "";
        
        // Percorre o array de caracteres de trás para frente e adiciona cada caractere à string invertida
        for (int i = chars.length - 1; i >= 0; i--) {
            strInvertida += chars[i];
        }
        
        // Imprime a string invertida
        System.out.println("String invertida: " + strInvertida);
    }
}