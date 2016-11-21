package com.baobaotao.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static Date getDate(String datestr, String format) {
		try {
			//依据format格式把日期字符串转化为日期对象
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			dateFormat.setLenient(true);
			return dateFormat.parse(datestr);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
}
