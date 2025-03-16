package furniture;

import visitor.ShippingCostVisitor;

public record Sofa(double length, double width) implements Furniture {
	@Override
	public void accept(ShippingCostVisitor visitor) {
		visitor.visit(this);
	}
}
