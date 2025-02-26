package org.guengeln.floc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Clients")
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Boolean active;

    private Integer parcel;

    private String name;

    private String address;

    private String phone;

    private Float waterlevel_old;

    private Float waterlevel_new;

    private Float costs;

}
