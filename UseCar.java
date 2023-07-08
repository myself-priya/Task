package collection1;

import java.util.ArrayList;

public class UseCar {
	public static void main(String[] args) {

		Car c1 = new Car("honda", 45000, "red", "DET45");
		Car c2 = new Car("givi", 55000, "black", "OUT45");
		Car c3 = new Car("jaguvar", 110000, "white", "HYT4");
		Car c4 = new Car("BMW", 145000, "blue", "JHTRE2");
		Car c5 = new Car("audi", 20000, "grey", "RHT4");
		Car c6 = new Car("benze", 35000, "red", "GHT45");
		Car c7 = new Car("fararee", 600000, "black", "HRT45");
		Car c8 = new Car("honda", 66000, "orange", "DUT785");
		Car c9 = new Car("kivi", 32000, "red", "WED34");
		Car c10 = new Car("jaguvar", 750000, "blue", "RYTR4");

		ArrayList<Car> cars = new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		cars.add(c7);
		cars.add(c8);
		cars.add(c9);
		cars.add(c10);

//	for(int i=0;i<cars.size();i++) {
//		System.out.println(cars.get(i));
//		
//		System.out.println(cars.get(i).getBrand());
//	}
//	
//	
//	for(Car c:cars) {
//		
//		System.out.println(c);
//		System.out.println(c.getBrand());
//	}
//	
//    cars.forEach((y)->System.out.println(y));	
// 	

//	for(int i=0;i<cars.size();i++) {
//		if(cars.get(i).getBrand().equals("audi")) {
//			System.out.println(cars.get(i));
//		}
//		
//	}
//	
//	for(Car r:cars) {
//		if(r.getPrice()>75000) {
//			System.out.println(r);
//			
//		}
//		
//	}

		ArrayList<Car> recentCar = new ArrayList<>();

//	for(int i=0;i<cars.size();i++) {
//		if(cars.get(i).getModel().startsWith("D")) {
//			recentCar.add(cars.get(i));
//		}
//		
//	}
//	recentCar.forEach((x)->System.out.println(x));
//	

//		for (Car c : cars) {
//			if (c.getModel().startsWith("D")) {
//				recentCar.add(c);
//			}
//		}
//		recentCar.forEach((x) -> System.out.println(x));
		
		cars.forEach((x)->{
			if(x.getPrice()>75000) {
				recentCar.add(x);
			System.out.println(x);	
			}
			
		});
	
	}
}
