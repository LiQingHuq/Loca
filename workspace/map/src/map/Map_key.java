package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_key {

	public Map_key() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args)  {		
		Map<Integer,String>map=new HashMap<Integer,String>();
		method(map);
	}
	public static void method(Map<Integer,String> map){//ѧ�ţ�����
		//���Ԫ��
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
				
				
				//ͨ��Mapת��set���Ե���
				//�ҵ���һ������entrySet��
				//�÷���������ֵ��ӳ���ϵ��Ϊ����洢��Set�����ж�������;���Map.Entry���ͣ����֤��
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
