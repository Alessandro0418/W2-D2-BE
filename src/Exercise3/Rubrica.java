package Exercise3;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {

    private HashMap<String, String> rubrica;

    public Rubrica(){
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String numero){
        rubrica.put(nome, numero);
    }

    public void rimuoviContatto(String nome){
        rubrica.remove(nome);
    }

    public String cercaContattoPerNumero(String numero){
        Set<String> nomi =  rubrica.keySet();

        for (String nome : nomi){ //ciclo avanzato
            if(rubrica.get(nome).equals(numero)){
                return nome;
            }
        }
        return null;
    }

    public String cercaContattoPerNome(String nome){
        return rubrica.get(nome);
    }

    public void stampaContatti(){
        System.out.println(rubrica);
    }
}
