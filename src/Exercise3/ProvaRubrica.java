package Exercise3;

public class ProvaRubrica {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();

        rubrica.inserisciContatto("Mario Rossi", "242322");
        rubrica.inserisciContatto("Mario Bianchi", "24363");
        rubrica.inserisciContatto("Maria Rossi", "26464");
        rubrica.inserisciContatto("Flavia Rossi", "23636");

        System.out.println(rubrica.cercaContattoPerNome("Mario Rossi"));

        System.out.println(rubrica.cercaContattoPerNumero("3553563")); //numero del contatto sbagliato, cosi tornerà null

        rubrica.stampaContatti();
    }
}
