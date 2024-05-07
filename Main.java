import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite nomes separados por virgula:");

        String input = scanner.nextLine();
        String[] nomes = input.split(",");

        Arrays.sort(nomes);

        System.out.println("em ordem alfabetica:");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
