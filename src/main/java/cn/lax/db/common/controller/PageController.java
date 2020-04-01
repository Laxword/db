/**
 * 
 */
package cn.lax.db.common.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lax
 * @Description: TODO
 * @date 2020年4月1日 下午12:55:27
 * 
 */
@Controller
public class PageController {
	
	@RequestMapping("/s")
	public String getStarterPage() {
		System.err.println("s");
		return "starter";
	}
	@RequestMapping("/sys/{subPage}")
	public String getSubPage(@PathVariable("subPage")String pageName) {
		System.err.println("PageController.getSubPage()");
		return "sys/"+pageName;
	}

}
