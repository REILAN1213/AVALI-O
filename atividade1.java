import java.util.Scanner;
public class atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[8];

        // Entrada das 8 notas anuais
        System.out.println("=== SistemaEscolar ===");
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = entrada.nextDouble();
        }

        // Cálculo das médias bimestrais (cada bimestre tem 2 notas)
        double b1 = (notas[0] + notas[1]) / 2;
        double b2 = (notas[2] + notas[3]) / 2;
        double b3 = (notas[4] + notas[5]) / 2;
        double b4 = (notas[6] + notas[7]) / 2;

        // Cálculo das médias semestrais
        double semestre1 = (b1 + b2) / 2;
        double semestre2 = (b3 + b4) / 2;

        // Cálculo da média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibição dos resultados
        System.out.println("\n=== Resultados ===");
        System.out.printf("1º Bimestre: %.1f%n", b1);
        System.out.printf("2º Bimestre: %.1f%n", b2);
        System.out.printf("1º Semestre: %.1f%n", semestre1);
        System.out.println("----------------------");
        System.out.printf("3º Bimestre: %.1f%n", b3);
        System.out.printf("4º Bimestre: %.1f%n", b4);
        System.out.printf("2º Semestre: %.1f%n", semestre2);
        System.out.println("----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        entrada.close();
    }
}
