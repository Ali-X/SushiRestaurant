package Command;

public class AddNewWorkerAdapter extends AddWorker {

	AddAssistantCook newworker = new AddAssistantCook();

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		newworker.add();
	}

}
