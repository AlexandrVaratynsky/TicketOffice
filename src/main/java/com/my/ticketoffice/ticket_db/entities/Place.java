package com.my.ticketoffice.ticket_db.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Place {

    @Id
    private String id;

    private String name;

    private Boolean reserved;

    public Place(String name, Boolean reserved) {
        this.name = name;
        this.reserved = reserved;
    }
}
