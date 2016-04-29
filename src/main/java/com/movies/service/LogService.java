
package com.movies.service;

import com.movies.entity.Log;

/**
 * Service - 日志
 * 
 * @author SHOP++ Team
 * @version 4.0
 */
public interface LogService extends BaseService<Log, Long> {

	/**
	 * 清空日志
	 */
	void clear();

}