import java.util.Scanner;
class MyString{
	char arr[];
	String str = new String();
	public MyString(String str){
		this.str = str;
		arr = str.toCharArray();
	}
//This method return the character of particular index                                         characterAt
	public char characterAt(int index){
		if(index<0 || index>arr.length-1){
			throw new StringIndexOutOfBoundsException(index);   
		}
		return arr[index];
	}
//This method return the first index of entered character                                 firstIndexOfChar
	public int firstIndexOfChar(char ch){
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == ch){
				return i;
			}
		}
		return -1;
	}
//This method would return the last index of the entered character                         lastIndexOfChar
	public int lastIndexOfChar(char ch){
		int c = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == ch){
				c = i;
			}
		}
		return c;
	}
//This method would return the length of the String                                         lengthOfString
	public int lengthOfString(){
		return arr.length;
	}
//This method would return the substring from the string                                 substringOfString
	public String substringOfString(int init){
		str = "";
		int last = arr.length-1;
		if(init<0 || last > arr.length-1){
			return "Index out Of Bound"; 
		}
		for(int i = init;i<=last;i++){
			str+=arr[i];
		}
		return str;
	}
//This method would return the substring from the string                                 substringOfString
	public String substringOfString(int init,int last){
		str = "";
		if(init<0 || last > arr.length-1){
			return "Index out Of Bound"; 
		}
		for(int i = init;i<last;i++){
			str+=arr[i];
		}
		return str;
	}
//This method would convert all lower case into UPPERCASE                                     toUpperCase
	public String toUpperCase(){
		str = "";
		for(int i = 0;i<arr.length;i++){
			if(arr[i] >='a' && arr[i] <= 'z'){
				str = str + (char)((int)arr[i] - 32);
			}
			else{
				str = str + arr[i];
			}
		}
		return str;
	}
//This method would convert all UPPERCASE into lower case 	               					  toLowerCase
	public String toLowerCase(){
		str = "";
		for(int i = 0;i<arr.length;i++){
			if(arr[i] >='A' && arr[i] <= 'Z'){
				str = str + (char)((int)arr[i] + 32);
			}
			else{
				str = str + arr[i];
			}
		}
		return str;
	}
//This method will capitalize the first word of the String     						     		capitalize
	public String capitalize(){
		if(arr.length > 0)
		{
			if(arr[0] >= 'a' && arr[0] <= 'z'){
				arr[0] = (char)((int)arr[0] - 32);
			}
		}
		return String.valueOf(arr);
	}
//This method would determine the string is empty or not									isEmptyString
	public boolean isEmptyString(){
		return arr.length > 0 ? true:false;
	}
//this method concatenate two strings														concatenation
	public String concatenation(String s){
		return (String.valueOf(arr) + s);
	}
//This method compares two strings with all characters 							         			equal
	public boolean equal(String s){
		char arr2[] = s.toCharArray();
		if(arr.length == arr2.length){
		for(int i = 0;i < arr.length;i++){
			if(arr[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
	return false;
	}
//This method will replace the previous string character with the new character               replaceChar
	public String replaceChar(char lastChar,char newChar){
		for(int i = 0;i < arr.length;i++){
			if(arr[i] == lastChar){
				arr[i] = newChar;
			}
		}
		return String.valueOf(arr);
	}
//This method will determine the starting of string with the specified                        startWith
	public boolean startWith(String s){
		char []arr2 = s.toCharArray();
		if(arr.length-1 >= arr2.length-1){
			for(int i = 0;i < arr2.length;i++){
				if(arr[i] != arr2[i]){
					 return false;
				}
			}
			return true;
		}
		return false;
	}
//This method will return the first index of character after the given index                 indexOfChar
	public int indexOfChar(char ch,int index){
		if(index > 0 || index < arr.length-1){
			int ind = -1;
			for(int i = index+1;i<arr.length;i++){
				if(arr[i] == ch){
					ind = i;
				}
			}
			return ind;
		}
		return -1;
	}
//This method will ommit the leading the trailing white spaces from the string 				trimSpaces
	/*public String trimSpaces(){
		if(arr.length > 0){
			if(arr[0] == ' '){
				int front_spaces = 0;
				int back_spaces = 0;
				int j = arr.length-1;
				while(front_spaces < arr.length && arr[front_spaces] == ' '){
					front_spaces++;
				}
				while(j >=0 && arr[j] == ' '){
					j--;
					back_spaces++;
				}
				char arr2[] = new char[arr.length - (front_spaces + back_spaces)]
				int p = 0;
				for(int k = 0;k<arr.length-(front_spaces)+2;k++){
					arr2[p] = arr[k];
					front_spaces++;
					
				}
				for(int m = 0 ;m<arr2.length; m++){
					System.out.print(arr2[m]);
				}
				return String.valueOf(arr);
			}
			if(arr[arr.length - 1] == ' '){
				for(int i = 0;i<arr.length-1;i++){
					arr[i] = arr[i];
				}
			}
			return String.valueOf(arr);
		}
		else{
			return "";
		}
	}*/

}