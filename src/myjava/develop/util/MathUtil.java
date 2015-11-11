package myjava.develop.util;

import java.math.BigDecimal;

public class MathUtil {
	/**  
     * 对double数据进行取精�?.  
     * <p>  
     * For example: <br>  
     * double value = 100.345678; <br>  
     * double ret = round(value,4,BigDecimal.ROUND_HALF_UP); <br>  
     * ret�?100.3457 <br>  
     *   
     * @param value  
     *            double数据.  
     * @param scale  
     *            精度位数(保留的小数位�?).  
     * @param roundingMode  
     *            精度取�?�方�?.  
     * @return 精度计算后的数据.  
     */  
	public static double round(double value,int scale,int roundingMode){
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(scale,roundingMode);
		double ret = bd.doubleValue();
		bd = null;
		return ret;
	}
}
