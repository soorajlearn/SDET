package week5.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class Problem3 {

	private static final String Set = null;

	@Test
	public void test1(){
		List<String> tran = new ArrayList<String>();
		tran.add("notebook");
		tran.add("notebook");
		tran.add("mouse");
		tran.add("keyboard");
		tran.add("mouse");
		result(tran);
	}
	
	public void result(List<String> tran){
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		List<String> output = new ArrayList<String>();
		
		for (String string : tran) {
			map.put(string, map.getOrDefault(string, 0)+1);
		}
		
		
		for (Map.Entry<String, Integer> string : map.entrySet()) {
			output.add(string.getKey()+" "+string.getValue());
		}
		
		
		
		
	}
}
