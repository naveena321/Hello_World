import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class TopProduct {
	public static void main(String[] args) {
		int i;
		Map<String, Integer> topProductsList=new HashMap<String, Integer>();
		Scanner s=new Scanner(System.in);
		int testcase=s.nextInt();
		for (int k = 0; k < testcase; k++) {
		//System.out.println("enter the no.of times to give product list:");
		int numberoftimes=s.nextInt();
		s.nextLine();
		for (int j = 0; j < numberoftimes; j++) {
		//System.out.println("enter the nameof String:");
		int tot = 0;
		String mostSoldProduct=s.nextLine();
		
		String[] list=mostSoldProduct.split("\\s");
		if(list.length>1){
		 tot=Integer.parseInt(list[1]);
		}
		if(mostSoldProduct.contains("top") == true){
				findMostPopularWordSearch(topProductsList,1);
		}
		else if(topProductsList.get(list[0]) == null){
			topProductsList.put(list[0], tot);
		}
		else{
			topProductsList.put( list[0], topProductsList.get(list[0]) + tot );
			}
		}
		}
	}

	private static void findMostPopularWordSearch(Map<String, Integer> productsList, int rank) {
		
			Set<Entry<String, Integer>> entries = productsList.entrySet();
			Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {
            
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };
        
        // Sort method needs a List, so let's first convert Set to List in Java
        List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(entries);
        
        // sorting HashMap by values using comparator
        Collections.sort(listOfEntries,valueComparator);
        
        LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>(listOfEntries.size());
        System.out.println(listOfEntries.get(listOfEntries.size()-1).getKey());
       
	}

}
