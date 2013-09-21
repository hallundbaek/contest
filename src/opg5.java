import java.util.ArrayList;
import opg5.*;

public class opg5 {

	ArrayList<Node> nodes = new ArrayList<>();
	ArrayList<Edge> edges = new ArrayList<>();
	ArrayList<Edge> requiredEdges = new ArrayList<>();

	public void makeNode(int i){
		Node node = new Node(i);
		this.nodes.add(node);
		}

	public void makeEdge(int a, int b, int price, boolean isRequired) {
		Node A = this.nodes.get(this.nodes.indexOf(new Node(a)));
		Node B = this.nodes.get(this.nodes.indexOf(new Node(b)));
		Edge edge = new Edge(A, B);
		A.edges.add(edge);
		B.edges.add(edge);
		if (isRequired){
			this.requiredEdges.add(edge);
		}
	}
}
