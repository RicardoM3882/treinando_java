import java.util.Scanner; // importanto essa classe para ler as entradad

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // usado para ciar o objeto do Scanner
        // pede para o usuario o primeiro numero
        System.out.println("coloque seu primeiro numero: ");
        double num1 = scanner.nextDouble();

        // utilizado para selecionar o operador +, - , *, /
        System.out.println("Escolha um operador (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // agora ira repetir de pedir o usuario o numero sendo o segundo
        System.out.println("coloque seu segundo numero: ");
        double num2 = scanner.nextDouble();

        double result; // variavel para armazenar o resultado da operacao
      
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // verifica se o segundo numero nao e zero
                if (num2 == 0) {
                    System.out.println("Divisao por zero!");
                    return; // sai do metodo
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Operador invalido!");
                return; // sai do metodo
    
    }

    // exibe o resultado da operacao
     System.out.println("o resultado é: " + result);
}
}