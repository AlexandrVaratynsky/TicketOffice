package com.my.ticketoffice.ticket_db.repositories;

import com.my.ticketoffice.ticket_db.entities.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {

}
