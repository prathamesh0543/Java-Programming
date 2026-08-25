package Java_8_feature_jm__;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Aug_17Hospital_Management {


	public static void main(String[] args) {

		class Patient {
			int id;
			String name;
			int age;
			String disease;
			String doctor;
			String ward;
			double bill;
			boolean admitted;

			public Patient(int id, String name, int age, String disease,
					String doctor, String ward, double bill, boolean admitted) {

				this.id = id;
				this.name = name;
				this.age = age;
				this.disease = disease;
				this.doctor = doctor;
				this.ward = ward;
				this.bill = bill;
				this.admitted = admitted;
			}

			public String toString() {
				return "Patient ID : " + id +
						"\nName : " + name +
						"\nAge : " + age +
						"\nDisease : " + disease +
						"\nDoctor : " + doctor +
						"\nWard : " + ward +
						"\nBill : ₹" + bill +
						"\nAdmitted : " + admitted +
						"\n----------------------------";
			}
		}

		List<Patient> patients = Arrays.asList(

				new Patient(101, "Rahul", 25, "Fever",
						"Dr. Mehta", "General", 1200, true),

				new Patient(102, "Sneha", 32, "Diabetes",
						"Dr. Shah", "ICU", 25000, true),

				new Patient(103, "Amit", 45, "Heart",
						"Dr. Patil", "ICU", 80000, true),

				new Patient(104, "Priya", 20, "Fracture",
						"Dr. Joshi", "Ortho", 15000, false),

				new Patient(105, "Rohan", 60, "Cancer",
						"Dr. Shah", "ICU", 150000, true),

				new Patient(106, "Neha", 28, "Fever",
						"Dr. Mehta", "General", 1800, false),

				new Patient(107, "Karan", 35, "Covid",
						"Dr. Patil", "Isolation", 10000, true),

				new Patient(108, "Pooja", 24, "Migraine",
						"Dr. Mehta", "General", 2500, false)
		);

//		atients.forEach(System.out::println);
		
		System.out.println("1.admitted Patient List:");
		patients.stream()
		.filter((p)->p.admitted)
		.forEach(System.out::println);
		System.out.println("------00000---------00000-----------");
		
		System.out.println("2.ICU admitted Patient List:");
		patients.stream()
		.filter((p)->p.ward.equals("ICU"))
		.forEach(System.out::println);
		
		System.out.println("3. Patient Name starting with R:");

		patients.stream()
		.filter((p) -> p.name.startsWith("R"))
		.map((p) -> p.name.toUpperCase())
		.forEach(System.out::println);
		
		System.out.println("4.unique disease:");
		patients.stream()
		.map(p -> p.disease)
		.distinct()
		.forEach(System.out::println);
		
		patients.stream()
        .sorted(Comparator.comparingDouble(p -> p.bill))
        .limit(3)
        .forEach(System.out::println);}
}