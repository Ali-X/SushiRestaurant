package Accounting;

public class TipsHolliDay implements Chain {

	private Chain nextChain;

	@Override
	public void setNextChain(Chain NextChain) {
		// TODO Auto-generated method stub
		nextChain = NextChain;
	}

	@Override
	public double calculate(double price, Visitor day) {
		// TODO Auto-generated method stub
		if (day.getName() == "Holliday") {
			return price * 0.20;
		} else {
			return nextChain.calculate(price, day);
		}
	}

}
