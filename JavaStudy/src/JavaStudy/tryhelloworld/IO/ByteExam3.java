package JavaStudy.tryhelloworld.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * try-with-resources 블럭 선언
	java io객체는 인스턴스를 만들고, 모두 사용하면 close()메소드를 호출해야 한다.
	close()메소드를 사용자가 호출하지 않더라도, Exception이 발생하지 않았다면 자동으로 close()가 되게 할 수 있는 방법
	
	    try(
                //io객체 선언
        ){
                //io객체 사용
        }catch(Exception ex){
            ex.printStackTrace();
        }
 */
public class ByteExam3 {
	public static void main(String[] args) {
		try(
			DataOutputStream data = new DataOutputStream(new FileOutputStream("data.txt"));	
		){
			data.writeInt(100);
			data.writeBoolean(true);
			data.writeDouble(50.5);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
//저장경로 없으면 프로젝트 바로 밑에 저장 됨