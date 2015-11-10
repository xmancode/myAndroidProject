import java.util.ArrayList;
import java.util.List;


public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		List<Integer> digits = new ArrayList<Integer>();
		digits.add(8);
		digits.add(5);
		digits.add(8);
		digits.add(6);
		
		//digits.add(digits.size()-2, digits.get(digits.size()-2)+digits.get(digits.size()-1));
		//System.out.print(digits.get(digits.size()-2));
		//digits.set(digits.size()-1,8);
		for(int i = 0; i < digits.size(); i++) {
			System.out.println(digits.get(digits.size()-1));
        }
		
	}

}
