package MyPackage;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "geeksforgeeks"; 
		  
	    System.out.println(replacingConsonants(s)); 

	}
	
	
	
	static String replacingConsonants(String s) 
	{ 
	    
	      String str = "aaaeeeeiiiiioooooouuuuuuuu"; 
	      char[] st = s.toCharArray(); 
	    for (int i = 0; i < s.length(); i++)  
	    { 
	    	
 	       int index = st[i]-'a';  
	       st[i] = str.charAt(index); 
	    } 
	    String str1 = new String(st); 
	    return str1; 
	}

}
