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
//Java5���� Generic�̶�� ������ �������ν� �ν��Ͻ��� ���鶧 ����ϴ� Ÿ���� �����ϴ� ������ �߰�
//Generic�� �̿��Ͽ� Box Ŭ���� ����
//Ŭ���� �̸� �ڿ� <E>�� ���׸��� ������ ���̴�. Box�� ������ Ŭ���� E�� ����Ѵٴ� �ǹ�.
//Object�� �޾Ƶ��̰�, �����ϴ� �κ��� E�� ����. E�� ������ �����ϴ� Ŭ������ �ƴϴ�.
	public class Generic<E>{
		private E obj;
		public void setObj(E obj){
			this.obj = obj;
		}
		public E getObj(){
			return obj;
		}
	}