package JavaStudy.tryhelloworld;

public class VarialbeScopeExam {
    int globalScope = 10;   //클래스 변수 
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
//static 메소드에서는 static한 속성(필드)만 사용할 수 있다. 인스턴스 속성 x
//static 메소드에서는 인스턴스 속성 x
//인스턴스 메소드에서는 static 속성 o

