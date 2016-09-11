package JavaStudy.tryhelloworld.Annotation;

import java.lang.reflect.Method;

public class MyhelloExam {
	public static void main(String[] args) {
		Myhello hello = new Myhello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			if(method.isAnnotationPresent(Intro.class)){
				for(int i=0; i<100; i++){
					hello.hello();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
