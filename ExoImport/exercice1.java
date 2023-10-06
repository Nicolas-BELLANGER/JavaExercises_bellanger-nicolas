import generatearray.generateArray;

public class exercice1 {
    public static void main(String[] args){
        generateArray n = new generateArray();
        n.generate(10,100);
        System.out.print("Liste d'origine : ");
        System.out.println(n.getList());

        for(Integer i = 0; i < 10 - 1; i++){
            for(Integer j = 0; j < 10 - i - 1; j++){
                if(n.list.get(j) > n.list.get(j + 1)){
                    Integer temp = n.list.get(j);
                    n.list.set(j, n.list.get(j + 1));
                    n.list.set(j + 1, temp);
                }
            }
        }
        System.out.print("Liste triée : ");
        System.out.println(n.getList());
    }
}
