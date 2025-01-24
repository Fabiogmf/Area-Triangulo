import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Bem-vindo a aplicação de cálculo da áre de um triângulo!");
        System.out.println("Você fornecerá os valores dos 3 lados.");
        System.out.println("Após fornecer os valores, o programa informa a área e o tipo de triângulo.");

        System.out.println("Qual é o valor do lado A?");
        double LadoA = Double.parseDouble(in.nextLine());

        System.out.println("Qual é o valor do lado B?");
        double LadoB = Double.parseDouble(in.nextLine());

        System.out.println("Qual é o valor do lado C?");
        double LadoC = Double.parseDouble(in.nextLine());

        double perimetro = (LadoA + LadoB + LadoC) / 2;

        double area = Math.sqrt(perimetro*(perimetro-LadoA) * (perimetro-LadoB) * (perimetro-LadoC));

        if (LadoA <= 0 || LadoB <= 0 || LadoC <= 0 || LadoA + LadoB <= LadoC || LadoA + LadoC <= LadoB || LadoB + LadoC <= LadoA) {
            System.out.println("Valor incorreto, os lados do triangulo devem ser positivos e e obedecer à desigualdade triangular.");
        }

        else if (LadoA == LadoB && LadoB == LadoC) {
            System.out.println("A área do triângulo é " + area);
            System.out.println("Esse triângulo é do tipo Equilátero");
        }

        else if (LadoA == LadoB || LadoB == LadoC || LadoC == LadoA){
            System.out.println("A área do triângulo é " + area);
            System.out.println("Esse triângulo é do tipo Isósceles");
        }

        else {
            System.out.println("A área do triângulo é " + area);
            System.out.println("Esse triângulo é do tipo Escaleno");
        }

    }
}