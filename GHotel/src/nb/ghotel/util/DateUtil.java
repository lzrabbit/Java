package nb.ghotel.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class DateUtil {

	public static Date parse(String source) {
		String pattern = "yyyy-MM-dd";
		if (source.contains(":")) {
			pattern += " HH:mm:ss";
		}
		return parse(source, pattern);
	}

	public static Date parse(String source, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		try {
			return format.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static Date parse(int year, int month, int day) {
		return Parse(year, month, day, 0, 0, 0);
	}

	public static Date Parse(int year, int month, int day, int hour,
			int minute, int second) {

		String source = String.format("%s-%s-%s %s:%s:%s", year,
				month < 10 ? "0" + month : month, day < 10 ? "0" + day : day,
				hour < 10 ? "0" + hour : hour, minute < 10 ? "0" + minute
						: minute, second < 10 ? "0" + second : second);
		return parse(source);
	}

	public static Date now() {
		return new Date();
	}

	public static Date today() {
		return new Date();
	}
}
