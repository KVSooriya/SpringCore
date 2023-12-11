package com.example.springcore.groupimpl;

import com.example.springcore.group.Group;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
@Component - marks the class as Spring bean and also makes it eligible for dependency injection
@Primary - Out of multiple implementations of an interface, use this if no @Qualifier is used
@Scope - scope of the bean can be specified explicitly
*/

@Component
@Primary
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComputerScience implements Group
{
    public ComputerScience()
    {
        System.out.println("Constructor : " +getClass().getSimpleName());
    }

    @Override
    public String getSubjects() {
        return "Physics, Chemistry, Maths, ComputerScience";
    }

    // custom init method - this method is executed soon after the bean is initialized
    @PostConstruct
    public void doMyStuff()
    {
        System.out.println("Inside custom init method " +getClass().getSimpleName());
    }

    // custom destroy method - this method is executed when the bean is about to be destroyed - during container shutdown
    @PreDestroy
    public void cleanMyStuff()
    {
        System.out.println("Inside custom destroy method " +getClass().getSimpleName());
    }
}
