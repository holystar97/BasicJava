package oop1223;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test04_SetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		//Set: 
		Set set=new HashSet();
		set.add(3);
		set.add(2.4);
		set.add("");
		set.add(new Character('R'));
		System.out.println(set.size());
			
	    Iterator iter=set.iterator();
	    while(iter.hasNext()) {
	    	Object obj=iter.next();
	    }*/
		
		/*
		Map map=new HashMap();
		map.put("one",3);
		map.put("Two", 2.4);
		map.put("Three", "okdol");
		map.put("Four", new Character('R'));
		
		System.out.println(map.size());
	    
		
		map.put("one",5);
		map.put("Five","okdol");
		System.out.println(map.get("one"));
		System.out.println(map.get("Five"));
		*/
		
		
		/*문 = 기호를 기준으로 문자열을 분리해서 
		 *  = 의 문자열은 KEY
		 *  = 뒤의 문자열은 value로 map를 저장하고 
		 *  key값으로 "read.do" 호출하면
		 *  value 값으로 "net.bbs.Read" 출력하시오 
		 * */
		
		HashSet command=new HashSet();
		command.add("list.do=net.bbs.List");
		command.add("read.do=net.bbs.Read");
		command.add("write.do=net.bbs.Write");
		
		HashMap map=new HashMap();
		Iterator iter=command.iterator();
		while(iter.hasNext()) {
			Object obj=iter.next();
			String str=(String)obj;
//			System.out.println(str);
			int pos=str.indexOf("=");
			String key=str.substring(0,pos);
			String value=str.substring(pos+1);
			map.put(key, value);
		}
		System.out.println(map.get("read.do"));
		
	}

}
