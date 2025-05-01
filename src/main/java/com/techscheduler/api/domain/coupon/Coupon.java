package com.techscheduler.api.domain.coupon;

import com.fasterxml.jackson.databind.DatabindException;
import com.techscheduler.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "coupon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Coupon {
    @Id
    @GeneratedValue

    private UUID id;
    private String code;
    private Integer discount;
    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event-id")
    private Event event;

}
