package edu.spring;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Context {

    /*<bean id="now" class="java.util.Date" scope="prototype"/>*/

    @Bean
    @Lazy
    public Date now() {
        return new Date();
    }

}