import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
	int [] arr1 = {1, 2, 3, 4, 5};
	String[] str1 = {"dilan","haddad"};
	
	for (int i = 0; i < str1.length; i++) {
		System.out.println(arr1[i]);
		
		
		
	}
	ArrayList<String> nameList = new ArrayList<>();
	
	nameList.add("Jonny");
	nameList.add("Musa");
	
	for (int i = 0; i < nameList.size(); i++) {
		System.out.print(nameList.get(i)+ " ");
	}
	} 

}
