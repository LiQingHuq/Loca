/**
 * 
 */
package work2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**5
 * @author Administrator
 *
 */
public class Test{
	public static void main(String[] args) {
		//��������int���ͣ�ֵ���ַ�������
		Map<Integer, String>test=new HashMap<>();
	   //���
		test.put(1, "b");
		test.put(2, "a");
		String get=test.get(1);
		System.out.println(get);
		//�ж��Ƿ�����������
		boolean is=test.containsKey(1);
		System.out.println(is);
		//��ȡmap�������е�ֵ
	Collection<String> val=test.values();
		for(String v:val){
			System.out.println(v);
		}
		//�Ƴ�
		test.remove(1);
		//���
		test.clear();
		System.out.println("����"+test.size());
	}
	
}
