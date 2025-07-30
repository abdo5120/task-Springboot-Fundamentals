package com.springboot.task_springbootfundamentals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController
{
    private final AppProperties appProperties;

    @Autowired
    public TitleController(AppProperties appProperties)
    {
        this.appProperties = appProperties;
    }

    @GetMapping("/aboutApp")
    public String getTitle()
    {
        return "App Title : " + appProperties.getTitle()
                +"    App Version : " + appProperties.getVersion();
    }
}
