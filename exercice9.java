public class exercice9 {
    public static void main(String[] args) {
        Integer numbers[] = {21565,3412,1556,182,84,15};
        Integer number = 0;
        for(Integer value : numbers){
            if(value %3 !=0){
                if(number>0){
                    System.out.print(", ");
                }
                System.out.print(value);
                number++;
            }
        }    
    }
}
