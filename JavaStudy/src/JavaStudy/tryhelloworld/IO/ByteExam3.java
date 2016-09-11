package JavaStudy.tryhelloworld.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * try-with-resources �� ����
	java io��ü�� �ν��Ͻ��� �����, ��� ����ϸ� close()�޼ҵ带 ȣ���ؾ� �Ѵ�.
	close()�޼ҵ带 ����ڰ� ȣ������ �ʴ���, Exception�� �߻����� �ʾҴٸ� �ڵ����� close()�� �ǰ� �� �� �ִ� ���
	
	    try(
                //io��ü ����
        ){
                //io��ü ���
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
//������ ������ ������Ʈ �ٷ� �ؿ� ���� ��