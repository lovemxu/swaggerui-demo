package com.zito.swaggerui.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTimeUtil {
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_FORMAT_CN = "yyyy年MM月dd日";
    public static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String TIME_FORMAT_CN = "yyyy年MM月dd日 HH:mm:ss";
    public static final String MONTH_FORMAT = "yyyy-MM";
    public static final String DAY_FORMAT = "yyyyMMdd";
    public static final String DAY_FORMAT_SHORT = "yyMMdd";
    public static final String LONG_FORMAT = "yyyyMMddHHmmss";

    public DateTimeUtil() {
    }

    public static Date getCurrDateTime() {
        return new Date();
    }

    public static Date getCurrDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(11, 0);
        cal.set(12, 0);
        cal.set(13, 0);
        cal.set(14, 0);
        return cal.getTime();
    }

    public static Timestamp getCurrTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static String getFormatDate(Date currDate) {
        return getFormatDate(currDate, "yyyy-MM-dd");
    }

    public static Date getFormatDateToDate(Date currDate) throws ParseException {
        return getFormatDate(getFormatDate(currDate));
    }

    public static String getFormatDate_CN(Date currDate) {
        return getFormatDate(currDate, "yyyy年MM月dd日");
    }

    public static Date getFormatDateToDate_CN(Date currDate) throws ParseException {
        return getFormatDate_CN(getFormatDate_CN(currDate));
    }

    public static Date getFormatDate(String currDate) throws ParseException {
        return getFormatDate(currDate, "yyyy-MM-dd");
    }

    public static Date getFormatDate_CN(String currDate) throws ParseException {
        return getFormatDate(currDate, "yyyy年MM月dd日");
    }

    public static String getFormatDate(Date currDate, String format) {
        SimpleDateFormat dtFormatdB = null;

        try {
            dtFormatdB = new SimpleDateFormat(format);
            return dtFormatdB.format(currDate);
        } catch (Exception var4) {
            dtFormatdB = new SimpleDateFormat("yyyy-MM-dd");
            return dtFormatdB.format(currDate);
        }
    }

    public static String getFormatDateTime(Date currDate) {
        return getFormatDateTime(currDate, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date getFormatDateTimeToTime(Date currDate) throws ParseException {
        return getFormatDateTime(getFormatDateTime(currDate));
    }

    public static Date getFormatDateTime(String currDate) throws ParseException {
        return getFormatDateTime(currDate, "yyyy-MM-dd HH:mm:ss");
    }

    public static String getFormatDateTime_CN(Date currDate) {
        return getFormatDateTime(currDate, "yyyy年MM月dd日 HH:mm:ss");
    }

    public static Date getFormatDateTimeToTime_CN(Date currDate) throws ParseException {
        return getFormatDateTime_CN(getFormatDateTime_CN(currDate));
    }

    public static Date getFormatDateTime_CN(String currDate) throws ParseException {
        return getFormatDateTime(currDate, "yyyy年MM月dd日 HH:mm:ss");
    }

    public static String getFormatDateTime(Date currDate, String format) {
        SimpleDateFormat dtFormatdB = null;

        try {
            dtFormatdB = new SimpleDateFormat(format);
            return dtFormatdB.format(currDate);
        } catch (Exception var4) {
            dtFormatdB = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return dtFormatdB.format(currDate);
        }
    }

    public static Date getFormatDate(String currDate, String format) throws ParseException {
        SimpleDateFormat dtFormatdB = null;

        try {
            dtFormatdB = new SimpleDateFormat(format);
            return dtFormatdB.parse(currDate);
        } catch (Exception var4) {
            dtFormatdB = new SimpleDateFormat("yyyy-MM-dd");
            return dtFormatdB.parse(currDate);
        }
    }

    public static Date getFormatDateTime(String currDate, String format) throws ParseException {
        SimpleDateFormat dtFormatdB = null;

        try {
            dtFormatdB = new SimpleDateFormat(format);
            return dtFormatdB.parse(currDate);
        } catch (Exception var4) {
            dtFormatdB = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return dtFormatdB.parse(currDate);
        }
    }

    public static String getDateBeforeMonth() {
        Calendar cal = Calendar.getInstance();
        cal.add(2, -1);
        return getFormatDate(cal.getTime(), "yyyy-MM-dd");
    }

    public static String getDateBeforeDay() {
        Calendar cal = Calendar.getInstance();
        cal.add(6, -1);
        return getFormatDate(cal.getTime(), "yyyy-MM-dd");
    }

    public static String getCurrDateStr() {
        return getFormatDate(getCurrDateTime());
    }

    public static String getCurrDateTimeStr() {
        return getFormatDateTime(getCurrDateTime());
    }

    public static String getCurrDateStr_CN() {
        return getFormatDate(getCurrDateTime(), "yyyy年MM月dd日");
    }

    public static String getCurrDateTimeStr_CN() {
        return getFormatDateTime(getCurrDateTime(), "yyyy年MM月dd日 HH:mm:ss");
    }

    public static Date getDateBeforeOrAfter(int iDate) {
        Calendar cal = Calendar.getInstance();
        cal.add(5, iDate);
        return cal.getTime();
    }

    public static Date getDateBeforeOrAfterMonth(int iDate) {
        Calendar cal = Calendar.getInstance();
        cal.add(2, iDate);
        return cal.getTime();
    }

    public static Date getDateBeforeOrAfter(Date curDate, int iDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(curDate);
        cal.add(5, iDate);
        return cal.getTime();
    }

    public static String getFormatMonth(Date currDate) {
        return getFormatDate(currDate, "yyyy-MM");
    }

    public static String getFormatDay(Date currDate) {
        return getFormatDate(currDate, "yyyyMMdd");
    }

    public static String getFormatDayShort(Date currDate) {
        return getFormatDate(currDate, "yyMMdd");
    }

    public static Date getFirstDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        int firstDay = cal.getMinimum(5);
        cal.set(5, firstDay);
        return cal.getTime();
    }

    public static String getFormatFirstDayOfMonth() {
        return getFormatDate(getFirstDayOfMonth(), "yyyy-MM-dd");
    }

    public static Date getFirstDayOfNextMonth() {
        Calendar cal = Calendar.getInstance();
        cal.add(2, 1);
        int firstDay = cal.getMinimum(5);
        cal.set(5, firstDay);
        return cal.getTime();
    }

    public static String getFormartFirstDayOfNextMonth() {
        return getFormatDate(getFirstDayOfNextMonth(), "yyyy-MM-dd");
    }

    public static String getFormatFirstDayOfMonth(Date currDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currDate);
        int firstDay = cal.getMinimum(5);
        cal.set(5, firstDay);
        return getFormatDate(cal.getTime(), "yyyy-MM-dd");
    }

    public static String getFormatLastDayOfMonth(Date currDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currDate);
        int firstDay = cal.getMinimum(5);
        cal.set(5, firstDay);
        return getFormatDate(cal.getTime(), "yyyy-MM-dd");
    }

    public static Date getFirstDayOfMonth(Date currDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currDate);
        int firstDay = cal.getMinimum(5);
        cal.set(5, firstDay);
        return cal.getTime();
    }

    public static Date getLastDayOfMonth(Date currDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currDate);
        int firstDay = cal.getMinimum(5);
        cal.set(5, firstDay);
        return cal.getTime();
    }

    public static Date getDateBeforeOrAfterHours(Date curDate, int iHour) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(curDate);
        cal.add(11, iHour);
        return cal.getTime();
    }

    public static Date getDateBeforeOrAfterMinute(Date curDate, int minutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(curDate);
        cal.add(12, minutes);
        return cal.getTime();
    }

    public static boolean isSameWeek(Date curDate, Date compareDate) throws ParseException {
        if(null != curDate && null != compareDate) {
            Calendar calSun = Calendar.getInstance();
            calSun.setTime(getFormatDateToDate(curDate));
            calSun.set(7, 1);
            Calendar calNext = Calendar.getInstance();
            calNext.setTime(calSun.getTime());
            calNext.add(5, 7);
            Calendar calComp = Calendar.getInstance();
            calComp.setTime(compareDate);
            return calComp.after(calSun) && calComp.before(calNext);
        } else {
            return false;
        }
    }

    public static String addDateEndfix(String datestring) {
        return null != datestring && !datestring.equals("")?datestring + " 23:59:59":null;
    }

    public static Date formatEndTime(String datePre) throws ParseException {
        if(null == datePre) {
            return null;
        } else {
            String dateStr = addDateEndfix(datePre);
            return getFormatDateTime(dateStr);
        }
    }

    public static Boolean compareDay(Date date1, int compday) {
        if(null == date1) {
            return Boolean.valueOf(false);
        } else {
            Date dateComp = getDateBeforeOrAfter(date1, compday);
            Date nowdate = new Date();
            return dateComp.after(nowdate)?Boolean.valueOf(true):Boolean.valueOf(false);
        }
    }

    public static String convertBinaryTime2Hex(String timespan) {
        if(timespan != null && !timespan.equals("")) {
            String ret = "";
            String tmp = "";

            for(int i = 0; i < timespan.length(); ++i) {
                tmp = tmp + timespan.charAt(i);
                tmp = tmp + timespan.charAt(i);
                if((i + 1) % 16 == 0) {
                    if(!ret.equals("")) {
                        ret = ret + ",";
                    }

                    Long t = Long.valueOf(Long.parseLong(tmp, 2));
                    String hexStr = Long.toHexString(t.longValue());
                    if(hexStr.length() < 8) {
                        int length = hexStr.length();

                        for(int n = 0; n < 8 - length; ++n) {
                            hexStr = "0" + hexStr;
                        }
                    }

                    ret = ret + hexStr;
                    tmp = "";
                }
            }

            return ret;
        } else {
            return "";
        }
    }

    public static String convertHexTime2Binary(String timespan) {
        if(null != timespan && !"".equals(timespan)) {
            String tmp = "";
            String ret = "";
            String[] strArr = timespan.split(",");

            int i;
            for(i = 0; i < strArr.length; ++i) {
                String binStr = Long.toBinaryString(Long.parseLong(strArr[i], 16));
                if(binStr.length() < 32) {
                    int length = binStr.length();

                    for(int n = 0; n < 32 - length; ++n) {
                        binStr = "0" + binStr;
                    }
                }

                tmp = tmp + binStr;
            }

            for(i = 0; i < 48; ++i) {
                ret = ret + tmp.charAt(i * 2);
            }

            return ret;
        } else {
            return "";
        }
    }

    public static String convertDecTime2Binary(String timespan) {
        if(timespan != null && !timespan.equals("")) {
            String tmp = "";
            String ret = "";
            String[] strArr = timespan.split(",");

            int i;
            for(i = 0; i < strArr.length; ++i) {
                String binStr = Long.toBinaryString(Long.parseLong(strArr[i], 10));
                if(binStr.length() < 32) {
                    int length = binStr.length();

                    for(int n = 0; n < 32 - length; ++n) {
                        binStr = "0" + binStr;
                    }
                }

                tmp = tmp + binStr;
            }

            for(i = 0; i < 48; ++i) {
                ret = ret + tmp.charAt(i * 2);
            }

            return ret;
        } else {
            return "";
        }
    }

    public static String convertBinaryTime2Dec(String timespan) {
        if(timespan != null && !timespan.equals("")) {
            String ret = "";
            String tmp = "";

            for(int i = 0; i < timespan.length(); ++i) {
                tmp = tmp + timespan.charAt(i);
                tmp = tmp + timespan.charAt(i);
                if((i + 1) % 16 == 0) {
                    if(!ret.equals("")) {
                        ret = ret + ",";
                    }

                    Long t = Long.valueOf(Long.parseLong(tmp, 2));
                    String decStr = Long.toString(t.longValue());
                    if(decStr.length() < 10) {
                        int length = decStr.length();

                        for(int n = 0; n < 10 - length; ++n) {
                            decStr = "0" + decStr;
                        }
                    }

                    ret = ret + decStr;
                    tmp = "";
                }
            }

            return ret;
        } else {
            return "";
        }
    }

    public static int compareDay(Date one, Date two) {
        long num1 = one.getTime();
        long num2 = two.getTime();
        return (int)((num2 - num1) / 86400000L);
    }

    public static int compareDay(String one, String two) throws ParseException {
        Date oneDate = getFormatDate(one);
        Date twoDate = getFormatDate(two);
        return compareDay(oneDate, twoDate);
    }

    public static boolean compareDate_lt(String one, String two) {
        try {
            return compareDay(one, two) < 0;
        } catch (ParseException var3) {
            return false;
        }
    }

    public static int compareHour(Date one, Date two) {
        long num1 = one.getTime();
        long num2 = two.getTime();
        return (int)((num2 - num1) / 3600000L);
    }

    public static int compareMinuter(Date one, Date two) {
        long num1 = one.getTime();
        long num2 = two.getTime();
        return (int)((num2 - num1) / 60000L);
    }

    public static int compareSeconds(Date one, Date two) {
        long num1 = one.getTime();
        long num2 = two.getTime();
        return (int)((num2 - num1) / 1000L);
    }

    public static Date parseDateLongFormat(String sDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date d = null;
        if(sDate != null && sDate.length() == "yyyyMMddHHmmss".length()) {
            d = dateFormat.parse(sDate);
        }

        return d;
    }

    public static Date parseDateFormat(String sDate, String format) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date d = null;
        if(sDate != null && sDate.length() == format.length()) {
            d = dateFormat.parse(sDate);
        }

        return d;
    }

    public static String getLongDateString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return getDateString(date, dateFormat);
    }

    public static boolean isValidLongDateFormat(String strDate) {
        if(strDate.length() != "yyyyMMddHHmmss".length()) {
            return false;
        } else {
            try {
                Long.parseLong(strDate);
            } catch (Exception var4) {
                return false;
            }

            DateFormat df = getNewDateFormat("yyyyMMddHHmmss");

            try {
                df.parse(strDate);
                return true;
            } catch (ParseException var3) {
                return false;
            }
        }
    }

    public static boolean isValidLongDateFormat(String strDate, String delimiter) {
        String temp = strDate.replaceAll(delimiter, "");
        return isValidLongDateFormat(temp);
    }

    public static String getDateString(Date date, DateFormat dateFormat) {
        return date != null && dateFormat != null?dateFormat.format(date):null;
    }

    public static DateFormat getNewDateFormat(String pattern) {
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        df.setLenient(false);
        return df;
    }

    public static final Date add(Date date, int field, int howMany) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(field, howMany);
        return calendar.getTime();
    }

    public static String timestampToString(Timestamp timestamp) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long times = Long.valueOf(timestamp.getTime());
        String date = df.format(times);
        return date;
    }
}