package generatearray;

import java.util.ArrayList;
import java.util.Random;

public class generateArray {

    public static ArrayList<Integer> list = new ArrayList<>();
    
    public static void generate(Integer size, Integer maxN){
        Random random = new Random();

        for(int i = 0; i <size; i++ ){
            Integer randomN = random.nextInt(maxN);
            if(!list.contains(randomN)){
                list.add(randomN);  
            } 
            else{
                i--;
            }
        }
    }

        public static ArrayList<Integer> getList(){
            return list;
        }
}
