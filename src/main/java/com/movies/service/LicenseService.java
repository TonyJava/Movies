
package com.movies.service;

/**
 * Service - 许可
 * 
 * @author SHOP++ Team
 * @version 4.0
 */
public interface LicenseService {

	/**
	 * 获取许可信息
	 * 
	 * @param sn
	 *            序列号
	 * @param siteUrl
	 *            网站网址
	 * @return 许可信息
	 */
	byte[] getLicense(String sn, String siteUrl);

}