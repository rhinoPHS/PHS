package JavaStudy.tryhelloworld.Lambda;

public class LambdaBasicExam {
	public static void exec(LambdaBasic compare){
		int k = 10;
		int m = 20;
		int value = compare.compare(k, m);
		System.out.println(value);
	}
	public static void main(String[] args) {
		exec((i,j)->{
			return i-j;
		});
	}

}
//�ڹٴ� �޼ҵ常 ���ڷ� �����Ϸ��� �ݵ�� ��ü�� ���� �����ؾ� �ߴ�.
//Java8�� ���ٽ��� ����鼭, ��ġ �Լ��� �����ϴ� ��ó�� �����ϰ� ������ ����� �� �ְ� �Ǵ�