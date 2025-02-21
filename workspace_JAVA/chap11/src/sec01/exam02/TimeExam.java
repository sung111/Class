package sec01.exam02;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class TimeExam {

	public static void main(String[] args) {
		
		long s = System.currentTimeMillis();
		
		System.out.println(s);
		
		long after = System.currentTimeMillis();
		System.out.println(after);
		
		Date date = new Date(after);
		System.out.println(date);
		
		String format = "yyyy³â MM¿ù ddÀÏ HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String formatDate = sdf.format(date);
		System.out.println(formatDate);

		
	}

}
