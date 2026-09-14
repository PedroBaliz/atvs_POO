import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Insira um número:");
            int numero = scanner.nextInt();

            if(numero == 0){
                System.out.println("Programa encerrado");
                break;
            }

            if(numero < 0){
                System.out.println("insira um número maior que 0");
            }

            else{
                for(int i = 1; i <= 10; i++){
                    int resultado = numero * i;

                    if(resultado % 2 == 0){
                        System.out.println(numero + " x " + i + " = " + resultado + " (par)");
                    }
                    else{
                        System.out.println(numero + " x " + i + " = " + resultado + " (ímpar)");
                    }
                }
                System.out.println("Fim");
            }
            
        } 
        scanner.close();  
    }
}