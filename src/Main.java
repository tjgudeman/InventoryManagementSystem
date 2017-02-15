/**
 * The InventoryManagementSystem program implements a given interface which
 * allows user to enter and remove inventory items
 * 
 * @author Trevor Gudeman
 * @version 1.0
 * @since 2017-02-14
 */
public class Main {

	public static void main(String[] args) {
		String idA = "This";
		String idB = "That";
		int quantityA = 5;
		int quantityB = 20;

		Inventory Tester = new Inventory();

		Tester.restockProduct(idA, quantityA);
		System.out.println("First enter");
		Tester.restockProduct(idA, quantityA);
		Tester.restockProduct(idB, quantityB);
		Tester.pickProduct(idA, 10);
		System.out.println("second enter");

		Tester.seeAll();
	}
}
