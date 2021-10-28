package HW06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location{
	private String city;
	private int lat,log;
	
	public Location(String city,int longitude,int latitude) {
		this.lat =latitude;
		this.log =longitude;
		this.city=city;
	}
	public void show() {
		System.out.println(city+"\t"+log+"\t"+lat);
	}
	
}

public class test3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Location> h=new HashMap<String,Location>();

		System.out.println("도시,경도,위도를 입력하세요.");
		
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			String st=sc.nextLine();
			StringTokenizer t=new StringTokenizer(st,",");

			String city=t.nextToken().trim();
			int longitude=Integer.parseInt(t.nextToken().trim());
			int latitude=Integer.parseInt(t.nextToken().trim());
			h.put(city,new Location(city,longitude,latitude));
			}
		Set<String> keys=h.keySet();
		Iterator<String> it=keys.iterator();
		
		System.out.println("--------------------------");
		while(it.hasNext()) {
			String n=it.next();
			Location l=h.get(n);
			l.show();
		}
		
		System.out.println("--------------------------");
		
		while(true) {
			System.out.print("도시 이름 >> ");
			String st=sc.next();
			if(st.equals("그만")) {
				break;
			}
			if(h.get(st)!=null) {
				h.get(st).show();
			}
			else {
				System.out.println(st+"는 없습니다.");
			}
		}
		sc.close();
	}
}

