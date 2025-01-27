package Utils;

import java.util.Comparator;
import Models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Primero comparamos apellidos 
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());

        if (comparacionApellido != 0) {
            return comparacionApellido;
        }

        int compacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if (compacionNombre != 0) {
            return compacionNombre;
        }

        // Si los apellidos son iguales, comparamos nombres
        return c1.getTelefono().compareTo(c2.getTelefono());
    }
}
