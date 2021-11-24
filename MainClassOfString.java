/*--------------------------------------------------
		Function Names ::
			characterAt
			firstIndexOfChar
			lastIndexOfChar
			lengthOfString
			substringOfString(int first_index)
			substringOfString(int first_index,int last_index)
			toUpperCase
			toLowerCase
			capitalize
			isEmptyString
			equal
			replaceChar
			startWith

--------------------------------------------------*/


import java.util.Scanner;
class MainClassOfString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String obj = sc.nextLine();
		MyString str = new MyString(obj);
		// System.out.println(str.indexOfChar('j',0));
		//System.out.println(str.trimSpaces());
		// System.out.println(str.lengthOfString());
	}
}

