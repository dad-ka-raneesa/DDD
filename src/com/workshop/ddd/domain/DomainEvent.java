package com.workshop.ddd.domain;

public class DomainEvent {
    private final String name;

    public DomainEvent(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "DomainEvent{" +
                "name='" + name + '\'' +
                '}';
    }
}
