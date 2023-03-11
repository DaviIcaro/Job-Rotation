import java.util.Scanner;

public class SequenciaFibonacci {

    public static void main(String[] args) {
        // Lê um número inteiro do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        // Inicializa as variáveis para os primeiros valores da sequência de Fibonacci
        int fibAnterior = 0;
        int fibAtual = 1;
        int fibProximo = fibAnterior + fibAtual;
        
        // Percorre a sequência de Fibonacci até encontrar um número maior ou igual ao número informado pelo usuário
        while (fibProximo < numero) {
            fibAnterior = fibAtual;
            fibAtual = fibProximo;
            fibProximo = fibAnterior + fibAtual;
        }
        
        // Verifica se o número informado pertence à sequência de Fibonacci
        if (fibProximo == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}