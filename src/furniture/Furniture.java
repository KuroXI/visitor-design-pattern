package furniture;

import visitor.ShippingCostVisitor;

public interface Furniture {
	void accept(ShippingCostVisitor visitor);
}
