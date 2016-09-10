package JavaStudy.tryhellworld.Exception;

public class UserExam {
	public static void main(String[] args) {
		UserService user = new UserService();
		user.Usermethod(5);
		try{
			user.Usermethod(-3);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
