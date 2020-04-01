/**
 * 
 */
package cn.lax.db.sys.service;

import cn.lax.db.common.pojo.PageObjectVO;
import cn.lax.db.sys.pojo.SysLogDO;
import cn.lax.db.sys.service.ex.IllegalPageNumberException;
import cn.lax.db.sys.service.ex.RecordNotFoundException;

/**
 * 日志模块的业务层父接口
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 上午11:00:31
 * 
 */
public interface ISysLogService {
	/**
	 * 基于用户名分页查询日志数据
	 * @param username 用户名
	 * @param pageCurrent 当前页码
	 * @return 当前页数据
	 * @throws IllegalPageNumberException
	 * @throws RecordNotFoundException
	 */
	PageObjectVO<SysLogDO> findSysLog(String username,Integer pageCurrent)throws IllegalPageNumberException,RecordNotFoundException;

}
