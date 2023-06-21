package com.my.ticketoffice.utils.mapper;

import com.my.ticketoffice.ticket_api.dto.LocationDto;
import com.my.ticketoffice.ticket_db.entities.Location;
import com.my.ticketoffice.utils.config.MapperConfig;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(config = MapperConfig.class, unmappedTargetPolicy = ReportingPolicy.WARN)
public interface LocationMapper{

    Location toLocation(LocationDto locationDto);

    LocationDto toLocationDto(Location location);
}
