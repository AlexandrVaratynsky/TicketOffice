package com.my.ticketoffice.utils.mapper;

import com.my.ticketoffice.ticket_api.dto.TicketDto;
import com.my.ticketoffice.ticket_db.entities.Ticket;
import com.my.ticketoffice.utils.config.MapperConfig;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(config = MapperConfig.class, unmappedTargetPolicy = ReportingPolicy.WARN)
public interface TicketMapper {

    Ticket toTicket(TicketDto ticketDto);

    TicketDto toTicketDto(Ticket ticket);
}
