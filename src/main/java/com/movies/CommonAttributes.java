
package com.movies;

/**
 * 公共参数
 * 
 * @author SHOP++ Team
 * @version 4.0
 */
public final class CommonAttributes {

	/** 日期格式配比 */
	public static final String[] DATE_PATTERNS = new String[] { "yyyy", "yyyy-MM", "yyyyMM", "yyyy/MM", "yyyy-MM-dd", "yyyyMMdd", "yyyy/MM/dd", "yyyy-MM-dd HH:mm:ss", "yyyyMMddHHmmss", "yyyy/MM/dd HH:mm:ss" };

	/** movies.xml文件路径 */
	public static final String MOVIES_XML_PATH = "/movies.xml";

	/** movies.properties文件路径 */
	public static final String MOVIES_PROPERTIES_PATH = "/movies.properties";

	/**
	 * 不可实例化
	 */
	private CommonAttributes() {
	}

}