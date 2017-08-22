package Order;

import java.util.ArrayList;

import Restaurant.Closet;
import Worker.Waiter;
import Worker.Worker;

import Accounting.Visitor;
import Client.ClientEat;
import Client.ClientWaitBill;
import Client.ClientWaitOrder;
import Client.State;

public abstract class Order {
	
	private ArrayList<Worker> observers;
	private String order = null;
	private double price = 0;
	
	public State heeat = new ClientEat();
	public State hewaitsorder = new ClientWaitOrder();
	public State hewaitsbill = new ClientWaitBill();
	public State curr;
	
	public Order(){
		observers = new ArrayList<Worker>();
	}
	
	public void Register(Worker waiter) {
		// TODO Auto-generated method stub
		observers.add(waiter);
	}
	
	public void Notify() {
		// TODO Auto-generated method stub
		for (Worker observer: observers){
			observer.update(curr);
		}
	}
	
	public void setOrder(String order){
		if (this.order == null) this.order = order;
		else this.order += ", " + order;
	}
	
	public String getOtder(){
		return order;
	}
	
	public void setPrice(double price){
		this.price += price;
	}
	
	public double getPrice(){
		return price;
	}
	
	public abstract void Additional();
	public abstract double accept (Visitor v);
}
