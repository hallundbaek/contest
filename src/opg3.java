import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class opg3 {

	private ArrayList<Integer> cookieStorage = new ArrayList<>();
	

	public void parse(String command){
		if (command == "#") {
			popMedian();
		} else {
			cookieStorage.add(Integer.parseInt(command));
		}
	}

	private void popMedian(){
		Collections.sort(cookieStorage);
		int middle = 0;
		int size = cookieStorage.size();
		if (cookieStorage.isEmpty()) {
			return;
		}
		if (cookieStorage.size() % 2 == 1){
			middle = (size + 1)/2 -1;
		} else {
			middle = size/2;
		}
		System.out.println(cookieStorage.get(middle));
		cookieStorage.remove(middle);
	}
}
