package Worker;

import Strategy.ICanCook;
import Strategy.WhatICan;

public class AssistantCook {
	
	public WhatICan cook;
	String name;
	
	public AssistantCook(){
		name = "Assistan cook";
		cook = new ICanCook();
	}
	
	public String getName(){
		return name;
	}

	public String work() {
		// TODO Auto-generated method stub
		return " cooks meal";
	}

}
