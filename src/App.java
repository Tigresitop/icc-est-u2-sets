import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();

    }
    private static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.costruirHashSet();
        System.out.println("--------------------HshSet-------------------");
        System.out.println("Elemtos del HashSet (no se garantiza el orden):");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }



    }

    private static void runLinkedHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.costruirLinkedHashSet();
        System.out.println("--------------------LinkedHashSet-------------------");
        System.out.println("Elemtos del LinkedHashSet (respeta orden de inserccion)):");
        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    private static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.costruirTreeSet();
        System.out.println("--------------------TreeSet-------------------");
        System.out.println("Elemtos del TreeSet (ordenados):");
        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    private static void runTreeSetConComparador() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSetConComparador = sets.costruirTreeSetConComparador();
        System.out.println("--------------------TreeSet con comparador-------------------");
        System.out.println("Elemtos del TreeSet con comparador (ordenados por longitud y alfabetico):");
        for (String elemento : ejemploTreeSetConComparador) {
            System.out.println(elemento);
        }
    }

    /*private static runEjercicio() {
        
    }*/
}
