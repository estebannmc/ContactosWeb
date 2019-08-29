
package modelo;

import java.util.ArrayList;


public class Agenda {
    ArrayList<Contacto> contactos;

    public Agenda(){
        contactos=new ArrayList<>();
    }
    
    public void agregarContacto (Contacto c){
    contactos.add(c);
    }
}
