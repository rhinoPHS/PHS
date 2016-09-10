package JavaStudy.tryhelloworld.Util;

//public class Generic {
//	private Object obj;
//	public void setObj(Object obj) {
//		this.obj = obj;
//	}
//	public Object getObj(){
//		return obj;
//	}
//
//}
//Java5에는 Generic이라는 문법이 사용됨으로써 인스턴스를 만들때 사용하는 타입을 지정하는 문법이 추가
//Generic을 이용하여 Box 클래스 수정
//클래스 이름 뒤에 <E>가 제네릭을 적용한 것이다. Box는 가상의 클래스 E를 사용한다는 의미.
//Object를 받아들이고, 리턴하던 부분이 E로 변경. E는 실제로 존재하는 클래스는 아니다.
	public class Generic<E>{
		private E obj;
		public void setObj(E obj){
			this.obj = obj;
		}
		public E getObj(){
			return obj;
		}
	}