package collection1;

import java.util.ArrayList;

public class UseUser {
	public static void main(String[] args) {

		User u1 = new User(10, "ravi", 25, "male", "ravi12@gmail.com", 7358564745l);
		User u2 = new User(11, "jothi", 20, "female", "jothi@gmail.com", 4578412578l);
		User u3 = new User(12, "yamini", 24, "female", "yamini12@yahoo.com", 1247856987l);
		User u4 = new User(14, "tharun", 20, "male", "tharun@yahoo.com", 4578965412l);
		User u5 = new User(15, "lavi", 28, "female", "lavi@gmail.com", 5462874596l);
		User u6 = new User(20, "arun", 21, "male", "arun12@gmail.com", 4523687451l);
		User u7 = new User(17, "giri", 26, "male", "giri@gmail.com", 4578965214l);
		User u8 = new User(25, "kavi", 25, "female", "kavi12@yahoo.com", 4578965214l);
		User u9 = new User(26, "devi", 28, "female", "devi@yahoo.com", 4578154785l);
		User u10 = new User(24, "tom", 30, "male", "tom223@gmail.com", 4578965214l);
		User u11 = new User(35, "raja", 26, "male", "raja12@gmail.com", 4578425841l);
		User u12 = new User(36, "lavanya", 23, "female", "lavanya12@yahoo.com", 4578965231l);
		User u13 = new User(37, "nani", 25, "male", "nani12@gmail.com", 4578521450l);
		User u14 = new User(40, "lily", 20, "female", "lily@gmail.com", 4579632147l);
		User u15 = new User(42, "hari", 45, "male", "hari@yahoo.com", 4578521456l);

		ArrayList<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		users.add(u6);
		users.add(u7);
		users.add(u8);
		users.add(u9);
		users.add(u10);
		users.add(u11);
		users.add(u12);
		users.add(u13);
		users.add(u14);
		users.add(u15);

//		for(int i=0;i<users.size();i++) {
//			System.out.println(users.get(i));
//			
//		} 
//			for(User u:users) {
//				System.out.println(u);
//				
//			}
//			users.forEach((x)->System.out.println(x));
//			

//			for(int i=0;i<users.size();i++) {
//				if(users.get(i).getAge()>30) {
//					System.out.println(users.get(i));
//					
//				}
//				
//			}
//			

//			ArrayList<User> users1=new ArrayList<>();
//		    ArrayList<User> users2=new ArrayList<>();
//			
//		    for(User u:users) {
//		    	if(u.getGender().equals("male")) 
//		    		users1.add(u);
//		    		
//		    	else if(u.getGender().equals("female"))
//		    		users2.add(u);
//		    }
//		    	users1.forEach((x)->System.out.println(x));
//		        users2.forEach((x)->System.out.println(x));
//		    
//		for (int i = 0; i < users.size(); i++) {
//			if (users.get(i).getName().startsWith("l")) {
//				System.out.println(users.get(i).getPhoneNO());
//
//			}
//
//		}

		for (User u : users) {
			if (u.getMailId().contains("gmail.com")) {
				System.out.println(u);
			}

		}

	}

}
