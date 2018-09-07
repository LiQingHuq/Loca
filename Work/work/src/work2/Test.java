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
		//键必须是int类型，值是字符串类型
		Map<Integer, String>test=new HashMap<>();
	   //添加
		test.put(1, "b");
		test.put(2, "a");
		String get=test.get(1);
		System.out.println(get);
		//判断是否存在这个数据
		boolean is=test.containsKey(1);
		System.out.println(is);
		//获取map里面所有的值
	Collection<String> val=test.values();
		for(String v:val){
			System.out.println(v);
		}
		//移除
		test.remove(1);
		//清除
		test.clear();
		System.out.println("长度"+test.size());
	}
	
}
