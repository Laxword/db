/**
 * 
 */
package cn.lax.db.sys.service.ex;

/**
 * 查询到的总数据条数为0是抛出的异常
 * @author Lax
 * @date 2020年4月1日 上午10:53:06
 * 
 */
public class RecordNotFoundException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4143524438557546208L;

	public RecordNotFoundException() {
		super();
	}

	public RecordNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RecordNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public RecordNotFoundException(String message) {
		super(message);
	}

	public RecordNotFoundException(Throwable cause) {
		super(cause);
	}
	
		

}
