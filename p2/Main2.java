package p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        while (true) {
            System.out.println("digite o nome - sexo");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = entrada.split("-");
            String nome = partes[0].trim();
            String sexo = partes[1].trim().toLowerCase();

            if (sexo.equals("masculino")) {
                masculinos.add(nome);
            } else if (sexo.equals("feminino") || sexo.equals("feminina")) {
                femininos.add(nome);
            }
        }


        System.out.println("nomes masculinos:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("\nnomes Femininos:");
        for (String nome : femininos) {
            System.out.println(nome);
        }
    }
}
