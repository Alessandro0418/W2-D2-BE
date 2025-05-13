import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fornisci un numero: ");
        int n = scanner.nextInt();

        ArrayList<Integer> lista = metodo1(n); //salvo metodo1 in una lista cosi da poterla riutilizzare

        System.out.println(lista);

        System.out.println("-----------");

        System.out.println(metodo2(lista));

        System.out.println("-----------");

        metodo3(lista, true); //richiamando il metodo3 con true, essendo un booleano restituirà tutti i numeri pari, con false invece restituirà i numeri false
    }

    public static ArrayList<Integer> metodo1(int n){
        ArrayList<Integer> numeri = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numeri.add(random.nextInt(0, 101));
        }
        return numeri;
    }

    public static ArrayList<Integer> metodo2(ArrayList<Integer> lista1){
        ArrayList<Integer> listaInvertita = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++) {
            listaInvertita.add(lista1.get(lista1.size()-i-1));
        }
        return listaInvertita;
    }

    public static void metodo3(ArrayList<Integer> lista, boolean b){
        if (b){
            for (int i = 0; i < lista.size(); i=i+2) { //con questo if mi muovo solo sulle posizoni pari
                System.out.println(lista.get(i));
            }
        } else {
            for (int i = 1; i < lista.size(); i=i+2) { //con questo if mi muovo solo sulle posizoni dispari
                System.out.println(lista.get(i));
            }
        }
    }
}
