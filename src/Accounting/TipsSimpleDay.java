package Accounting;

public class TipsSimpleDay implements Chain {

	private Chain nextChain;

	@Override
	public void setNextChain(Chain NextChain) {
		// TODO Auto-generated method stub
		nextChain = NextChain;
	}

	@Override
	public double calculate(double price, Visitor day) {
		// TODO Auto-generated method stub
		if (day.getName() == "Simple day") {
			return price * 0.10;
		} else {
			return nextChain.calculate(price, day);
		}
	}

}
