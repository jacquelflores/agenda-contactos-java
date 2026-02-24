package org.stolen.poo.main;

import org.stolen.poo.model.Contacto;
import org.stolen.poo.service.AgendaService;


public class AgendaApp {
    public static void main(String[] args) {

        AgendaService agendaService = new AgendaService();

        agendaService.addContact(new Contacto("Julia", "987458214", "julia@gmail.com"));
        agendaService.addContact(new Contacto("Alex", "985163589", "alex@gmail.com"));
        agendaService.addContact(new Contacto("Santos", "985748152", "santos@gmail.com"));
        agendaService.addContact(new Contacto("Sammy", "985478596", "sammy@gmail.com"));
        agendaService.addContact(new Contacto("Maria", "985147896", "maria@gmail.com"));
        agendaService.addContact(new Contacto("Pedro", "963258741", "pedro@gmail.com"));

        agendaService.findContact("Santos");
        agendaService.deleteContact("Pedro");
        agendaService.listContacts();

    }
}
