package JavaStudy.tryhelloworld;

public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;

        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;     
        gender1 = "abc";
        
        System.out.println(gender1);
        
        Gender gender2;

        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
      //  gender2 = "abc";  //error
    }

}
enum Gender{
    MALE, FEMALE;
}
//특정 값만 가져야 한다면 열거형을 사용하는 것이 좋다.