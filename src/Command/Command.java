package Command;

public class Command {
	
	AddWorker commands[];
	
	public Command(){
		commands = new AddWorker[6];
	}
	
	public void setCommand(int slot, AddWorker command){
		commands[slot] = command;
	}
	
	public void getCommand(int slot){
		if (slot < commands.length)
			commands[slot].excecute();
		else System.out.println("Wrong command!");

	}

}
