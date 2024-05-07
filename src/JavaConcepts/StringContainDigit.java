package JavaConcepts;

public class StringContainDigit {
	
	static boolean StringContainDigit(String str, int n) 
    { 
        for (int i = 0; i < n; i++) { 
 
            if (str.charAt(i) < '0' || str.charAt(i) > '9') 
            { 
            	return false; 
            } 
        }
     return true; 
    
    } 
	public static void main(String[] args) {
		String str = "123"; 
        int len = str.length(); 
        System.out.println("String contain only digit:");
        System.out.print(StringContainDigit(str, len));
	}

}
