
package com.movies.dao;

import com.movies.entity.Log;

/**
 * Dao - 日志
 * 
 * @author SHOP++ Team
 * @version 4.0
 */
public interface LogDao extends BaseDao<Log, Long> {

	/**
	 * 删除所有日志
	 */
	void removeAll();

}