package JavaStudy.tryhelloworld;

public class ArrayExam2 {
	public static void main(String[] args) {
		//int[][] array4 = new int[3][4];
		
	   // int[][] array6 = {{1}, {2,3}, {4,5,6}};
	    //���� ���� ������ ��� array6[0][0] �� 1�̴�. array6[1][0]�� 2�̴�
	    
	    int[][] array5 = new int[3][];
	    //���� ���� �����ϸ� array5�� 3��¥�� �迭�� �����Ѵ�. 3��¥�� �迭�� ���� �����ϴ� �迭�� ���ٴ� ���� �ǹ�.

	    array5[0] = new int[1]; //������ �ϳ� ���� �� �ִ� �迭�� �����ؼ� array5 �� 0 ��° �ε����� �����Ѵ�.  
	    array5[1] = new int[2]; //������ �ΰ� ���� �� �ִ� �迭�� �����ؼ� array5 �� 1 ��° �ε����� �����Ѵ�.  
	    array5[2] = new int[3]; //������ ���� ���� �� �ִ� �迭�� �����ؼ� array5 �� 2 ��° �ε����� �����Ѵ�. 
	    
	    /*
	    	    int [][] array = {{1},{1,2},{1,2,3},{1,2,3,4}};
	    	    
	    	    //2���� �迭 array�� ����մϴ�.
	    	    for(int i = 0 ; i < array.length ; i++){
	    	      System.out.print((i+1) + "��° ���� ����մϴ�>");
	    	      for(int j = 0; j< array[i].length ; j++){
	    	        //System.out.print�� ���� �ٲ��� �ʰ� ����ϴ� �ڵ��Դϴ�.
	    	        System.out.print(array[i][j]+" ");
	    	      }
	    	      System.out.println("");//�ٹٲ��� �� �ִ� �ڵ��Դϴ�.
	    	    }
	    	  
	    	*/
	}

}
