package com.my.ticketoffice.ticket_api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("location")
    private LocationDto location;

    @JsonProperty("startDataTime")
    private String startDataTime;

}
