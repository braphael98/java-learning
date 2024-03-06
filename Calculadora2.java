import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop infinito para permitir várias operações
        while (true) {
            System.out.println("****Digite a expressão (Numero A | operador |Numero B) ou 'sair' para finalizar****");
            System.out.print("\nDigite seus numeros: ");
            String input = scanner.nextLine();

            // Verificar se o usuário quer sair
            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Separar os elementos da expressão

            String[] elementos = input.split(" ");

            if (elementos.length != 3) {
                System.out.println("Expressão inválida. Tente novamente.");
                continue;
            }

            else {
                double numero1 = Double.parseDouble(elementos[0]);
                String operador = elementos[1];
                double numero2 = Double.parseDouble(elementos[2]);

                // Calculando o resultado com base no operador
                double resultado = 0.0;
                switch (operador) {
                    case "+":
                        resultado = numero1 + numero2;
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        break;
                    case "x":
                        resultado = numero1 * numero2;
                        break;
                    case "/":
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            System.out.println("Erro: Divisão por zero.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Operador inválido: " + operador);
                        continue;
                }

                // Exibindo o resultado

                System.out.println("\nResultado: " + numero1 + " " + operador + " " + numero2 + " = " + resultado);
                System.out.println("-------------------------------------------------------------------------");
            }

        }
    }

}
