package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

// 핸들러 어댑터에 연결이 되려면 특정 클래스(MultiActionController)를 상속받음
public class HomeController extends MultiActionController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String uri = request.getRequestURI();
		String path = uri.substring(request.getContextPath().length());
		
		System.out.println(path);
		
		if(path.equals("/test/aaa")) {
			System.out.println("aaa메서드 실행");
			
			ModelAndView mv = new ModelAndView();
//			mv.setViewName("/WEB-INF/views/aaa.jsp");
			mv.setViewName("aaa"); // 뷰리졸버가 만들어져 있다는 가정하에 경로는 aaa가 된다(파일명)
			mv.addObject("data", "hello world");
			
			return mv; // controller에서는 뷰에대한 정보 and 데이터에 정보를 반환
			
		} else if (path.equals("/test/bbb")) {
			System.out.println("bbb메서드 실행");
		}
		
		return null;
	}

//	url요청을 처리할 수 있는 메소드
	
	
}
