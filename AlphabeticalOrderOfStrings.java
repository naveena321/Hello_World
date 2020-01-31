package helloWorld;

import java.util.Scanner;

public class AlphabeticalOrder{

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan=new Scanner(System.in);
    String str=scan.next();
    int k=scan.nextInt();
    java.util.SortedSet<String> sets=new java.util.TreeSet<String>();
    for(int i=0;i<=str.length()-k;i++){
        sets.add(str.substring(i,i+k));
    }
    System.out.println(sets.first());
    System.out.println(sets.last());
}
}
