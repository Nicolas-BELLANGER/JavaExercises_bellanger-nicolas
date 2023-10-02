import java.util.ArrayList;

public class exercice3partie2 {
    public static void main(String[] args) {
        ArrayList<String> quotations = new ArrayList<String>();
        quotations.add("Quand Paris s’enrhume, l’Europe a froid");
        quotations.add("S'il y a un diamant dans la poitrine, il brille sur le visage");
        quotations.add(" La joie de vivre n'est pas un but, mais un devoir");
        
        for(Integer i = 0; i < quotations.size(); i++){
            System.out.println(quotations.get(i) + " : " + countVowels(quotations.get(i)));
        }

    }

    public static Integer countVowels(String str){
        int count = 0;
        for(int i =0; i < str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='y'){
                count++;
            }
            else if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='Y'){
                count++;
            }
        }
        return count;
    }
}
