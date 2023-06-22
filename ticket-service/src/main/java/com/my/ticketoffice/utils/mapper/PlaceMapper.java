package com.my.ticketoffice.utils.mapper;

import com.my.ticketoffice.ticket_api.dto.PlaceDto;
import com.my.ticketoffice.ticket_db.entities.Place;
import com.my.ticketoffice.utils.config.MapperConfig;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(config = MapperConfig.class, unmappedTargetPolicy = ReportingPolicy.WARN)
public interface PlaceMapper {

    Place toPlace(PlaceDto placeDto);

    PlaceDto toPlaceDto(Place place);

}
