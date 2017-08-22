package Command;

import Restaurant.Closet;

public abstract class AddWorker {
	
	public static Closet closet;
	
	public abstract void excecute();
	
	public AddWorker(){
		closet = Closet.getInstance();
	}

}
