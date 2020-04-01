/**
 * 
 */
package cn.lax.db.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.lax.db.sys.mapper.SysLogMapper;
import cn.lax.db.sys.pojo.SysLogDO;

/**
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 上午10:19:23
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysLogMapperTests {
	@Autowired
	SysLogMapper mapper;
	@Test
	public void getRowCount() {
		Integer count = mapper.getRowCount("tom");
		System.err.println("count="+count);
	}
	@Test
	public void getPageRecord() {
		List<SysLogDO> list= mapper.getPageRecord("tom", 0, 5);
		for (SysLogDO item : list) {
			System.err.println(item);
			
		}
	}

}
