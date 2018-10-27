package anobisiesto;
import java.util.Scanner;

public class AnoBisiesto {
//Si se divide en 400 es bisiesto
//Si se divide entre 4 y no entre 100 = es bisiesto
//PROFE!!! Tome en cuenta que voy en intro a la computacion :)
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int año;
        int bis;
        año = scan.nextInt();
        
        if ((año%400)==0){
            bis = 1;
        }
        else if ((año%4)==0 && (año%100)> 0){
            bis = 1;
        }
        else{
            bis = 0;
        }
        
        if (bis == 1){
            System.out.println(año+" es bisiesto");
        }
        else{
            System.out.println(año+" no es bisiseto");
        }
    }
    
}
