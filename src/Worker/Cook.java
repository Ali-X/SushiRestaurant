package Worker;

import Strategy.ICanCook;

public class Cook extends Worker {
	
	public Cook(){
		name = "Cook";
		cook = new ICanCook();
	}

}
