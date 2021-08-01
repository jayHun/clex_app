package com.efl.clex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class testController{
	
	@RequestMapping("/test")
	public ModelAndView test() throws Exception{
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("name", "jeonghun");
		
		List<String> testList = new ArrayList<String>();
		testList.add("member1");
		testList.add("member2");
		testList.add("member3");
		
		mav.addObject("list", testList);
		
		return mav;
	}
}