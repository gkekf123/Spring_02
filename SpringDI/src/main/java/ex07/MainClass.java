package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.Hotel;
import ex03.MemberDAO;

public class MainClass {

	public static void main(String[] args) {

		// 자바 설정 파일을 읽을 떄
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Hotel hotel = atx.getBean(Hotel.class);
//		System.out.println(hotel);
		hotel.getChef().cooking();
		
		MemberDAO memberdao = atx.getBean(MemberDAO.class);
		System.out.println(memberdao.getDataSource().getUrl());
		System.out.println(memberdao.getDataSource().getUid());
		System.out.println(memberdao.getDataSource().getUpw());
		
		
		
		
		
	}

}
