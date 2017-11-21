import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.emp.Employee;
import org.grosary.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.isbn.bk.Book;
import org.veh.FourWheeler;
import org.veh.TwoWheeler;
import org.veh.Vehicle;

public class Solution {
	

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		Vehicle vehicle=new Vehicle();
		vehicle.setName("car");
		
		TwoWheeler two = new TwoWheeler();
		two.setName("Bike");
		two.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler four = new FourWheeler();
		four.setName("Porsche");
		four.setSteeringWheel("Porsche Steering Wheel");
		
				
		session.close();
		sf.close();

	}

}
