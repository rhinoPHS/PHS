package JavaStudy.tryhelloworld;
import java.util.Calendar;
public class SwitchExam{
  public static void main(String[] args){
    //month에는 현재 월이 들어 있습니다.
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
    String season = "";
    //switch문을 이용해서 season이 봄/여름/가을/겨울 중 하나의 값을 가지도록 만들어 보세요.
    switch(month)
    {
      case 12: case 1: case 2:
       season="겨울";
       break;
       
      case 3: case 4: case 5:
          season="봄";
          break;
       
      case 6: case 7: case 8:
       season="여름";
       break;
       
      case 9: case 10: case 11:
      season="가을";
      break;
    }


    //이 위에서 switch문을 완료해야 합니다.
    System.out.println("지금은 "+ month +"월이고, "+ season +"입니다.");
  }
}
/*
import java.util.Calendar;
public class SwitchExam{
  public static void main(String[] args){
    //month에는 현재 월이 들어 있습니다.
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
    String season = "";
    
    //다음과 같이 case문을 한번에 사용하면 더 짧게 코드를 짤 수 있습니다.
    switch(month){
      case 1:
      case 2:
      case 12:
        season = "겨울";
        break;
      case 3:
      case 4:
      case 5:
        season = "봄";
        break;
      case 6:
      case 7:
      case 8:
        season = "여름";
        break;
      case 9:
      case 10:
      case 11:
        season = "가을";
        break;        
        
    }

    System.out.println("지금은 "+ month +"월이고, "+ season +"입니다.");
  }
}*/