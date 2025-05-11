// TestDriller.java

public class TestDriller {

	static int[] quantity = {4, 9, 29, 49, 99, 199, 499, Integer.MAX_VALUE};
	static int[] prices  = {2000, 1800, 1600, 1500, 1300, 1200, 1100, 1000};

	public static int getPrices(int copies) {
	int price = 0;
	for (int counter = 0; counter < quantity.length; counter++) {
		if (copies <= quantity[counter]) {
			return price = prices[counter];
		}
			}
		return price;
}

	public static int getTotalPrices(int copies) {
		int pricePerCopy = getPrices(copies);
		return copies * pricePerCopy;
	}
}