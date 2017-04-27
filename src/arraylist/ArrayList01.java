package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// ArrayList 是 List 的子类，可以直接通过对象的多态性为List接口实例化。
// 动态数组？

public class ArrayList01 {
	public static void main(String[] args) {
		List<String> allList = null; // 定义List对象
		Collection<String> allColletion = null; // 定义Collection对象
		
		allList = new ArrayList<String>(); // 实例化List对象，只能是String类型
		allColletion = new ArrayList<String>();// 实例化Collection，只能是String类型
		
		allList.add("Hello"); // 从Collection继承的方法
		allList.add(0,"World"); // 此方法为List扩充的方法 将元素加入到特定的位置中
		System.out.println(allList); 
		
		allColletion.add("LXH");
		allColletion.add("www.mldn.cn");
		
		allList.addAll(allColletion);
		allList.addAll(0,allColletion);
		
		System.out.println(allList);
		
		allList.remove(0); // 删除指定位置的元素
		allList.remove("Hello"); // 删除指定内容的元素
		
		System.out.println(allList);
		
		// 输出ArrayList中的所有元素
		for(int i = 0;i<allList.size();i++){
			System.out.print(allList.get(i)+"、");
		}
	}
}
