package com.techscheduler.api.domain.address;

import com.techscheduler.api.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    private String city;

    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
