package 软件工程;
import java.util.*;
public class Shuru{
	public static void main(String[] args) {
	String str = "零一二三四五六七八九十";
	int a=0;
	Map<String,String> map = new HashMap<String,String>();
	Scanner sc=new Scanner(System.in);
	while(true) {
	String shuru=sc.nextLine().trim();
	String[] array=shuru.split(" ");
	
	{
	if(array[0].equals("整数")) {
		a=str.indexOf(array[3]);
		map.put(array[1], array[3]);
		continue;
	}
	if(array[1].equals("减少")){
		int b1=str.indexOf(map.get(array[0]));
		b1=b1-str.indexOf(array[2]);
		String s2=str.substring(b1,b1+1);
		map.put(array[0], s2);
		continue;
	}
	if(array[1].equals("增加")){
		int b1=str.indexOf(map.get(array[0]));
		b1=b1+str.indexOf(array[2]);
		String s2=str.substring(b1,b1+1);
		map.put(array[0], s2);
		continue;
}
	if(array[0].equals("看看")) {
		System.out.println(map.get(array[1]));
		continue;
	}
	if(array[7].equals("否则")) {
		int b=str.indexOf(array[3]);
		if(a>b) {
			System.out.println(array[6]);
			continue;
		}
		else {
			System.out.println(array[9]);
			continue;
		}
	}
	if(array[8].equals("否则")) {
		int a1=str.indexOf(map.get(array[1]));
		int a2=str.indexOf(map.get(array[5]));
		int a3=str.indexOf(array[3]);
		if(a1>a3) {
			if(array[6].equals("增加")){
				a2=a2+str.indexOf(array[7]);
				String s3=str.substring(a2,a2+1);
				map.put(array[5], s3);
				continue;
		}
			if(array[6].equals("减少")){
				a2=a2-str.indexOf(array[7]);
				String s3=str.substring(a2,a2+1);
				map.put(array[5], s3);
				continue;
		}
		}
	}
}
}
}
}