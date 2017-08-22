package Main;

public class Facade {
	
	UI ui = new UI();
	
	public void StartWork(){
		ui.CreateAdmin();
	}
	public void CreateOrder(){
		ui.MakeOrder();
		ui.WhatKindFish();
		ui.WhatKindDish();
		ui.Delivery();
		ui.Tips();
		ui.WhatDay();
		ui.OrderInfo();	
	}
	public void EndWork(){
		ui.CheckEmployees();
	}

}
