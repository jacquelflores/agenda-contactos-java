package org.stolen.poo.service;

import org.stolen.poo.model.Contacto;

import java.util.HashMap;
import java.util.Map;

public class AgendaService {
    Map<String, Contacto> contactoMap = new HashMap<>();

    public void addContact(Contacto c) {
        if (contactoMap.containsKey(c.getNombre())) {
            System.out.println("Ya existe el Contacto.");
        } else {
            contactoMap.put(c.getNombre(), c);
        }
    }

    public void listContacts() {
        for (Map.Entry<String, Contacto> entry : contactoMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public Contacto findContact(String nombre) {
        if (contactoMap.containsKey(nombre)) {
            Contacto c = contactoMap.get(nombre);
            System.out.println(c);
            return c;
        } else {
            System.out.println("Contacto no existe..");
            return null;
        }
    }

    public void deleteContact(String nombre) {
        if (!contactoMap.containsKey(nombre)) {
            System.out.println("No existe el Contacto a eliminar...");
        } else {
            contactoMap.remove(nombre);
        }
    }


}
