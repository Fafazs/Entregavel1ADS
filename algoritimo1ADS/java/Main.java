import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questão 1 – Números Primos
        Primo p = new Primo();
        int[] numerosParaTestar = {1, 2, 3, 4, 5, 8, 10, 12, 16, 17, 19, 20, 23, 24, 29, 31, 37, 41};
        p.verificarPrimos(numerosParaTestar);

        // Questão 2 – Somatório
        Somatorio s = new Somatorio();
        int[] numerosParaSomar = {10, 20, 30, 40, 50};
        int resultado = s.somar(numerosParaSomar);
        System.out.println("Somatório: " + resultado);

        // Questão 3 – Fibonacci
        System.out.print("Digite quantos números da sequência de Fibonacci deseja ver: ");
        int quantidade = scanner.nextInt();

        Fibonacci f = new Fibonacci();
        int[] sequencia = f.gerarSequencia(quantidade);

        System.out.print("Sequência de Fibonacci: ");
        for (int num : sequencia) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();

        //Questão 4
        Mdc md = new Mdc();
        int a = 56, b = 98;
        System.out.println("MDC de " + a + " e " + b + " é: " + md.mdc(a, b));

        //Questão 5
        QuickSort qs = new QuickSort;
        int[] arr = {10, 5, 3, 8, 2, 9};
        int[] sortedArr = qs.quickSort(arr);
        System.out.println("Array ordenado: " + Arrays.toString(sortedArr));
    }
}


