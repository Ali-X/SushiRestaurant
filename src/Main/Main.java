package Main;

public class Main {
	
	public static void main (String[] args){
		Facade facade = new Facade();
		
		System.out.println("Good morning!\n");
		facade.StartWork();
		
		System.out.println("\nLet's make an order.");
		System.out.println("Here we go!\n");
		facade.CreateOrder();
		
		facade.EndWork();
	}

}
