package hiddencamera.co.jp.hiddencamera.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private DateUtils(){}

    /** 日付フォーマット */
    static public final String DATE_PATTERN ="yyyy/MM/dd HH:mm:ss";

    /**
     * <p>[概 要] Date型⇒String型への変換処理</p>
     * <p>[詳 細] </p>
     * <p>[備 考] </p>
     * @param  date 変換前日付オブジェクト
     * @return String型オブジェクト（変換に失敗した場合はnullを返します。）
     */
    public static String parseDateToString(Date date, String pattern) {
        String  str;
        if(date == null) {
            str = null;
        } else {
            str = new SimpleDateFormat(pattern).format(date);
        }
        return str;
    }
}
