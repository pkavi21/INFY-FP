package org.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.task1.Reservation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Output {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		for (i = 0; i < 2; i++) {

			System.out.print("Enter Name :");
			String name = bf.readLine();
			System.out.print("Enter Phone :");
			long phone = Long.valueOf(bf.readLine());
			System.out.print("Enter FromPlace :");
			String fromPlace = bf.readLine();
			System.out.print("Enter ToPlace :");
			String toPlace = bf.readLine();
			System.out.print("Enter Departure Date :");
			int departDate = Integer.valueOf(bf.readLine());
			System.out.print("Enter Arrival Date :");
			int arrivalDate = Integer.valueOf(bf.readLine());
			Reservation obj = new Reservation(name, phone, fromPlace, toPlace, departDate, arrivalDate);
			System.out.println("Enter name :" + obj.getName());
			System.out.println("Enter phone :" + obj.getPhone());
			System.out.println("Enter fromplace :" + obj.getFromPlace());
			System.out.println("Enter toplace :" + obj.getToPlace());
			System.out.println("Enter departTime :" + obj.getDepartDate());
			System.out.println("Enter arrivalTime :" + obj.getArrivalDate());

			session.save(obj);
		}
		session.getTransaction().commit();

		sf.close();
		session.close();

	}

}
