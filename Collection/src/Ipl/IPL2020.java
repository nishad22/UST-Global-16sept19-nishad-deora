package Ipl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IPL2020 {
	public static void main(String[] args) {
		Player p1 = new Player(7,"Dhoni");
		Player p2 = new Player(18,"Kohli");
		Player p3 = new Player(45,"Rohit");
		Player p4 = new Player(22,"Yuvraj");
		Player p5 = new Player(17,"ABD");
		
		Map<Player, String> map = new HashMap<Player,String>();
		map.put(p1, "csk");
		map.put(p2, "rcb");
		map.put(p3, "mi");
		map.put(p4, "dd");
		map.put(p5, "rcb");
		
		Set <Player> allkeys = map.keySet();
		for (Player p: allkeys) {
			System.out.println(map.get(p));
		}
		
	}
}
