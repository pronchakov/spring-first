package edu.spring;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class Dao {

    private String connection;

    public Dao() {
    }

    public Dao(String connection) {
        this.connection = connection;
    }

    @PostConstruct
    public void init() {
        System.out.println("init dao");
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "Dao (" + hashCode() + ") {" +
                "connection='" + connection + '\'' +
                '}';
    }
}
