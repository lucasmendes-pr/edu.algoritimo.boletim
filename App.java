import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[4];
        String[] nome = new String[4];
        float soma = 0;

        System.out.println("*****PROGRAMA BOLETIM*****");

        for (int y = 0; y < nome.length; y++) {
            System.out.print("Infome o nome do " + (y + 1) + "º aluno: ");
            nome[y] = scanner.nextLine();

            for (int i = 0; i < notas.length; i++) {
                do {
                    System.out.print("Informe a " + (i + 1) + "º nota: ");
                    notas[i] = scanner.nextFloat();
                    if (notas[i] > 10 || notas[i] < 0) {
                        System.out.println("Nota Inválido");
                    }
                } while (notas[i] > 10 || notas[i] < 0);

                soma += notas[i];
            }
            soma = soma / notas.length;
            nome[y] = scanner.nextLine();

            if (soma >= 7) {
                System.out.println("Aprovado");

            } else if (soma >= 6) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }

        }
    }
}
