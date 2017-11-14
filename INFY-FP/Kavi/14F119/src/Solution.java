import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.emp.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	/*
	 * void show() { System.out.println("Show"); }
	 * 
	 * void getGreeting(String user) { System.out.println("Greeting" + user); }
	 * 
	 * double calculateNetSalary(double basicSalary, float travelAllowance,
	 * float dearnessElements, float houseRentAllowance, float providentFund) {
	 * double netSalary = basicSalary + ((travelAllowance / 100) * basicSalary)
	 * + ((dearnessElements / 100) * basicSalary) + ((houseRentAllowance / 100)
	 * * basicSalary) - ((providentFund / 100) * basicSalary); return netSalary;
	 * }
	 */

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * String ch = bf.readLine(); int i = Integer.valueOf(ch); float f
		 * =Float.valueOf(ch); double d = Double.valueOf(ch);
		 * System.out.println(ch + 3); System.out.println(i + 3);
		 * System.out.println(f + 3); System.out.println(d + 3);
		 * 
		 * System.out.println("Hello World"); Employee obj = new Employee();
		 * System.out.println(obj.getId()); obj.setId(13); obj.setName("kavi");
		 * obj.setEmail("kavi21@gmail.com"); obj.setPhone(1234567890);
		 * obj.setGender(true); System.out.println(obj.getId());
		 * System.out.println(obj.getName());
		 * System.out.println(obj.getEmail());
		 * System.out.println(obj.getPhone());
		 * System.out.println(obj.isGender()); System.out.println(
		 * "Another object"); Employee obj1 = new Employee();
		 * System.out.println(obj1.getId()); obj1.setId(13);
		 * obj1.setName("kavi"); obj1.setEmail("kavi21@gmail.com");
		 * obj1.setPhone(1234567890); obj1.setGender(true);
		 * System.out.println(obj1.getId()); System.out.println(obj1.getName());
		 * System.out.println(obj1.getEmail());
		 * System.out.println(obj1.getPhone());
		 * System.out.println(obj1.isGender());
		 */
		int i = 0;
		while (i < 3) {
			i++;
			System.out.print("Enter Id :");
			int id = Integer.valueOf(bf.readLine());
			System.out.print("Enter Name :");
			String name = bf.readLine();
			System.out.print("Enter Email :");
			String email = bf.readLine();
			System.out.print("Enter Phone :");
			long phone = Long.valueOf(bf.readLine());
			// System.out.print("Enter Gender :");
			// boolean gender = Boolean.valueOf(bf.readLine());
			Employee obj = new Employee(id, name, email, phone);
			System.out.println("Enter Id :" + obj.getId());
			System.out.println("Enter Name :" + obj.getName());
			System.out.println("Enter Email :" + obj.getEmail());
			System.out.println("Enter Phone :" + obj.getPhone());
			// System.out.println("Enter Gender :" + obj.isGender());

			session.save(obj);
		}
		session.getTransaction().commit();

		sf.close();
		session.close();

	}

}
