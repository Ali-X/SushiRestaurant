package Command;

import Worker.CleaningWoman;



public class AddCleaningWoman extends AddWorker {

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		AddWorker.closet.cleaningwoman = new CleaningWoman();
		System.out.println(AddWorker.closet.cleaningwoman.getName() + " is coming...");
	}

}
