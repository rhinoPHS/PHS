package JavaStudy.tryhelloworld.Lang;

public class JavaLangWrapperIntegerExam {
		  public static void main(String[] args){
		    Integer i1 = 5;
		    int max_int = i1.MAX_VALUE;
		    long i1_long = i1.longValue();

//		    int i2 = 5;
//		    int min_int = i2.MIN_VALUE;
//		    long i2_long = i2.longValue();
		    System.out.println(max_int);
		    System.out.println(i1_long);
		  }
}
/*
Integer�� int�� wrapper class�Դϴ�. class�̱� ������ �Ӽ��� �޼ҵ带 �����µ���.
���� �ڵ带 ������ ���� Integer Ÿ���� ��� �ʵ�� method�� ����� �� ������, �⺻�� Ÿ���� int�� ��� �ʵ�� method�� ����� �� ���°� Ȯ���� �� �ֽ��ϴ�.
*/