public class exercice4partie3 {
    public static void main(String[] args) {
        Integer count = 0;
        Integer start = 1;
        Integer end = 10;

        for(Integer i = start; i<end+1; i++){   
            count+=i*i; 
        }
        System.out.print("La somme des nombres pairs entre " + start + " et " +end+ " est : " + count);
        
    }
}
