package com.example.springcore.groupimpl;

import com.example.springcore.group.Group;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Biology implements Group
{
    public Biology()
    {
        System.out.println("Constructor : " +getClass().getSimpleName());
    }

    @Override
    public String getSubjects() {
        return "Physics, Chemistry, Maths, Biology";
    }
}
