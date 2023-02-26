import java.util.ArrayList;

public class KorjaaMinut {
    public static void main(String[] args) {
        // Testataan metodia erilaisilla syötteillä
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(-1);
        lista.add(3);
        lista.add(-4);
        lista.add(-5);
        lista.add(6);

        poistaNegatiiviset(lista);
        System.out.println(lista);
    }

    /**
     * Metodi poistaa listasta kaikki negatiiviset alkiot
     * 
     * @param lista lista, josta alkiot poistetaan
     */
    public static void poistaNegatiiviset(ArrayList<Integer> lista) {
        // Alustetaan indeksi nollaksi
        int indeksi = 0;
        // Käydään lista läpi niin kauan kunnes indeksi on listan pituuden verran
        while (indeksi < lista.size()) {
            // Alustetaan muuttuja alkio, joka on sama kuin lista.get(indeksi)
            int alkio = lista.get(indeksi);
            // Jos alkio on negatiivinen, poistetaan se listasta
            if (alkio < 0) {
                lista.remove(indeksi);
                // Jos alkio on positiivinen, kasvatetaan indeksiä yhdellä
            } else {
                indeksi++;
            }
        }
    }
}