package array;

public class CeSi {

	public CeSi() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) {
	int[] n={1,2,3,4,5,6,7,8};
	int sum=add(n);
	System.out.println("���������Ϊ:"+sum);
	
	int newsum=newAdd(1,2,34,4,5,5,5);
	System.out.println(newsum);
	int newsum1=newAdd(34,45,55);
	System.out.println(newsum1);
}
public static int add(int[] i) {
	int sum=0;
	for(int k=0;k<i.length;k++)
		sum=sum+i[k];
	// TODO �Զ����ɵķ������
	return sum;
 
}
public static int newAdd(int... i) {
	int sum=0;
	for(int k=0;k<i.length;k++)
		sum=sum+i[k];
	// TODO �Զ����ɵķ������
	return sum;
 
}
}
