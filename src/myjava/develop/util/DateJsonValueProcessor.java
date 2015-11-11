package myjava.develop.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**  
 * @author Lingo  
 * @since 2007-08-02  
 */  
public class DateJsonValueProcessor implements JsonValueProcessor {   
    private String dateFormat;   
  
    /**  
     * 构�?�方�?.  
     *  
     * @param datePattern 日期格式  
     */  
    public DateJsonValueProcessor(String datePattern) {   
    	dateFormat = datePattern;
    }   
  
    public Object processArrayValue(Object value, JsonConfig jsonConfig) {   
    	String[] obj = {};
    	if (value instanceof Date[]) {
	    	Date[] dates = (Date[]) value;
	    	obj = new String[dates.length];
	    	for (int i = 0; i < dates.length; i++) {
	    		obj[i] = new SimpleDateFormat(dateFormat).format(dates[i]);
	    	}
    	}
    	return obj;
    }   
  
    public Object processObjectValue(String key, Object value,   
        JsonConfig jsonConfig) {   
    	if(value instanceof java.util.Date){
    		String str = new SimpleDateFormat(dateFormat).format((Date)value);
    		return str;
    	}
        return process(value);   
    }   
  
    private Object process(Object value) {   
        return new SimpleDateFormat(dateFormat).format((Date) value);   
    }   
}  

