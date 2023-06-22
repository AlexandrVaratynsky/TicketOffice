package com.my.ticketoffice.ticket_api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dto for Tiket.
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {

        @JsonProperty("id")
        private String id;

        @NotBlank
        @JsonProperty("event")
        private EventDto event;

        @NotBlank
        @JsonProperty("place")
        private String place;

}
