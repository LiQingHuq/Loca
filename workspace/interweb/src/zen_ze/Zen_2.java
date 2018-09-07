package zen_ze;

public class Zen_2 {
/*
 * 正则表达式——切割
 */
	public Zen_2() {
		// TODO Auto-generated constructor stub
	}
  public static void main(String[] args) {
	String str="tom,jack,sum,lucky";
	String[] s=str.split(",");
	for(String name:s)
		System.out.println(name);
	
	String str1="1 2 sum lucky";
	String[] s1=str1.split(" ");
	for(String name1:s1)
		System.out.println(name1);
	
	String str2="tomqqqqqqjackwwwwwsumeeeeeeelucky";
	String[] s2=str2.split("(.)\\1+");
	for(String name2:s2)
		System.out.println(name2);
	
}
}
