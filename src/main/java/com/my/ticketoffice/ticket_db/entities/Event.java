package com.my.ticketoffice.ticket_db.entities;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {
    private String id;
    Location location;
    String startDataTime;
}
