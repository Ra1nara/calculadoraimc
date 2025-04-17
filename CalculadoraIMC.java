
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu peso: ");
        String pesoStr = scanner.nextLine().replace(",",".");
        double peso = Double.parseDouble(pesoStr);

        System.out.print("Digite a sua altura: ");
        String alturaStr = scanner.nextLine().replace(",",".");
        double altura = Double.parseDouble(alturaStr);


        double imc = peso/(altura*altura);

        System.out.printf("O seu IMC é de: %.2f\n", imc);

        if(imc<18.5){
            System.out.println("Classificação: Abaixo do peso");

        }else if(imc<24.9){
            System.out.println("Classificação: Peso normal.");
        }else if(imc< 29.9){
            System.out.println("Classificação: Sobrepeso.");
        } else if(imc<34.9){
            System.out.println("Classificação: Obesidade grau 1.");
        }else if(imc<39.9){
            System.out.println("Classificação: Obesidade grau 2.");
        }else{
            System.out.println("Classificação: Obesidade grau 3.");
        }
        
        scanner.close();


    }
}