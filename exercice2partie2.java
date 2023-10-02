import java.util.ArrayList;

public class exercice2partie2 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.print("Erreur : Aucun argument fourni.");
            System.exit(0);
        }

        ArrayList<String> tab = new ArrayList<String>();
        tab.add("kiwi");
        tab.add("pomme");
        tab.add("poire");
        tab.add("litchi");
        tab.add("rhubarbe");

        Integer findFruit = findFruit(tab, args[0]);
        if(findFruit != -1){
        System.out.print("Le fruit " + args[0] + " est à l'index "+ findFruit);
        }
        else{
            System.out.print(args[0]+ " n'est pas dans le tableau");
        }
    }

    private static Integer findFruit(ArrayList<String> tab, String str){
        
        int i = 0;

        for(String f : tab)
        {
            if(f.equals(str)){
                return i;
            }
            i++;
        }
        return -1;
    }
}

