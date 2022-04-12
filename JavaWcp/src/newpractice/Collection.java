package newpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {
	public static void main(String[] args) {
		Hero a = new Hero();
		Hero b = new Hero();
		a.setName("斎藤");
		b.setName("鈴木");
		
		List<Hero> heros = new ArrayList<Hero>();
		heros.add(a);
		heros.add(b);
		for (Hero h : heros) {
			System.out.println(h.getName());
		}
		
		Map<Hero, Integer> points = new HashMap<Hero, Integer>();
		points.put(a, 3);
		points.put(b, 7);
		
		for(Hero key : points.keySet()) {
			int value = points.get(key);
			System.out.println(key.getName() + "が倒した敵の数は" + value);
		}
	}

}
