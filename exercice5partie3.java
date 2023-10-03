import java.util.ArrayList;

public class exercice5partie3 {
    public static void main(String[] args) {
        ArrayList<Integer> nbArray = new ArrayList<Integer>();
        nbArray.add(75);
        nbArray.add(80);
        nbArray.add(90);
        nbArray.add(95);
        nbArray.add(85);
            
        Integer averageArray = averageCalc(nbArray);

        System.out.print("La moyenne de la liste est : " + averageArray);
    }

    
    public static Integer averageCalc(ArrayList<Integer> numbers){
        Integer sum = 0;
        Integer nbElement = numbers.size();

        for(Integer n : numbers){
            sum += n;
        }

        Integer resultat = sum/nbElement;
        return resultat;
    }
}
