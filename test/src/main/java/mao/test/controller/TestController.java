package mao.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping(value="/handlerAdapterTest",method=RequestMethod.GET)
	@ResponseBody
	public void handlerAdapter(){
		System.out.println("test github");
	}
	
	@RequestMapping(value="/filterTest",method=RequestMethod.GET)
	@ResponseBody
	public void FilterTest(){
		
	}
}
