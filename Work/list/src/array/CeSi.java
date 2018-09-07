package array;

public class CeSi {

	public CeSi() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	int[] n={1,2,3,4,5,6,7,8};
	int sum=add(n);
	System.out.println("整形数组和为:"+sum);
	
	int newsum=newAdd(1,2,34,4,5,5,5);
	System.out.println(newsum);
	int newsum1=newAdd(34,45,55);
	System.out.println(newsum1);
}
public static int add(int[] i) {
	int sum=0;
	for(int k=0;k<i.length;k++)
		sum=sum+i[k];
	// TODO 自动生成的方法存根
	return sum;
 
}
public static int newAdd(int... i) {
	int sum=0;
	for(int k=0;k<i.length;k++)
		sum=sum+i[k];
	// TODO 自动生成的方法存根
	return sum;
 
}
}
