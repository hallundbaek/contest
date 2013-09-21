package opg5;

import java.util.ArrayList;

public class Node {
	public ArrayList<Edge> edges = new ArrayList<>();
	public boolean isVisited = false;
	public int name;
	public int hIndex;

	public Node(int name){
		this.name = name;
	}
	
	public boolean equals(Object obj){
		return this.name == ((Node) obj).name;
	}

	public int hashCode() {
		return this.name;
	}
}
