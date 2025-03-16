package visitor;

import furniture.Chair;
import furniture.Sofa;

public interface ShippingCostVisitor {
	void visit(Chair chair);
	void visit(Sofa sofa);
}
