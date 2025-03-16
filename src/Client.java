import furniture.Chair;
import furniture.Furniture;
import furniture.Sofa;
import visitor.ConcreteShippingVisitor;

public class Client {
	public static void main(String[] args) {
		Furniture chair = new Chair(5, Chair.Size.LARGE);
		Furniture sofa = new Sofa(6, 3);

		ConcreteShippingVisitor visitor = new ConcreteShippingVisitor();

		chair.accept(visitor);
		sofa.accept(visitor);

		System.out.println("Total Shipping Cost: $" + visitor.getTotalShippingCost());
	}
}
