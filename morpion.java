import java.util.Random;
import java.util.Scanner;

public class morpion {
    public static void main(String[] args) {

        char tab[][] = {    {' ',' ',' '},
                            {' ',' ',' '},
                            {' ',' ',' '}
                            };


        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Choississez le mode : \n\n Joueur contre BOT [1] \n Joueur contre Joueur [2] \n BOT contre BOT [3]");
        Integer mode = scanner.nextInt();
        System.out.println();
        
        /////////////////////////////////---------------- Mode 1 --------------------/////////////////////////////////

        if(mode == 1)
        {
            Random rand = new Random();
            Integer Player = rand.nextInt(1,3);
            char joueurActuel;
            Boolean EndGame = false;

            while(EndGame != true)
            {
                
                if(Player == 1){
                    afficherTableau(tab);
                    joueurActuel = 'X';
                    System.out.println("Joueur, c'est à votre tour.");
                    System.out.println();
                    System.out.print("Veuillez saisir la ligne : ");
                    Integer ligne = scanner.nextInt();
                    System.out.print("Veuillez saisir la colonne : ");
                    Integer colonne = scanner.nextInt();

                    tab[ligne][colonne] = 'X';
                    Player = 2;         
                }
                    
                else if(Player == 2){
                    afficherTableau(tab);
                    joueurActuel = 'O';
                    JoueurOrdi(tab, rand, joueurActuel);
                    Player = 1;      
                }

                afficherTableau(tab);

                if(partieNulle(tab)){
                    System.out.println("Match nul !");
                    EndGame = true;
                }
                if(Win(tab)){
                    if(Player == 1){
                        System.out.println("Victoire Ordi !");
                    }
                    else{
                        System.out.println("Victoire Joueur !");
                    }
                    EndGame = true;
                }

            }

            scanner.close();
        }

        /////////////////////////////////--------------------------------------------/////////////////////////////////
        /////////////////////////////////---------------- Mode 2 --------------------/////////////////////////////////

        if(mode == 2)
        {
            Random rand = new Random();
            Integer Player = rand.nextInt(1,3);
            char joueurActuel;
            Boolean EndGame = false;

            while(EndGame != true)
            {
                
                if(Player == 1){
                    afficherTableau(tab);
                    joueurActuel = 'X';
                    System.out.println("Joueur X, c'est à votre tour.");
                    System.out.println();
                    System.out.print("Veuillez saisir la ligne : ");
                    Integer ligne = scanner.nextInt();
                    System.out.print("Veuillez saisir la colonne : ");
                    Integer colonne = scanner.nextInt();

                    tab[ligne][colonne] = 'X';
                    Player = 2;         
                }
                    
                else if(Player == 2){
                    afficherTableau(tab);
                    joueurActuel = 'O';
                    System.out.println("Joueur O, c'est à votre tour.");
                    System.out.println();
                    System.out.print("Veuillez saisir la ligne : ");
                    Integer ligne = scanner.nextInt();
                    System.out.print("Veuillez saisir la colonne : ");
                    Integer colonne = scanner.nextInt();

                    tab[ligne][colonne] = 'O';
                    Player = 1;      
                }

                afficherTableau(tab);

                if(partieNulle(tab)){
                    System.out.println("Match nul !");
                    EndGame = true;
                }
                if(Win(tab)){
                    if(Player == 1){
                        System.out.println("Victoire Joueur O !");
                    }
                    else{
                        System.out.println("Victoire Joueur X !");
                    }
                    EndGame = true;
                }

            }

            scanner.close();
        }

        /////////////////////////////////--------------------------------------------/////////////////////////////////
        /////////////////////////////////---------------- Mode 3 --------------------/////////////////////////////////

        if(mode == 3)
        {
            Random rand = new Random();
            Integer Player = rand.nextInt(1,3);
            char joueurActuel;
            Boolean EndGame = false;

            while(EndGame != true)
            {
                
                if(Player == 1){
                    afficherTableau(tab);
                    joueurActuel = 'X';
                    JoueurOrdi(tab, rand, joueurActuel);
                    Player = 2;             
                }
                    
                else if(Player == 2){
                    afficherTableau(tab);
                    joueurActuel = 'O';
                    JoueurOrdi(tab, rand, joueurActuel);
                    Player = 1;        
                }

                afficherTableau(tab);

                if(partieNulle(tab)){
                    System.out.println("Match nul !");
                    EndGame = true;
                }
                if(Win(tab)){
                    if(Player == 1){
                        System.out.println("Victoire Joueur O !");
                    }
                    else{
                        System.out.println("Victoire Joueur X !");
                    }
                    EndGame = true;
                }

            }

            scanner.close();
        }
    }

    public static void JoueurOrdi(char tab[][], Random random, char joueur){
        Integer ligne;
        Integer colonne;  
        
        do{
            System.out.println("Tour de l'ordinateur " + joueur);
            ligne = random.nextInt(3);
            colonne = random.nextInt(3);
        } while(tab[ligne][colonne] != ' ');
        tab[ligne][colonne] = joueur;
    }

    public static void afficherTableau(char tab[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j]);
                if (j < 2) {
                    System.out.print("   | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("--------------");
            }
        }
        System.out.println();
    }

    public static boolean partieNulle(char tab[][]){
        for(Integer ligne = 0; ligne < 3; ligne++){
            for(Integer colonne = 0; colonne < 3; colonne++){
                if(tab[ligne][colonne] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean Win(char tab[][]) {
        //Win Horizontale
        for (int i=0; i < 3; i++){ 
            if((tab[i][0] == tab[i][1] && tab[i][2] == tab[i][2]) && (tab[i][0] != ' ' && tab[i][1] != ' ' && tab[i][2] != ' ')){
                return true;
            }
        }
        //Win Verticale
        for (int j=0; j<3; j++){
            if(tab[0][j] == tab[1][j] && tab[0][j] == tab[2][j] && tab[0][j] != ' ' && tab[1][j] != ' ' && tab[2][j] != ' '){
                return true;
            }
        }
        //Win Diagonale
        if(tab[0][0] == tab[1][1] && tab[0][0] == tab[2][2] && tab[0][0] != ' ' && tab[1][1] != ' ' && tab[2][2] != ' '){
            return true;
        }
        if(tab[2][0] == tab[1][1] && tab[0][2] == tab[2][0] && tab[0][2] != ' ' && tab[1][1] != ' ' && tab[0][2] != ' '){
            return true;
        }

        return false;
    }

}
