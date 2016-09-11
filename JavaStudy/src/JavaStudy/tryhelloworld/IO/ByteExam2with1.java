package JavaStudy.tryhelloworld.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Byte���� ����� Ŭ������ Ŭ������ �̸��� InputStream�̳� OutputStream���� �����ϴ�.

	���Ϸ� ���� 1byte�� �о�鿩 ���Ͽ� 1byte�� �����ϴ� ���α׷��� �ۼ�
		���Ϸ� ���� �о���� ���� ��ü - FileInputStream
		���Ͽ� ���� �ְ� ���ִ� ��ü - FileOutputStream .
	read()�޼ҵ尡
		byte�� �����Ѵٸ� ���� ��Ÿ���� ���� ǥ���� ���� ���� ������, byte�� �ƴ� int�� �����Ѵ�.
		������ ��� �� ���� ��Ʈ�� 1�� �ȴ�. �о���� ���� �ִٸ� �׻� ����� �����Ѵٰ� �� �ִ�. .
	FileInputStream�� FileOutputStream�� �̿��Ͽ�, 1����Ʈ�� �о�鿩 1����Ʈ�� ����
		read()�޼ҵ尡 �����ϴ� Ÿ���� �����ε�, ���� 4����Ʈ�� ������ ����Ʈ�� �о���� 1����Ʈ�� �����Ѵ�.
		read()�޼ҵ�� ���̻� �о���� ���� ������ -1�� �����Ѵ�.
 */
//512byte�� �о��. �ӵ� 10ms �̳�
//���Ϸ� ���� 512byte�� �о�鿩 ���Ͽ� 512byte�� �����ϴ� ���α׷��� �ۼ�
//byte[] buffer = new byte[512];
//512byte��ŭ �о� ���̱� ���� byte�迭�� ���
// 512�� ����� ����ִ� ���� ���ɻ� ����. !!!!!!!!!!!!!!!!!!�߿�
public class ByteExam2with1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		���� ����� ���� �Ҵ��� ���� ���� ������ try-catch �����Դϴ�.
//		���� try ���ο� ����� ���ÿ� �ʱ�ȭ�� �Ǿ� �ִٸ� try-catch �ܺο��� fis�� fos ������ ����� �� ���� ������, 
//		�ܺο��� ���� ������ ���־� �� ȿ�������� ����� �� �ְ� ���� �� �Դϴ�.
	
//ByteExam2�� try - with - resources ���� : finally�� �ִ� close �����ؾ� ��		
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
			 * read�Լ��� ���� �ϳ��� �о�ͼ� �������ִ� �Լ��� ����.
		       -1�� �����ߴٴ� ���� �� �̻� ���� ���ڰ� ���ٴ� ������ �ǹ� ���� ���� -1�� �־��ִ� ������.
			      ���� ���� �ǹ̷� ������ ���� readCount���� �ǹ̾��� ���� �־��ִ� �� �Դϴ�.
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}

}
