package JavaStudy.tryhelloworld;

public class ReferenceTypeExam{
	public static void main(String []args){
		ReferenceTypeExam exam = new ReferenceTypeExam();
		
		//기본형 변수value1을 addOne에 전달합니다.
		int value = 10;
		exam.addOne(value);
		System.out.println("기본형 변수의 값을 다른 메소드에서 변경한 결과: "+value);
		
		//참조형 변수arr을 addOne에 전달합니다.
		int []arr = {10};
		exam.addOne(arr);
		System.out.println("참조형 변수의 값을 다른 메소드에서 변경한 결과: "+arr[0]);
	}
	
	
	public void addOne(int value){
		value++;
	}
	
	public void addOne(int[] arr){
		for(int i = 0; i<arr.length ; i++){
			arr[i] ++;
		}
	}
}
/*main메소드 입장에서 생각하면요. add에 매개변수로 전달하는 숫자가 10이라고 했을때,
int value로 전달할때는 그냥 10이라고 새로운 종이에 적어서 전달하는겁니다. 그 종이를 돌려주지 않으면 가져간 다음에 뭘하건 나랑은 상관이 없습니다.
int[]arr로 전달할때는 "저기 1958번 강의실에 화이트보드에 값을 써 놨어"라고 값이 적힌 주소를 전달합니다. 거기에 가 보면 10이라는 값이 써져 있는거져. 
add메소드는 값을 변경할때 그 강의실에 가서 그걸 지우고 다시 11을 적어버립니다. 
나중에 main이 그 값을 사용할때도 강의실에 가서 값을 보고 확인해야 사용합니다. 그러면 11이 적혀 있겠져.
*/