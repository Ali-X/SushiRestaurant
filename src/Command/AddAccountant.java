package Command;

import Worker.Accountant;

public class AddAccountant extends AddWorker {

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		AddWorker.closet.accountant = new Accountant();
		System.out.println(AddWorker.closet.accountant.getName() + " is coming...");
	}

}
