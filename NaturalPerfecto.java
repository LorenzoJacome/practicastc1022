package naturalperfecto;
import java.util.Scanner;


public class NaturalPerfecto {

    
    public static void main(String[] args) {
        int num;
        int ward = 0;
        int total = 0;
        int contador;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        
        for (contador = 1; num > contador; contador++){
            if ((num%contador)==0){
                ward = contador;
                total = total + ward;
            }
        }
        if (total == num){
            System.out.println("Es natural perfecto");
        }
        else {
            System.out.println("No es natural perfecto");
        }
        
        
    }
    
}
