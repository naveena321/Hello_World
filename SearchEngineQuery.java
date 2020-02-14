package helloWorld;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;
import java.util.TreeMap;


public class PopularWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=1;
		Map<String, Integer> inputString=new TreeMap<String, Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of times to print the strings:");
		int numberoftimes=s.nextInt();
		s.nextLine();
		for (int j = 0; j < numberoftimes; j++) {
		System.out.println("enter the nameof String:");
		String popularWords=s.nextLine();
		if(popularWords.contains("top") == true){
			String[] list=popularWords.split(" ");
			if(list[0].equalsIgnoreCase("top")){
				int rank=Integer.parseInt(list[1]);
				Map<String, Integer> sortByComparator = sortByComparator(inputString, false);
				findMostPopularWordSearch(sortByComparator,rank);
			}
			s.close();
		}
		else if(inputString.get(popularWords) == null){
			inputString.put(popularWords, i);
		}
		else{
			inputString.put( popularWords, inputString.get(popularWords) + 1 );
			}
		}
	}
	
	private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order)
    {

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

       
        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2)
            {
                if (order)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
            
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
        
       
    	}

		private static void findMostPopularWordSearch(Map<String, Integer> popularsWordList, int rank) {
			int count=1;
			//System.out.println(popularsWordList+""+rank);
			for (Map.Entry<String, Integer> entry : popularsWordList.entrySet()) {
				if (entry.getKey() != null && count<=rank) {
					System.out.print(entry.getKey() + " ");
					count++;
				}
			}
		}
}


