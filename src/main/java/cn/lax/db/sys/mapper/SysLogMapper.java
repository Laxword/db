/**
 * 
 */
package cn.lax.db.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.lax.db.sys.pojo.SysLogDO;

/**
 * 日志模块的持久层接口
 * 
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 上午10:04:00
 * 
 */
public interface SysLogMapper {
	/**
	 * 基于用户名查询总数据条数
	 * 如果一个方法的参数会被用户动态Sql语句
	 * 即使该方法仅有一个参数
	 * 也必须在该方法前添加@Param注解
	 * @param username 用户名
	 * @return 数据条数
	 */
	Integer getRowCount(@Param("username") String username);
	/**
	 * 基于用户名分页查询数据
	 * @param username 用户名
	 * @param recordIndex 跳过的数据条数
	 * @param pageSize 查询的数据条数
	 * @return 当前页数据
	 */
	List<SysLogDO> getPageRecord(
			@Param("username")String username,
			@Param("recordIndex")Integer recordIndex,
			@Param("pageSize")Integer pageSize);

}
