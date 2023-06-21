package com.my.ticketoffice;

import com.my.ticketoffice.ticket_db.entities.Event;
import com.my.ticketoffice.ticket_db.entities.Location;
import com.my.ticketoffice.ticket_db.entities.Place;
import com.my.ticketoffice.ticket_db.entities.Ticket;
import com.my.ticketoffice.ticket_db.repositories.TicketRepository;
import com.my.ticketoffice.ticket_services.TicketService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TicketofficeApplication {


    public static void main(String[] args) {
        SpringApplication.run(TicketofficeApplication.class, args);
    }

}
