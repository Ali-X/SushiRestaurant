package Worker;

import Command.AddAccountant;
import Command.AddCleaningWoman;
import Command.AddCook;
import Command.AddDishwasher;
import Command.AddNewWorkerAdapter;
import Command.AddWaiter;
import Command.AddWorker;
import Command.Command;
import Restaurant.Closet;

public class Administrator extends Worker {

	public Closet closet;
	public Administrator() {
		name = "administrator";
		Commands();
		closet = Closet.getInstance();
	}

	private static Administrator firstInst = null;
	public Command commandBook = new Command();

	public static Administrator getInstance() {

		if (firstInst == null) {
			firstInst = new Administrator();
		}
		return firstInst;
	}

	public void Commands() {

		AddWorker accountant = new AddAccountant();
		AddWorker cleaningwoman = new AddCleaningWoman();
		AddWorker cook = new AddCook();
		AddWorker dishwasher = new AddDishwasher();
		AddWorker waiter = new AddWaiter();
		AddWorker assistantcook = new AddNewWorkerAdapter();
		commandBook.setCommand(0, accountant);
		commandBook.setCommand(1, cleaningwoman);
		commandBook.setCommand(2, cook);
		commandBook.setCommand(3, dishwasher);
		commandBook.setCommand(4, waiter);
		commandBook.setCommand(5, assistantcook);
	}

}
