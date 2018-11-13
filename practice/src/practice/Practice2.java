package practice;

import java.util.Map;
import java.util.TreeMap;

public class Practice2 {

	public static void main(String[] args){
		Map<String, Object> abc = new TreeMap<String, Object>();
		abc.put("inoue1", "inoue");
		abc.put("inoue2", 222+222);
		abc.put("inoue3", 333);

		int value = Integer.parseInt(abc.get("inoue2").toString());
		System.out.println(value);

		if(abc.containsKey("inoue4")){
			System.out.println("inoue4は存在します");
		}else{
			System.out.println("inoue4は存在しません");
		}

		for(Map.Entry<String,Object> e: abc.entrySet()){
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}



}
