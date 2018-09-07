package zen_ze;

public class Zen_3 {
/*
 * Ìæ»»
 */
	public Zen_3() {
		// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args) {
		 
		    String str2="tomqqqqqqjackwwwwwsumeeeeeeelucky";
			String s2=str2.replaceAll("(.)\\1+"," ");
			System.out.println(s2);
			String str="12345678900";
			String s1=str.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1####$2");					
			System.out.println(s1);
		
	}

}
