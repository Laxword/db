/**
 * 
 */
package cn.lax.db.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.lax.db.common.pojo.JsonResult;
import cn.lax.db.common.pojo.PageObjectVO;
import cn.lax.db.sys.pojo.SysLogDO;
import cn.lax.db.sys.service.ISysLogService;

/**
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 下午12:28:07
 * 
 */
@RestController
@RequestMapping("/log")
public class SysLogController {
	@Autowired
	ISysLogService service;
	
//	localhost:8080/log/findSysLog?pageCurrent=1
	@RequestMapping("/findSysLog")
	public JsonResult<PageObjectVO<SysLogDO>> findSysLog(String username, Integer pageCurrent){
		PageObjectVO<SysLogDO> data =service.findSysLog(username, pageCurrent);
				return JsonResult.getSuccessJR(data);
	}
	

}
