/*----------------------------------------------------
Author : Anil Kumar
Date : 26 - NOV - 2021
Description : Get the state city and names using the HashMap.
Status : Completed
----------------------------------------------------------*/
import java.io.Console;
import java.util.HashMap;
import java.util.ArrayList;
class Student{
	String name,city;
	public Student(String name,String city){
		this.name = name;
		this.city = city;
		
		
		
		
	}
}
class FetchNamesByCity{
	public static void main(String args[]){
		Console con = System.console();
		ArrayList<Student> list1 = new ArrayList<Student>();
		HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		System.out.println("How many cities you want to add ::  ");
		int cities = Integer.parseInt(con.readLine());
		for(int i = 1;i <= cities;i++){
			System.out.println("Enter name : ");
			String name = con.readLine();
			System.out.println("Enter city : ");
			String city = con.readLine();
			list1.add(new Student(name,city));
		}
		for(Student s : list1){
			if(!(map.containsKey(s.city))){
				map.put(s.city, new ArrayList<String>());
			}
			map.get(s.city).add(s.name);
		}
		for(String key : map.keySet()){
			System.out.println(key);
			System.out.println(map.get(key) + " ");
		}
	}
}