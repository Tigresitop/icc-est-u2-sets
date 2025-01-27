import java.util.Set;
import java.util.TreeSet;

import Models.Contacto;
import Utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        
        //runHashSet();
        //runLinkedHashSet();
        //runTreeSet();
        //runTreeSetConComparador();
        runEjercicio();

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

    private static void runEjercicio() {

        /* 
        Contacto c1 = new Contacto("Pedro", "Lopez", "123456789");
        Contacto c2 = new Contacto("Predo", "Lopez", "123456789");
        
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        System.out.println("Referencia en memoria");
        boolean comparacionReferencia = c1 == c2;
        System.out.println();
        System.out.println("c1"+c1 + "" + comparacionReferencia);
        //System.out.println("c1 == c2: " + comparacionReferencia);

        System.out.println("\nComparacion con equals");
        boolean comparacionEquals = c1.equals(c2);
        
        System.out.println("c1" + c1 + "c2" + c2 + " = " + comparacionEquals);

        System.out.println("\nComparacion de hashcode");
        boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println("c1" + c1.hashCode() + "c2" + c2.hashCode() + " = " + comparacionHashCode);*/

        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222222"));
        agenda.add(new Contacto("Luis", "Perez", "11111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}
