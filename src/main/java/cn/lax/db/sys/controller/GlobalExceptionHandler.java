/**
 * 
 */
package cn.lax.db.sys.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import cn.lax.db.common.pojo.JsonResult;
import cn.lax.db.sys.service.ex.IllegalPageNumberException;
import cn.lax.db.sys.service.ex.RecordNotFoundException;
import cn.lax.db.sys.service.ex.ServiceException;

/**
 * 统一异常处理逻辑
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 下午12:19:22
 * 
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ServiceException.class)
	public JsonResult<Void> handleCustomException(Throwable e){
		JsonResult<Void> jr = new JsonResult<Void>();
		//将异常信息封装到JsonResult中
		jr.setMessage(e.getMessage());
		//根据异常类型添加jr中的响应状态码
		if(e instanceof IllegalPageNumberException) {
			jr.setState(4001);
		}else if(e instanceof RecordNotFoundException) {
			jr.setState(4002);
		}else {
			jr.setState(0);//统一的异常状态码
		}
		//返回jr对象
		return jr;
	}
}
