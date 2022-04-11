package newpractice;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
public class Number {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 100; i++) {
			sb.append(i).append(",");
		}
		String s = sb.toString();
		System.out.println(s);
		String[] a = s.split(",");
		for (String b : a) {
			System.out.println(b);
		}
		
		FilePath fil = new FilePath();
		System.out.println(fil.concatPath("c\\folder", "file.txt"));
		
		Calendar c = Calendar.getInstance();
		Date now =new Date();
		c.setTime(now);
		int d = c.get(Calendar.DAY_OF_MONTH);
		d += 100;
		c.set(Calendar.DAY_OF_MONTH, d);
		Date date = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(date));
		
		LocalDateTime l = LocalDateTime.now();
		LocalDateTime fu = l.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(fu.format(fmt));
	}

}
