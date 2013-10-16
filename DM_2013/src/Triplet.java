package tests;

public class Triplet<W, WO, C> implements Comparable<W> {
	W weight;
	WO originalweight;
	C cuts;

	public Triplet(W a, WO b, C c) {
		this.weight = a;
		this.originalweight = b;
		this.cuts = c;
	}

	public W getA() {
		return weight;
	}

	public WO getB() {
		return originalweight;
	}

	public C getC() {
		return cuts;
	}

	@Override
	public int compareTo(W other) {
		return ((Double) weight).compareTo((Double)((Triplet) other).weight);
	}
	

}