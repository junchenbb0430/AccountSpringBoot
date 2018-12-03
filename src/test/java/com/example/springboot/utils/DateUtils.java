package com.example.springboot.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 增加日期处理工具类
 * @author lijunshi
 *
 */
public class DateUtils {
	
	private static Logger logger = LoggerFactory.getLogger(DateUtils.class);

	/**
	 * 格式化日期为字符串 "yyyy" 年
	 */
	public static String getYYYY() {

		SimpleDateFormat df = new SimpleDateFormat("yyyy");
		return df.format(new Date());
	}
	
	/**
	 * 格式化日期为字符串 "yyyyMMdd" 当天
	 */
	public static String getToday() {

		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		return df.format(new Date());
	}

	/**
	 * 格式化日期为字符串 "yyyyMMdd" 明天
	 */
	public static String getTomorrow() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		Date date = calendar.getTime();

		return sdf.format(date);
	}

	/**
	 * 格式化日期为字符串 "yyyyMMdd" 前n天
	 */
	public static String getBeforeday(int n) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, n);
		Date date = calendar.getTime();

		return sdf.format(date);
	}

	/**
	 * 根据日期参数字符串 "yyyyMMdd",计算前n天
	 */
	public static String getBeforedays(String today, int n) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Date date = null;
		try {
			date = sdf.parse(today);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);

		calendar.add(Calendar.DAY_OF_YEAR, n);

		date = calendar.getTime();

		return sdf.format(date);
	}
	
	public static Calendar getBeforeday(String today, int n) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		Date date = null;
		try {
			date = sdf.parse(today);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);

		calendar.add(Calendar.DAY_OF_YEAR, n);

		return calendar;
	}

	/**
	 * 格式化日期为字符串 "yyyyMMddHHmmss" 当天
	 */
	public static String formatDateTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		return df.format(new Date());
	}

	/**
	 * 格式化日期为字符串 "dd" 当天为几号
	 */
	public static String getDay() {

		SimpleDateFormat df = new SimpleDateFormat("dd");
		return df.format(new Date());
	}

	/**
	 * 判断参数是星期几
	 */
	public static int dayForWeek(String dateTime) {

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

		Calendar c = Calendar.getInstance();
		try {
			c.setTime(format.parse(dateTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int dayForWeek = 0;

		if (c.get(Calendar.DAY_OF_WEEK) == 1) {
			dayForWeek = 7;
		} else {
			dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		}
		return dayForWeek;
	}

	/**
	 * 格式化日期为字符串 "yyyyMMdd"
	 */
	public static String formatDates(String time) {

		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			return df.format(sdf.parse(time));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Date getDate(String date) {
		return getDate(date, "yyyy-MM-dd", null);
	}

	public static Date getDate(String date, String format) {
		return getDate(date, format, null);
	}

	public static Date getDate(String date, String format, Date defVal) {
		Date d;
		try {
			d = new SimpleDateFormat(format).parse(date);
		} catch (ParseException e) {
			d = defVal;
		}
		return d;
	}
	
	
	private static Calendar calendar = Calendar.getInstance();

	/**
	 * 得到当前的时间，时间格式yyyy-MM-dd
	 * 
	 * @return
	 * 
	 *         author xuw
	 */
	public static String getCurrentDateStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}

	/**
	 * 得到当前的时间，时间格式yyyyMMdd
	 * 
	 * @return
	 * 
	 *         author xuw
	 */
	public static String getTransDateStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(new Date());
	}

	/**
	 * 得到当前的时间,自定义时间格式 y 年 M 月 d 日 H 时 m 分 s 秒
	 * 
	 * @param dateFormat
	 *            输出显示的时间格式
	 * @return
	 * 
	 *         author xuw
	 */
	public static String getCurrentDate(String dateFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(new Date());
	}

	/**
	 * 
	 * @param str
	 * @return Date
	 * 
	 *         author xuw
	 */
	public static Date getCurrentDate() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(getCurrentDateStr());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 日期格式化，默认日期格式yyyy-MM-dd
	 * 
	 * @param date
	 * @return
	 */
	public static String getFormatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}

	/**
	 * 日期格式化，自定义输出日期格式
	 * 
	 * @param date
	 * @return
	 * 
	 *         author xuw
	 */
	public static String getFormatDate(Date date, String dateFormat) {

		String formatPatern = null;
		if (date != null) {
			if (StringUtils.isNotEmpty(dateFormat)) {
				formatPatern = dateFormat;
			} else {
				formatPatern = "yyyy-MM-dd HH:mm:ss";
			}
			SimpleDateFormat sdf = new SimpleDateFormat(formatPatern);
			return sdf.format(date);

		} else {
			return "";
		}
	}

	/**
	 * 返回当前日期的前一个时间日期，amount为正数 当前时间后的时间 为负数 当前时间前的时间 默认日期格式yyyy-MM-dd
	 * 
	 * @param field
	 *            日历字段 y 年 M 月 d 日 H 时 m 分 s 秒
	 * @param amount
	 *            数量
	 * @return 一个日期
	 * 
	 *         author xuw
	 */
	public static String getPreDate(String field, int amount) {
		calendar.setTime(new Date());
		if (field != null && !field.equals("")) {
			if (field.equals("y")) {
				calendar.add(Calendar.YEAR, amount);
			} else if (field.equals("M")) {
				calendar.add(Calendar.MONTH, amount);
			} else if (field.equals("d")) {
				calendar.add(Calendar.DAY_OF_MONTH, amount);
			} else if (field.equals("H")) {
				calendar.add(Calendar.HOUR, amount);
			}
		} else {
			return null;
		}
		return getFormatDate(calendar.getTime());
	}

	/**
	 * 某一个日期的前一个日期
	 * 
	 * @param d
	 *            ,某一个日期
	 * @param field
	 *            日历字段 y 年 M 月 d 日 H 时 m 分 s 秒
	 * @param amount
	 *            数量
	 * @return 一个日期
	 * 
	 *         author xuw
	 */
	public static String getPreDate(Date d, String field, int amount) {
		calendar.setTime(d);
		if (field != null && !field.equals("")) {
			if (field.equals("y")) {
				calendar.add(Calendar.YEAR, amount);
			} else if (field.equals("M")) {
				calendar.add(Calendar.MONTH, amount);
			} else if (field.equals("d")) {
				calendar.add(Calendar.DAY_OF_MONTH, amount);
			} else if (field.equals("H")) {
				calendar.add(Calendar.HOUR, amount);
			}
		} else {
			return null;
		}
		return getFormatDate(calendar.getTime());
	}

	/**
	 * 某一个时间的前一个时间
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 * 
	 *             author xuw
	 */
	public static String getPreDate(String date) throws ParseException {
		Date d = new SimpleDateFormat().parse(date);
		String preD = getPreDate(d, "d", 1);
		Date preDate = new SimpleDateFormat().parse(preD);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(preDate);
	}

	/**
	 * 将符合格式的时间字符串转换成Date
	 * 
	 * @param str
	 * @return Date
	 * 
	 *         author xuw
	 */
	public static Date StrToFullDate(String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 将符合格式的时间字符串转换成Date
	 * 
	 * @param str
	 * @return Date
	 * 
	 *         author xuw
	 */
	public static Date StrToDate(String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 过滤非工作日 之 周末
	 * 
	 * @param date
	 *            日期 ,formatStr 日期格式化字符串
	 * 
	 * @return String 日期字符串
	 * 
	 *         author xuw
	 */
	public static String getDateStrFilterHoliday_weekend(Date date,
			String formatStr) {

		if (date.getDay() == 6) {

			date = DateUtils.StrToDate(getPreDate(date, "d", 2));

		} else if (date.getDay() == 0) {

			date = DateUtils.StrToDate(getPreDate(date, "d", 1));
		}
		return getFormatDate(date, formatStr);
	}

	/**
	 * 过滤非工作日 之 周末
	 * 
	 * @param date
	 *            日期 ,formatStr 日期格式化字符串
	 * 
	 * @return String 日期字符串
	 * 
	 *         author xuw
	 */
	public static Date getDateFilterHoliday_weekend(Date date) {

		if (date.getDay() == 6) {

			date = DateUtils.StrToDate(getPreDate(date, "d", 2));

		} else if (date.getDay() == 0) {

			date = DateUtils.StrToDate(getPreDate(date, "d", 1));
		}
		return date;
	}

	/**
	 * 计算日期 过滤掉非工作日 周末
	 * 
	 * @param date
	 *            日期 ,formatStr 日期格式化字符串
	 * 
	 * @return String 日期字符串
	 * 
	 *         author xuw
	 */
	public static String getPreDateStrFilterHoliday_weekend(Date date,
			int amount, String formatStr) {

		// 首先处理一下本身是否是周末
		date = getDateFilterHoliday_weekend(date);

		// 日期基数 的周几数
		int dateDay = date.getDay();

		// 临时应用 当前周几数 加上 要加的天数 用于判断是否跨越周数 之后会因每跨越一周而累加2
		int temp = amount + dateDay;

		// 跨域的周数
		int weeks = 1;

		// 当跨越一周 amount+2 计算出最终要加的天数
		while (temp > 6) {

			// 跨越一周要加的天数加2
			amount = amount + 2;

			// 岁amount增二 并减去一周的7天 ，
			temp = amount + dateDay - weeks * 7;

			weeks = weeks + 1;
		}
		// 当最终获得的日期为周六时 (经以上处理已过滤掉周日的情况)
		if ((amount + dateDay) % 7 == 6) {

			amount = amount + 2;
		}

		// 加上实际应该加的天数
		date = DateUtils.StrToDate(getPreDate(date, "d", amount));

		return getFormatDate(date, formatStr);
	}

	/**
	 * 计算日期 过滤掉非工作日 周末
	 * 
	 * @param date
	 *            日期
	 * 
	 * @return String 日期字符串
	 * 
	 *         author xuw
	 */
	public static Date getPreDateFilterHoliday_weekend(Date date, int amount) {

		// 首先处理一下本身是否是周末
		date = getDateFilterHoliday_weekend(date);

		// 日期基数 的周几数
		int dateDay = date.getDay();

		// 临时应用 当前周几数 加上 要加的天数 用于判断是否跨越周数 之后会因每跨越一周而累加2
		int temp = amount + dateDay;

		// 跨域的周数
		int weeks = 1;

		// 当跨越一周 amount+2 计算出最终要加的天数
		while (temp > 6) {

			// 跨越一周要加的天数加2
			amount = amount + 2;

			// 岁amount增二 并减去一周的7天 ，
			temp = amount + dateDay - weeks * 7;

			weeks = weeks + 1;
		}
		// 当最终获得的日期为周六时 (经以上处理已过滤掉周日的情况)
		if ((amount + dateDay) % 7 == 6) {

			amount = amount + 2;
		}

		// 加上实际应该加的天数
		date = DateUtils.StrToDate(getPreDate(date, "d", amount));

		return date;
	}

	/**
	 * getCurrentTime 获得当前时间 2011-11-15
	 * 
	 * @author yuxiang
	 * @return Date
	 */
	public static Date getCurrentTime() {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = myFormat.parse(myFormat.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_MIN_FORMAT = "yyyy-MM-dd HH:mm";
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String TIME_FORMAT = "HH:mm:ss";
	private static final String[] FORMATS = { "yyyy-MM-dd", "yyyy-MM-dd HH:mm",
			"yyyy-MM-dd HH:mm:ss", "HH:mm", "HH:mm:ss", "yyyy-MM" };

	public static Date convert(String str) {
		if ((str != null) && (str.length() > 0)) {
			if ((str.length() > 10) && (str.charAt(10) == 'T'))
				str = str.replace('T', ' ');
			String[] arr$ = FORMATS;
			int len$ = arr$.length;
			int i$ = 0;
			if (i$ < len$) {
				String format = arr$[i$];
				if (str.length() == format.length())
					;
				try {
					if (logger.isDebugEnabled()) {
						logger.debug("convert " + str + " to date format "
								+ format);
					}

					Date date = new SimpleDateFormat(format).parse(str);

					if (logger.isDebugEnabled())
						logger.debug("****" + date + "****");

					return date;
				} catch (ParseException e) {
					logger.warn(e.getMessage());

					++i$;
				}

			}

		}

		return null;
	}

	public static Date convert(String str, String format) {
		if (!(StringUtils.isEmpty(str)))
			try {
				Date date = new SimpleDateFormat(format).parse(str);
				return date;
			} catch (ParseException e) {
				logger.warn(e.getMessage());
			}

		return null;
	}

	public static String convert(Date date) {
		return convert(date, "yyyy-MM-dd HH:mm:ss");
	}

	public static String convert(Date date, String dateFormat) {
		if (date == null)
			return null;

		if (null == dateFormat)
			dateFormat = "yyyy-MM-dd HH:mm:ss";

		return new SimpleDateFormat(dateFormat).format(date);
	}

	public static void main(String[] args) {

		// System.out.println(formatDateTime());
		// int n = -1;
		// System.out.println(getBeforeday(n) + "16:59:59");
		// System.out.println(Integer.valueOf(getDay())+"日");

		// String beforeday = getToday();
		//
		// if (beforeday.equals("20141220")){
		// System.out.println("20141203");
		// }else{
		// System.out.println(getTomorrow());
		// }
		// int today = DateUtils.dayForWeek(DateUtils.getToday());
		// System.out.println(today == 7);
		// System.out.println(DateUtils.dayForWeek(DateUtils.getBeforeday(-2)));

//		System.out.println(getBeforedays("20150312", 100));
//		System.out.println(getBeforeday(-1));
//		
//		System.out.println(getCurrentDate("yyyy年-MM月-dd日"));
//		
//		System.out.println(getYYYY());
		
		// System.out.println(getBeforeday(30));

		// System.out.println(formatDate("2014-12-25 00:00:00"));
		Date  date = DateUtils.getDate("2018-11-14");
		Calendar beginDate = Calendar.getInstance();
		beginDate.setTime(date);
		beginDate.add(Calendar.DAY_OF_MONTH, 1);
		Date endDate = beginDate.getTime();
		
		
		System.out.println("开始日期是 "+date);
		System.out.println("结束日期 "+endDate);
		 Instant instant = date.toInstant();
	        ZoneId zoneId = ZoneId.systemDefault();

	        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
	        System.out.println("LocalDateTime开始日期是 "+localDateTime);
	        LocalDateTime nextLocalDateTime =localDateTime.plusDays(1);
	        System.out.println("nextLocalDateTime开始日期是 "+nextLocalDateTime);
		Calendar mbegin = Calendar.getInstance();
		Calendar mend = Calendar.getInstance();
		mbegin.add(Calendar.DAY_OF_MONTH, -4);//-2
		mbegin.set(Calendar.HOUR_OF_DAY, 23);
		mbegin.set(Calendar.MINUTE, 00);
		mbegin.set(Calendar.SECOND, 00);
		mend.add(Calendar.DAY_OF_MONTH, -1);//-1
		mend.set(Calendar.HOUR_OF_DAY, 23);
		mend.set(Calendar.MINUTE, 00);
		mend.set(Calendar.SECOND, 00);
		final Date fbdate = mbegin.getTime();
		final Date fedate = mend.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

		System.out.println(sdf.format(fbdate));
		System.out.println(sdf.format(fedate));
	}
}
