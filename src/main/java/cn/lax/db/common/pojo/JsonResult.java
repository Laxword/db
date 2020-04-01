/**
 * 
 */
package cn.lax.db.common.pojo;

/**
 * 
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 下午12:12:23
 * 
 */
public class JsonResult <T> {
	private Integer state;
	private String message;
	private T data;
	private static  Integer successState=20;
	private static String successMessage="OK";
	public static JsonResult<Void> getSuccessJR(){
		return new JsonResult<Void>(successState, successMessage, null);
	}
	public static<E> JsonResult<E> getSuccessJR(E data){
		return new JsonResult<E>(successState, successMessage, data);
	}
	public JsonResult(Integer state, String message, T data) {
		super();
		this.state = state;
		this.message = message;
		this.data = data;
	}

	public JsonResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public synchronized Integer getState() {
		return state;
	}
	public synchronized void setState(Integer state) {
		this.state = state;
	}
	public synchronized String getMessage() {
		return message;
	}
	public synchronized void setMessage(String message) {
		this.message = message;
	}
	public synchronized T getData() {
		return data;
	}
	public synchronized void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", message=" + message + ", data=" + data + "]";
	}
	
}
