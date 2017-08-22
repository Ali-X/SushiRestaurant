package Worker;

import Client.State;
import Strategy.WhatICan;

public abstract class Worker {
	
	public WhatICan takemoney;
	public WhatICan givebill;
	public WhatICan clean;
	public WhatICan cook;
	public WhatICan distribute;
	public WhatICan wash;
	
	String name;
	State state;
	
	public String getName(){
		return name;
	}
	
	public void update(State state){
		this.state = state;
		printTheNotifications();
	}

	private void printTheNotifications() {
		// TODO Auto-generated method stub
		System.out.println("The client " + state.getState() + ".");
	}

}
