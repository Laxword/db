/**
 * 
 */
package cn.lax.db.sys.service.ex;

/**
 * 针对分页查询中pageCurrent为null或者小于1的情况
 * 也就是查询的页码不存在
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 上午10:49:32
 * 
 */
public class IllegalPageNumberException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6073549451687881606L;

	public IllegalPageNumberException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalPageNumberException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalPageNumberException(String message, Throwable cause) {
		 super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalPageNumberException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalPageNumberException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
