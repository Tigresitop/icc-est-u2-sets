package Utils;

import Models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        
        if (comparacionApellido != 0) {
            resultado = c1.getApellido().compareTo(c2.getApellido());
        }
        return resultado;
    }

}
