public class opg4 {

	int threshold;
	int men = 0;
	int women = 0;
	int peopleInside = 0;
	int quesize = 0 ;
	
	public opg4(int threshold) {
		this.threshold = threshold;
	}

	public void allowedInside(String queue) {
		String personA, personB;
		quesize = queue.length();
		if (queue.isEmpty()) {
			System.out.println(peopleInside);
			return;
		} else if (queue.length() == 1) {
			 personA = queue.substring(0,1);
			 personB = personA;
			
		} else {
			 personA = queue.substring(0,1);
			 personB = queue.substring(1,2);
		}
		int ratio = this.men - this.women;
		if (threshold - Math.abs(ratio) > 0 ) {
			queue = putInside(personA, queue);
		}

		if (Math.abs(ratio) == threshold) {
			if (this.men < this.women) {
				queue = putInside(personA, personB, queue, "M");
			} else {
				queue = putInside(personA, personB, queue, "W");			
			}
		}
		if (quesize == queue.length()) {
			System.out.println(peopleInside);
			return;
		}
		allowedInside(queue);
	}

	private String putInside(String personA, String personB, String queue, String sex) {

		if (personA.equals(sex)) {
			if (personA.equals("M")){
				this.men ++;				
			} else {
				this.women ++;
			}
			this.peopleInside ++;	
			queue = queue.substring(1);
		} else if (personB.equals(sex)) {
			if (personB.equals("M")){
				this.men ++;				
			} else {
				this.women ++;
			}
			this.peopleInside ++;	
			queue = personA + queue.substring(2);
		}
		return queue;
	}
	
	private String putInside(String person, String queue) {
		if (person.equals("W")) {
			this.women ++;
			
		} else if (person.equals("M")) {
			this.men ++;
		}
		this.peopleInside ++;
		queue = queue.substring(1);
		return queue;
	}
}
