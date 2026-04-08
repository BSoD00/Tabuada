import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            try{
                System.out.print("Digite o número que deseja ver a tabuada: ");
                int numero = input.nextInt();
                for(int i = 1; i<=10; i++){
                    int resultado = numero * i;
                    System.out.println(numero + "*" + i + "=" + resultado);
                }
                break;
            } catch (Exception e) {
                System.out.println("Insira apenas números! Tente novamente.");
                input.nextLine();
            }
        }
    }
}