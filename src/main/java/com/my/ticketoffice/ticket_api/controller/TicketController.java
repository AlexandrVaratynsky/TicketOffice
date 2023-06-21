package com.my.ticketoffice.ticket_api.controller;

import com.my.ticketoffice.ticket_api.dto.TicketDto;
import com.my.ticketoffice.ticket_db.entities.Ticket;
import com.my.ticketoffice.ticket_services.TicketService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tickets")
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Operation(summary = "get all tickets as dto", description = "description")
    @GetMapping
    public Page<TicketDto> fetchAllTickets(Pageable pageable) {
        Page<TicketDto> tickets = ticketService.getAllTickets(pageable);
        return tickets;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket addTicket(@RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }

    @PostMapping("/test")
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket addDummy() {

        return ticketService.addDummy();
    }
}
