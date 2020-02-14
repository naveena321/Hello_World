package helloWorld;

import java.util.*;

public class RoundingGrade {
public static void main(String[] args) {
	List<Integer> roundedGrade=new ArrayList<Integer>();
	roundedGrade.add(73);
	roundedGrade.add(47);
	roundedGrade.add(38);
	roundedGrade.add(33);
	roundedGrade.add(87);
	System.out.println(gradingStudents(roundedGrade));
}
public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> roundedGrade=new ArrayList<Integer>();
    int temp=0;
    for(Integer in:grades) {
    
    	temp=5-in%5;
    	
    if((temp<3) && in>=38){
    	int res=in+temp;
        roundedGrade.add(res);
    }
    else
    {
        roundedGrade.add(in);
    }
    }
    return roundedGrade;

}
}
