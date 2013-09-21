package opg5;

public class Edge {
	public int price;
	public Node A;
	public Node B;

	public Edge(Node A, Node B) {
		this.A = A;
		this.B = B;
		this.price = 1;
	}

	public boolean equals(Object obj){
		return ((Edge) obj).A.equals(A) && ((Edge) obj).B.equals(B) && (((Edge) obj).price == this.price);
	}

	public void relax(){
		if (this.A.hIndex > this
	}
}
