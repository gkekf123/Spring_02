package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {

	/* @AuroWried
	 * - 멤버변수, 생성자, setter 모두 사용
	 * - bean중에서 주입될 수 있는 적합한 타입을 찾아서 자동 주임
	 */
	
	@Autowired
	@Qualifier("document1")
	private Document document;
	
	// 기본 생성자 -> <bean class="ex05.Printer" />의 에러 이유
	// 기본 생성자가 없으니 에러가 난다 -> 기본생성자가 있어야 setter로 주입 한다
	public Printer () {
		
	}
	
	// 생성자 주입 가능 - 생성자 통해서 받을 수 있다
	public Printer(Document document) {
		this.document = document;
	}

	// getter, setter 통한 주입 가능 - getter, setter 통해서 받을 수 있다
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	
	
}
