package JavaStudy.tryhelloworld;

public class VarialbeScopeExam {
    int globalScope = 10;   //Ŭ���� ���� 
    static int staticVal=7;
    
    public void scopeTest(int value){   
        int localScope = 20;
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }
    
    public static void main(String[] args) {
		//System.out.println(globalScope);
		//System.out.println(localScope);
		//System.out.println(value);
    	System.out.println(staticVal);
    	
    	VarialbeScopeExam v1 = new VarialbeScopeExam();
    	VarialbeScopeExam v2 = new VarialbeScopeExam();
    	v1.globalScope = 20;
    	v2.globalScope = 30;
    	System.out.println(v1.globalScope);
    	System.out.println(v2.globalScope);
    	
    	v1.staticVal = 10;
    	v2.staticVal = 20;
    	
    	System.out.println(v1.staticVal);
    	System.out.println(v2.staticVal);
    	System.out.println(VarialbeScopeExam.staticVal);
	}
}
//static �޼ҵ忡���� static�� �Ӽ�(�ʵ�)�� ����� �� �ִ�. �ν��Ͻ� �Ӽ� x
//static �޼ҵ忡���� �ν��Ͻ� �Ӽ� x
//�ν��Ͻ� �޼ҵ忡���� static �Ӽ� o

