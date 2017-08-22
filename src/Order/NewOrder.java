package Order;

import Accounting.Visitor;

public class NewOrder extends Order {

	@Override
	public void Additional() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double accept(Visitor v) {
		// TODO Auto-generated method stub
		return v.visit(this);
	}

}
