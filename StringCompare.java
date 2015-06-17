package myUtil;

public class StringCompare {
	//declare local variables
	String string1, string2;
	
	//set the constructor when passed no values
	//local variables get set to empty strings
	public StringCompare(){
		string1="";
		string2="";
	}
	
	//set the local variables with constructor where the values are passed
	//in my tester class I don't use this but it best to have all possible constructors covered
	public StringCompare(String s1, String s2){
		string1=s1;
		string2=s2;
	}
	
	//Accessor methods
	
	//two getter methods
	public String getString1(){
		return string1;
	}
	public String getString2(){
		return string2;
	}
	
	//two setter methods
	public void setString1(String s1){
		string1 = s1;
	}
	public void setString2(String s2){
		string2 = s2;
	}
	
	//compare the two strings and return a String response
	public String compare(){
		//declaring a local method variable for the return result to avoid typing return twice
		String result;
		 //using String objects built in method 'equals' with the dot operator
		// we get a boolean response so using it in an if to specify the string response
		if (string1.equals(string2)){
			result = "are equal";
		}else{
			result = "are NOT equal";
		}
		return result;
			
	}
	
}
