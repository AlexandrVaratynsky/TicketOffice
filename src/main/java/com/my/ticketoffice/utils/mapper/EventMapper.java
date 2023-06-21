package com.my.ticketoffice.utils.mapper;

import com.my.ticketoffice.ticket_api.dto.EventDto;
import com.my.ticketoffice.ticket_db.entities.Event;
import com.my.ticketoffice.utils.config.MapperConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(config = MapperConfig.class, unmappedTargetPolicy = ReportingPolicy.WARN)
public interface EventMapper {

    Event toEvent(EventDto eventDto);

    EventDto toEventDto(Event event);

}
