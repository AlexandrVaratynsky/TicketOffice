package com.my.ticketoffice.utils;

import com.my.ticketoffice.ticket_db.entities.Event;
import com.my.ticketoffice.ticket_db.entities.Location;
import com.my.ticketoffice.ticket_db.entities.Place;
import com.my.ticketoffice.ticket_db.entities.Ticket;
import com.my.ticketoffice.ticket_db.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestMongo {

    TicketRepository ticketRepository;

    @Autowired
    public void setTicketRepository(
            TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
    public Ticket addTicket(){
        Ticket ticket = new Ticket();
        ticket.setPlace("1F");
        Place place =  new Place("1F", false);
//        place.setId(ObjectId.get());
        Location location = new Location();
        location.setName("Arena");
//        location.setId(ObjectId.get());
        location.setPlace(place);
        Event event = new Event();
        event.setStartDataTime("now");
//        event.setId(ObjectId.get());
        event.setLocation(location);
        ticket.setEvent(event);

        return ticketRepository.save(ticket);

    }
}
