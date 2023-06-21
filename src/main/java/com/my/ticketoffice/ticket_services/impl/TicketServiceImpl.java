package com.my.ticketoffice.ticket_services.impl;

import com.my.ticketoffice.ticket_api.dto.TicketDto;
import com.my.ticketoffice.ticket_db.entities.Ticket;
import com.my.ticketoffice.ticket_db.repositories.TicketRepository;
import com.my.ticketoffice.ticket_services.TicketService;
import com.my.ticketoffice.utils.TestMongo;
import com.my.ticketoffice.utils.mapper.TicketMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    TestMongo testMongo;

    @Autowired
    TicketMapper ticketMapper;

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> getAllTickets() {
        var result = ticketRepository.findAll();
        return result;
    }

    @Override
    public Page<TicketDto> getAllTickets(Pageable pageable) {
        var result = ticketRepository.findAll(pageable).map(ticket -> {
            TicketDto ticketDto = ticketMapper.toTicketDto(ticket);
            return ticketDto;
        });
        return result;
    }

    @Override
    public Ticket addDummy() {
        return testMongo.addTicket();
    }
}
