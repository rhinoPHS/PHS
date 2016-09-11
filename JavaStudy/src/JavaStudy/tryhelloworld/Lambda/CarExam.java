package JavaStudy.tryhelloworld.Lambda;

import java.util.*;
public class CarExam{
  public static void main(String[] args){
    //Car��ü�� ���� cars�� �ֽ��ϴ�.
    List<Car> cars = new ArrayList<>();
    cars.add( new Car("������",2,800,3) );
    cars.add( new Car("������",12,1500,8) );
    cars.add( new Car("�߰���",5,2200,0) );
    cars.add( new Car("�����",5,3500,1) );

    printCarCheaperThan(cars, 2000);
  }
//  ù ��°�� ������ 2000���� �� ������ �˻��ؼ� �̸��� ����ϴ� printCarCheaperThan�̶�� �Լ��� �ֽ��ϴ�.
  public static void printCarCheaperThan(List<Car> cars, int price){
    for(Car car : cars){
      if(car.price < price){
        System.out.println(car);
      }
    }
  }
}