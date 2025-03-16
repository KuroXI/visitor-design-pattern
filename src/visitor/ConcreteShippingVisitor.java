package visitor;

import furniture.Chair;
import furniture.Sofa;

public class ConcreteShippingVisitor implements ShippingCostVisitor {
	private double totalShippingCost = 0;
	private static final double BASE_CHAIR_PRICE = 8.0;
	private static final double BASE_SOFA_RATE = 5.0;

	@Override
	public void visit(Chair chair) {
		double cost = switch (chair.size()) {
			case SMALL -> BASE_CHAIR_PRICE;
			case MEDIUM -> BASE_CHAIR_PRICE * 1.3;
			case LARGE -> BASE_CHAIR_PRICE * 1.6;
		};

		System.out.println("Chair shipping cost: $" + cost);
		totalShippingCost += cost;
	}

	@Override
	public void visit(Sofa sofa) {
		double cost = BASE_SOFA_RATE * sofa.length() * sofa.width();

		System.out.println("Sofa shipping cost: $" + cost);
		totalShippingCost += cost;
	}

	public double getTotalShippingCost() {
		return totalShippingCost;
	}
}
