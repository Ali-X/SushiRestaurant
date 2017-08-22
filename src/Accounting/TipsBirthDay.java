package Accounting;

public class TipsBirthDay implements Chain {

	@Override
	public void setNextChain(Chain NextChain) {
		// TODO Auto-generated method stub

	}

	@Override
	public double calculate(double price, Visitor day) {
		// TODO Auto-generated method stub
		if (day.getName() == "Birthday") {
			return price * 0.05;
		} else {
			System.out.println("No tips for today.");
			return 0;
		}

	}

}
