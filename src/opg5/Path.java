package opg5;

import java.util.ArrayList;

public class Path {
	public ArrayList<Edge> edges = new ArrayList<>();
	
	public int totalPrice() {
		int price = 0;
		for (Edge edge : edges) {
			price = price + edge.price;
		}
		return price;
	}
}
