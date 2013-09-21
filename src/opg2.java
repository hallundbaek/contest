import java.util.Arrays;


public class opg2 {

	/**
	 * @param args
	 */
	public boolean canBreadsort(int length, int[] input, int[] result){
		while (length > 3) {
			sortFirst(input, result, length);
			input = Arrays.copyOfRange(input, 1, length);
			result = Arrays.copyOfRange(result, 1, length);
			length --;
		}
		/*for (int i : input) {
			System.out.println(i);
		}*/
		return validPermutation(input, result);	
	}

	private boolean compareArray(int[] a, int[] b, int length) {
		boolean toggle = true;
		for (int i = 0; i < length; i++){
			if (a[i] != b[i]) {
				toggle = false;
			}
		}
		return toggle;
	}
	private boolean validPermutation(int[] a, int[] b) {
		for (int i = 0; i < 3; i++) {
			if (compareArray(a, b, 3)) {
				return true;
			} else {
				threeSwap(a, 2);
			}
		}
		return false;
	}

	private void sortFirst(int[] input, int[] result, int length){
		int a = result[0];
		int index = find(length, input, a);
		while (index != 0) {
			if (index == 1) {
				index ++;
				threeSwap(input, index);
			}
			threeSwap(input, index);
			index = index - 2;
		}
	}
	
	private int find(int length, int[] input, int x){
		for (int i = 0; i < length; i++) {
			if (input[i] == x) {
				return i;
			}
		}
		return -1;
	}

	private void threeSwap(int[] input, int x){
		int a = input[x-2];
		int b = input[x-1];
		int c = input[x];
		input[x-2] = c;
		input[x-1] = a;
		input[x] = b;
	}

}
