package JavaStudy.tryhelloworld.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Byte단위 입출력 클래스는 클래스의 이름이 InputStream이나 OutputStream으로 끝납니다.

	파일로 부터 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램을 작성
		파일로 부터 읽어오기 위한 객체 - FileInputStream
		파일에 쓸수 있게 해주는 객체 - FileOutputStream .
	read()메소드가
		byte를 리턴한다면 끝을 나타내는 값을 표현할 수가 없기 때문에, byte가 아닌 int를 리턴한다.
		음수의 경우 맨 좌측 비트가 1이 된다. 읽어들일 것이 있다면 항상 양수를 리턴한다고볼 수 있다. .
	FileInputStream과 FileOutputStream을 이용하여, 1바이트씩 읽어들여 1바이트씩 저장
		read()메소드가 리턴하는 타입은 정수인데, 정수 4바이트중 마지막 바이트에 읽어들인 1바이트를 저장한다.
		read()메소드는 더이상 읽어들일 것이 없을때 -1을 리턴한다.
 */
//512byte씩 읽어옴. 속도 10ms 미난
//파일로 부터 512byte씩 읽어들여 파일에 512byte씩 저장하는 프로그램을 작성
//byte[] buffer = new byte[512];
//512byte만큼 읽어 들이기 위해 byte배열을 사용
// 512의 배수로 잡아주는 것이 성능상 좋다. !!!!!!!!!!!!!!!!!!중요
public class ByteExam2with1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		변수 선언과 값을 할당을 따로 해준 이유는 try-catch 때문입니다.
//		만약 try 내부에 선언과 동시에 초기화가 되어 있다면 try-catch 외부에서 fis와 fos 변수를 사용할 수 없기 때문에, 
//		외부에서 따로 선언을 해주어 더 효율적으로 사용할 수 있게 만든 것 입니다.
	
//ByteExam2에 try - with - resources 적용 : finally에 있는 close 삭제해야 함		
		try(
			FileInputStream fis = new FileInputStream("src/JavaStudy/tryhelloworld/IO/ByteExam.java");
			FileOutputStream fos = new FileOutputStream("byte.txt");
		   )
				{
			int readCount = -1;
			
			byte[] buffer = new byte[512];
			
			while((readCount = fis.read(buffer)) != -1){
				fos.write(buffer,0,readCount);
				System.out.println(readCount);  // 512 512 5125 463 
			}
			/*
			 * read함수는 글자 하나를 읽어와서 리턴해주는 함수인 데요.
		       -1을 리턴했다는 것은 더 이상 읽을 글자가 없다는 뜻으로 의미 없는 값인 -1을 넣어주는 것이죠.
			      위와 같은 의미로 선언할 때도 readCount에는 의미없는 값을 넣어주는 것 입니다.
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}

}
