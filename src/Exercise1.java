import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fornisci la quantità di strighe: "); //Chiedo all'utente
        int n = scanner.nextInt();
        scanner.nextLine(); // Questo scanner.nextLine() a vuoto serve esclusivamente per evitare bug con lo scanner, che potrebbe saltare delle linee

        HashSet<String> parole = new HashSet<>(); //creo una lista vuota di stringhe
        ArrayList<String> paroleDuplicate = new ArrayList<>(); //Questo contenitore conterrà le parole scartate dall'AshSet (l'AshSet scarta tutto le parole duplicate, perché non accetta duplicati)

        for (int i = 0; i < n; i++) {
            System.out.println("Fornisci una stringa: "); //Chiedo all'utente
            String p = scanner.nextLine();

            if(!parole.add(p)){
                paroleDuplicate.add(p);
            }
            /*Se la parola che viene inserita dall'utente viene scartata dall'HashSet in quanto duplicato, restuirà false,
            e quindi finirà in questo if e finirà nel contenitore paroleDuplicate se è true invece e quindi non è una paroal duplicata, andrà avanti e verrà stampata*/
        }

        System.out.println("Le parole publicate sono: " + paroleDuplicate);
        System.out.println("La quantità di parole non duplicate è: " + parole.size());
        System.out.println("Le parole non duplicate sono: " + parole);
    }
}
