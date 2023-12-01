package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void sortSalary(TreeMap<String,Double> tm ) {
	Collection <Double> salaries=tm.values();
	List<Double> salaryList=new ArrayList<>();
	salaryList.addAll(salaryList);
	System.out.println("hfhfh");
	Collections.sort(salaryList);
	}
	

	public static void main(String[] args) {
TreeMap<String ,Double> tm=new TreeMap<>();
tm.put("aniket", 2332.0);
tm.put("ram", 11.0);
tm.put("raj", 1212.0);
tm.put("rajesh", 2313135.0);
System.out.println(tm);

System.out.println(tm.containsKey("raju"));
System.out.println(tm.containsValue(11.0));
System.out.println("salary: "+ tm.get("aniket"));

Set <String> nameSet=tm.keySet();
for(String nm: nameSet) {
	System.out.println(nm.toUpperCase());

System.out.println(sortSalary(tm));

Set<Entry<String , Double>> emp=tm.entrySet();
}




	}

}

