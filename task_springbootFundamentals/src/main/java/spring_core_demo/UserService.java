package spring_core_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    private Printer printer;

    @Autowired
    public UserService(Printer printer)
    {
        this.printer = printer;
    }

    @Autowired
    public void setPrinter(Printer printer)
    {
        this.printer = printer;
    }

    public void performService(String report)
    {
        printer.print(report);
    }
}
