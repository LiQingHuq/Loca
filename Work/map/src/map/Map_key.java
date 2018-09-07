package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_key {

	public Map_key() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args)  {		
		Map<Integer,String>map=new HashMap<Integer,String>();
		method(map);
	}
	public static void method(Map<Integer,String> map){//学号，姓名
		//添加元素
		System.out.println(map.put(8, "jack"));
		System.out.println(map.put(8, "tom"));
		map.put(1, "cat");
		map.put(2, "cggat");
		map.put(3, "aat");
		map.put(4, "dat");
		map.put(67, "pasdat");
		System.out.println(map);
		System.out.println(map.remove(2));
		System.out.println(map);
		System.out.println(map.containsKey(6));
		System.out.println(map.containsValue("cat"));
		System.out.println(map.isEmpty());
		System.out.println(map.get(4)); 
		System.out.println(map.size());
//		System.out.println(map.put(2, "cat"));
//		System.out.println(map.put(6, "dog"));
		//
		Collection<String>values=map.values();
		Iterator<String>it5=values.iterator();
		while(it5.hasNext()){
			Object o=it5.next();
			System.out.println(o+"...................................................");
		}
		
		Set<Integer> keySet=map.keySet();
		Iterator<Integer> it=keySet.iterator();
				while(it.hasNext()){
					Object obj=it.next();	
					String value=map.get(obj)
;					System.out.println(obj+"----"+value);
				}
				
				
				//通过Map转成set可以迭代
				//找到另一个方法entrySet，
				//该方法将建和值的映射关系作为对象存储到Set集合中而这个类型就是Map.Entry类型（结婚证）
				Set<Map.Entry<Integer, String>>entrySet=map.entrySet();
				Iterator<Map.Entry<Integer, String>> it1=entrySet.iterator();
				while(it1.hasNext())
				{
					Map.Entry<Integer, String>me=it1.next();
					Integer i=me.getKey();
					String s=me.getValue();
					System.out.println(i+"........."+s);
					}
				}

}
