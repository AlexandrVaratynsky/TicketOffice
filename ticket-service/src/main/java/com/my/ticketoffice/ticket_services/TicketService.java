package com.my.ticketoffice.ticket_services;

import com.my.ticketoffice.ticket_api.dto.TicketDto;
import com.my.ticketoffice.ticket_db.entities.Ticket;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TicketService {


    Ticket save(Ticket ticket);

    Ticket save(TicketDto ticketDto);

    List<Ticket> getAllTickets();

    Page<TicketDto> getAllTickets(Pageable pageable);

}
