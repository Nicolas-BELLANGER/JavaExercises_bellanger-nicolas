import generatearray.generateArray;
import java.util.ArrayList;

public class exercice1 {
    public static void main(String[] args){
        generateArray n = new generateArray();
        n.generate(10,100);
        System.out.print("Liste d'origine : ");
        System.out.println(n.getList());
        ArrayList<Integer> liste = new ArrayList<>();
        liste = n.getList();

        for(Integer i = 0; i < 10 - 1; i++){
            for(Integer j = 0; j < 10 - i - 1; j++){
                if(liste.get(j) > liste.get(j + 1)){
                    Integer temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, temp);
                }
            }
        }
        System.out.print("Liste triée : ");
        System.out.println(n.getList());
    }
}

