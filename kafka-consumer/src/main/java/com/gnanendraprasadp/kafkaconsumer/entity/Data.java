package com.gnanendraprasadp.kafkaconsumer.entity;

import javax.persistence.*;

@Entity
@Table(name = "wikimedia_changes")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private String message;

    public Data(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Data() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
