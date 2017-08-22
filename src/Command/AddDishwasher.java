package Command;

import Worker.Dishwasher;

public class AddDishwasher extends AddWorker {

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		AddWorker.closet.dishwasher = new Dishwasher();
		System.out.println(AddWorker.closet.dishwasher.getName() + " is coming...");
	}

}
