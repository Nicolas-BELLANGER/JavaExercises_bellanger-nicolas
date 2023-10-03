
import java.util.Scanner;

public class exercice2partie3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez un minimum : ");
        Integer min = scanner.nextInt();
        
        System.out.print("Saisissez un maximum : ");
        Integer max = scanner.nextInt();

        for(Integer i = min; i < max; i++){
            if(i %3 ==0){
                System.out.print("Fizz");
            }
            else if(i %5 ==0){
                System.out.print("Buzz");    
            }
            else if(i %3 == 0 && i %5 ==0){
                System.out.print("FizzBuzz");
            }
            else{
                System.out.print(i);
            }
        System.out.print(" ");  
        }
    }
}
