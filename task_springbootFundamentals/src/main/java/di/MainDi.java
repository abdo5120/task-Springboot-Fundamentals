package di;

public class MainDi
{
	public static void main(String[] args) {

		Printer printer = new Printer();
		UserService userService = new UserService(printer);

		userService.performService("This is my Report..");
	}

}
