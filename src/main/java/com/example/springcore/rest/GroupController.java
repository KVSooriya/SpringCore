package com.example.springcore.rest;

import com.example.springcore.group.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController
{
    private Group groupBio;
    private Group groupComm;
    private Group groupComp;
    private Group groupComp2;

    // Constructor injection
    @Autowired
    public GroupController(@Qualifier("biology") Group groupBio,@Qualifier("commerce") Group groupComm,
                           Group groupComp,Group groupComp2)  // Even though no @Qualifier is used, this will take computerScience since the class is marked as @Primary
    {
        System.out.println("Constructor : " +getClass().getSimpleName());
        this.groupBio = groupBio;
        this.groupComm = groupComm;
        this.groupComp = groupComp;
        this.groupComp2 = groupComp2;
    }

    /* Setter injection - injection on setter methods or the method can also have any name
    @Autowired
    public void setGroup(@Qualifier("biology") Group groupBio,@Qualifier("commerce") Group groupComm)
    {
        this.groupBio = groupBio;
        this.groupComm = groupComm;
    }
    */

    @GetMapping("/getBioSubjects")
    public String getSubjects()
    {
        return groupBio.getSubjects();
    }

    @GetMapping("/getCommerceSubjects")
    public String getComSubjects()
    {
        return groupComm.getSubjects();
    }

    @GetMapping("/getCsSubjects")
    public String getCompSubjects()
    {
        return groupComp.getSubjects();
    }

    // endpoint to check the scope of beans
    @GetMapping("/check")
    public String checkInstance()
    {
        return "Same instance : " +(groupComp == groupComp2);
    }
}
