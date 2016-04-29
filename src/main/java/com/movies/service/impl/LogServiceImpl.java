
package com.movies.service.impl;

import javax.annotation.Resource;

import com.movies.dao.LogDao;
import com.movies.entity.Log;
import com.movies.service.LogService;

import org.springframework.stereotype.Service;

/**
 * Service - 日志
 * 
 * @author SHOP++ Team
 * @version 4.0
 */
@Service("logServiceImpl")
public class LogServiceImpl extends BaseServiceImpl<Log, Long> implements LogService {

	@Resource(name = "logDaoImpl")
	private LogDao logDao;

	public void clear() {
		logDao.removeAll();
	}

}