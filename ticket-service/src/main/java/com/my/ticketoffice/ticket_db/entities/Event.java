package com.my.ticketoffice.ticket_db.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {
    private String id;
    Location location;
    String startDataTime;
}
