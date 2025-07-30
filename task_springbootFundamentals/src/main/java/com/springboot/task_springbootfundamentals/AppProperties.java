package com.springboot.task_springbootfundamentals;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class AppProperties
{
    private String title;
    private String version;

    public String getTitle()
    {
        return title;
    }
    public String getVersion()
    {
        return version;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

}
