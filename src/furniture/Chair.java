package furniture;

import visitor.ShippingCostVisitor;

public record Chair(double weight, Size size) implements Furniture {
	public enum Size {SMALL, MEDIUM, LARGE}

	@Override
	public void accept(ShippingCostVisitor visitor) {
		visitor.visit(this);
	}
}
