package com.example.springcore.groupimpl;

import com.example.springcore.group.Group;

// No special annotation like @Component is placed .. Configured this bean via java code
public class Commerce implements Group
{
    public Commerce()
    {
        System.out.println("Constructor : " +getClass().getSimpleName());
    }

    @Override
    public String getSubjects() {
        return "Economics, Accountancy, Business Studies, Maths";
    }
}
