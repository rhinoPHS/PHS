package JavaStudy.tryhelloworld.ClassCast;

	public class GasStation{
		public static void main(String[]args){
			GasStation gasStation = new GasStation(); //gasStation�ν��Ͻ� ����
			Suv suv = new Suv(); //suv �ν��Ͻ� ����
			Truck truck = new Truck(); //truck �ν��Ͻ� ����
			Bus bus = new Bus(); //bus �ν��Ͻ� ����

			//gasStation���� suv�� �⸧�� �ֽ��ϴ�.
			gasStation.fill(suv);

			//gasStation���� truck�� �⸧�� �ֽ��ϴ�.
			gasStation.fill(truck);

			//gasStation���� bus�� �⸧�� �ֽ��ϴ�.
			gasStation.fill(bus);
			
		}
		public void fill(Car car){
		 	//����. car.getClass().getName()�� car������Ʈ�� ������ � Ŭ���������� �˷��ݴϴ�.
		 	System.out.println(car.getClass().getName()+"�� �⸧�� �ֽ��ϴ�.");

		 	car.gas += 10;
			System.out.println("�⸧�� "+car.gas+"���� ����ֽ��ϴ�.");
		 }

		/*public void fill(Suv suv){
			System.out.println("Suv�� �⸧�� �ֽ��ϴ�.");
			suv.gas += 10;
			System.out.println("�⸧�� "+suv.gas+"���� ����ֽ��ϴ�.");
		}

		public void fill(Truck truck){
			System.out.println("Truck�� �⸧�� �ֽ��ϴ�.");
			truck.gas += 10;
			System.out.println("�⸧�� "+truck.gas+"���� ����ֽ��ϴ�.");
		}

		public void fill(Bus bus){
			System.out.println("Bus�� �⸧�� �ֽ��ϴ�.");
			bus.gas += 10;
			System.out.println("�⸧�� "+bus.gas+"���� ����ֽ��ϴ�.");
		}*/
	}