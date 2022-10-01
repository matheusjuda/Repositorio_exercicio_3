import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num01 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int num02 = sc.nextInt();

        sc.close();

        int soma = num01+num02;

        System.out.println("A soma dos números informado é: "+soma);
    }
}