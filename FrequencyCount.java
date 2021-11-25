/*----------------------------------------------------
Author : Anil Kumar
Date : 26 - NOV - 2021
Description : Count the number of characters in a string using HashMap.
Status : Completed
----------------------------------------------------------*/
import java.io.Console;
import java.util.HashMap;
class FrequencyCount{
	public static void main(String args[]){
		Console con = System.console();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		System.out.println("Enter any String :: ");
		String str = con.readLine();
		char arr[] = str.toCharArray();
		for(char c:arr){
			if(c == ' '){      // To skip the spaces count
				continue;
			}
			if(!map.containsKey(c)){
				map.put(c,0);//Initially passing zero because here we are just adding the first key to the map
			}
			map.put(c,map.get(c)+1);
		}
		System.out.println(map);
	}
}