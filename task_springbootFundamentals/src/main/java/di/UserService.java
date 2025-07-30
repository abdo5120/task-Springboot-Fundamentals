package di;

public class UserService
{
    private Printer printer;

    public UserService(Printer printer)
    {
        this.printer = printer;
    }

    public void setPrinter(Printer printer)
    {
        this.printer = printer;
    }

    public void performService(String report)
    {
        printer.print(report);
    }
}
