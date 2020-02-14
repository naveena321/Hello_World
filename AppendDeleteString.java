package helloWorld;

public class AppendDeleteString {

	public static void main(String[] args) {
		appendAndDelete("sfdnds", "sfdjkl", 10);
		
	}
		static void appendAndDelete(String s, String t, int k) {
			int commonLength = 0;
			        
			        for (int i=0; i<java.lang.Math.min(s.length(),t.length());i++){
			            if (s.charAt(i)==t.charAt(i))
			                commonLength++;
			            else
			                break;
			        }
			        if((s.length()+t.length()-2*commonLength)>k){
			            System.out.println("No");
			        }
			//CASE B
			        else if((s.length()+t.length()-2*commonLength)%2==k%2){
			            System.out.println("Yes");
			        }
			//CASE C
			        else if((s.length()+t.length()-k)<0){
			            System.out.println("Yes");
			        }
			//CASE D
			        else{
			            System.out.println("No");
			        }
			        // (floor(sqrt(b)) - ceil(sqrt(a)) + 1); 
		}
	

}
