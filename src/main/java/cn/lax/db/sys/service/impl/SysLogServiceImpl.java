/**
 * 
 */
package cn.lax.db.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lax.db.common.pojo.PageObjectVO;
import cn.lax.db.sys.mapper.SysLogMapper;
import cn.lax.db.sys.pojo.SysLogDO;
import cn.lax.db.sys.service.ISysLogService;
import cn.lax.db.sys.service.ex.IllegalPageNumberException;
import cn.lax.db.sys.service.ex.RecordNotFoundException;

/**
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 上午11:05:40
 * 
 */
@Service
public class SysLogServiceImpl implements ISysLogService {

	@Autowired
	SysLogMapper sysLogMapper;
	/**
	 * 当前页的数量
	 */
	private Integer pageSize = 2;

	@Override
	public PageObjectVO<SysLogDO> findSysLog(String username, Integer pageCurrent)
			throws IllegalPageNumberException, RecordNotFoundException {

		// 判断pageCurrent是否为null或者小于1
		if (pageCurrent == null || pageCurrent < 1) {
			// 是:IllegalPageNumberException
			throw new IllegalPageNumberException("查询日志异常,当前页码不正确");
		}

		// 调用持久层方法,查询rowCount
		Integer rowCount = sysLogMapper.getRowCount(username);
		// 判断rowCount是否为0
		if (rowCount == 0) {
			// 是:RecordNotFoundException
			throw new RecordNotFoundException("查询日志异常,总数据条数为零,或该用户的没有相关日志");
		}

		// 计算生成recordIndex跳过的页数
		Integer recordIndex = (pageCurrent - 1) * pageSize;
		// 调用持久层方法,查询当前页数据pageRecord
		List<SysLogDO> pageRecord = sysLogMapper.getPageRecord(username, recordIndex, pageSize);
		// 判断查询结果是否为null或者长度为0
		if (pageRecord == null || pageRecord.size() == 0) {
			// 是:RecordNotFoundException
			throw new RecordNotFoundException("查询日志异常,未查询到相关的数据,或该用户的没有相关日志");
		}

		// 创建PageObjectVO对象
		PageObjectVO<SysLogDO> vo = new PageObjectVO<SysLogDO>();
		// 向PageObjectVO对象中填充数据
		vo.setPageCount((rowCount - 1) / pageSize + 1);
		vo.setPageCurrent(pageCurrent);
		vo.setPageRecord(pageRecord);
		vo.setPageSize(recordIndex);
		vo.setRowCount(rowCount);
		// 返回pageObject对象
		return vo;
	}

}
