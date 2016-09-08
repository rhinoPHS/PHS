package JavaStudy.tryhelloworld;

/*public class ArrayExam {
	public int[] fill100() {
		int[] array = new int[100];
		// array가 1부터 100까지 순서대로 값을 가지도록 만들어 보세요.
	  for(int i=0; i<array.length;i++)
    {
      array[i]=i+1;
    }
		// 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
		return array;
	}

	// 아래는 실행을 위한 코드입니다. 수정하지 마세요.
	public static void main(String[] args) {
		ArrayExam exam = new ArrayExam();
		int[] arr2 = exam.fill100();
		for (int i = 0; i < 100; i++) {
			if (arr2[i] != i + 1) {
				System.out.println("array[" + i + "]의 값이 틀립니다.");
			}
		}
	}
}*/

public class ArrayExam {
	public int sum(int[] param) {
		int[] array = param;
		int sum = 0;
		// array는 길이를 알 수 없는 int형 배열입니다.
		// array에는 정수가 들어있다고 가정하고 이 아래에서 sum에 array의 모든 값을 더하세요.
     for (int i=0; i<array.length; i++)
    {
      sum=sum+array[i];
    }
		// 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
		return sum;
	}
	
	//아래는 실행을 위한 코드입니다. 수정하지 마세요.
	public static void main(String[] args) {
		int[]TestCase = new int[4];
		String str = "";
		int rightResult = 0;
		for(int i=0; i<4; i++){
			TestCase[i] = (int)(Math.random()*100);
			rightResult += TestCase[i];
			str+=(TestCase[i]+",");
		}
		str=str.substring(0,str.length()-1);

		ArrayExam exam = new ArrayExam();
		int Answer = exam.sum(TestCase);
		
		if (Answer==rightResult) {
	  		System.out.println("정답입니다. [제출]을 누르세요.");
		}
		else{
			System.out.println( str+"를 더한 sum의 값이 틀립니다.");
		}
	}
}
