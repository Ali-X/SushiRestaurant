package Accounting;

public interface Chain {
	
	public void setNextChain(Chain NextChain);
	public double calculate(double price, Visitor day);

}
