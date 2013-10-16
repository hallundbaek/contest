package tests;

import tests.Triplet;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Btest0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double ratio = scanner.nextDouble();
		int n = scanner.nextInt();
		int answer = 0;
		PriorityQueue<Triplet<Double, Integer, Integer>> queue = new PriorityQueue<Triplet<Double, Integer, Integer>>(1000, Collections.reverseOrder());
		double minimal = 1000000;
		for (int i = 0; i < n; i++) {
			Integer tmp = scanner.nextInt();
			Triplet<Double, Integer, Integer> test = new Triplet<Double, Integer, Integer>(
					tmp.doubleValue(), tmp, 1);
			queue.add(test);
			if (tmp < minimal) {
				minimal = tmp;
			}
		}
		scanner.close();
		double highest = queue.peek().weight;
		while (minimal / highest < ratio) {
			Triplet<Double, Integer, Integer> p = queue.remove();
			p.cuts += 1;
			p.weight = (double) p.originalweight / p.cuts;
			if (p.weight < minimal) {
				minimal = p.weight;
			}
			queue.add(p);
			answer++;
			highest = queue.peek().weight;
		}
		System.out.println(answer);
	}
}
