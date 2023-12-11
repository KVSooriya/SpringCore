package com.example.demo;

import com.example.springcore.group.Group;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Group theGroup;

    public DemoController(Group theGroup)
    {
        this.theGroup = theGroup;
    }

    @GetMapping("/getDemoSubjects")
    public String getSubjects()
    {
        return "Demo : " +theGroup.getSubjects();
    }
}
