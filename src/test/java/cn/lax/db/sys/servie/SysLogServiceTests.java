/**
 * 
 */
package cn.lax.db.sys.servie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.lax.db.common.pojo.PageObjectVO;
import cn.lax.db.sys.pojo.SysLogDO;
import cn.lax.db.sys.service.impl.SysLogServiceImpl;

/**
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 上午11:35:21
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysLogServiceTests {
	@Autowired
	SysLogServiceImpl service;
	
	@Test
	public void findSysLog() {
		
		String username ="admin";
		Integer pageCurrent=2;
	try {
		PageObjectVO<SysLogDO> vo 
		= service.findSysLog(username, pageCurrent);
		System.err.println(vo);
	} catch (Exception e) {
		System.out.println(e.getClass());
		System.err.println(e.getMessage());
	}
	
	}
	

}
