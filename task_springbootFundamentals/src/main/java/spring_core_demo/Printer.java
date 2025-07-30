package spring_core_demo;

import org.springframework.stereotype.Component;

@Component
public class Printer
{
    public void print(String report)
    {
        System.out.println("Printing....\n" + report);
    }
}
