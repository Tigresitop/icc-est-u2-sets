import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Sets() {

    }

    public Set<String> costruirHashSet() {
        Set<String> miHashSet = new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocoton");    
        miHashSet.add("Melon");
        miHashSet.add("Pera");
        
        return miHashSet;
    }

    public Set<String> costruirLinkedHashSet() {
        Set<String> miLinkedHashSet = new LinkedHashSet<>();

        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Melocoton");    
        miLinkedHashSet.add("Melon");
        miLinkedHashSet.add("Pera");
        
        return miLinkedHashSet;

    }

    public Set<String> costruirTreeSet() {
        Set<String> miTreeSet = new TreeSet<>();

        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocoton");    
        miTreeSet.add("Melon");
        miTreeSet.add("Pera");
        
        return miTreeSet;

    }

    public Set<String> costruirTreeSetConComparador() {
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int resultado = Integer.compare(s1.length(), s2.length());
                if (resultado == 0) {
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);

        miTreeSetComparador.add("Melon");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Fresa");
        miTreeSetComparador.add("Kiwi");
        miTreeSetComparador.add("Melocoton");
        miTreeSetComparador.add("Pera"); // Elemento repetido, no se añade de nuevo

        return miTreeSetComparador;

    }


}
