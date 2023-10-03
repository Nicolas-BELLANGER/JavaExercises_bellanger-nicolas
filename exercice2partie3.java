public class exercice2partie3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Erreur : Deux arguments sont nécessaire");
            System.exit(1);
        }
    
        Integer min = Integer.parseInt(args[0]);
        Integer max = Integer.parseInt(args[1]);

        for(Integer i = min; i < max; i++){
            if(i %3 == 0 && i %5 ==0){
                System.out.print("FizzBuzz");
            }
            else if(i %3 ==0){
                System.out.print("Fizz");
            }
            else if(i %5 ==0){
                System.out.print("Buzz");    
            }
            else{
                System.out.print(i);
            }
        System.out.print(" ");  
        }
    }
}
