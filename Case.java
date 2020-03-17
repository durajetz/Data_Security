public class Case {

    public String lower(String s) {
		  String st = s.toLowerCase();
		  return st;
	
	  }
	
	  
    public String upper(String s) {
		  String st = s.toUpperCase();
		  return st;
		
	  }
	
	  
    public String inverse(String s) {
		  char[] chars = s.toCharArray();
		  for(int i = 0 ;i < chars.length; i++) {
			  chars[i] = Character.isUpperCase(chars[i])
							? Character.toLowerCase(chars[i])
							: Character.toUpperCase(chars[i]);
		  }
		  return new String(chars);
	  }
	
	  
    public String alternating(String s) {
		  char[] chars = s.toCharArray();
	  	for(int i = 0 ;i < chars.length; i++) {
		  	chars[i] = i%2 == 0
							? Character.toLowerCase(chars[i])
							: Character.toUpperCase(chars[i]);
		  }
		  return new String(chars);
	  }
    
