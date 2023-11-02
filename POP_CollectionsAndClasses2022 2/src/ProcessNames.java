import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class ProcessNames {

	//Task 1 - read in all data from a file
	public ArrayList<String> readNames(String namesFile1) throws Exception {
		ArrayList<String> names = new ArrayList<String>(); //empty array
		File file = new File(namesFile1);
		Scanner fileScan = new Scanner(file); //reads to file

		while (fileScan.hasNext()){
			names.add(fileScan.nextLine());
		}
		fileScan.close();
		return names;
	}


	//Task 2 - sort the data
	public ArrayList<String> sortNames(ArrayList<String> names){
		Collections.sort(names);
		return names;

	}



	//Task3 - find name position
	public int findNamePosition(ArrayList<String> myNames, String name) {
		boolean found = false;
		int i = 0;
		int position = -1;
		//linear search method
		while(!found && i< myNames.size()){
			if(name.equals(myNames.get(i))){
				position = i;
				found = true;
			}
			else{
				i++;
			}
		}
		return position;
	}


	//Task4 - delete name
	public ArrayList<String> deleteName(ArrayList<String> names, String name){
		names.remove(name);
		return names;
	}



	//Task5 - change name
	public ArrayList<String> changeName(ArrayList<String> names, String name, String newName){
		boolean found = false;
		int i = 0;
		int position = -1;
		//linear search method
		while(!found && i< names.size()){
			if(name.equals(names.get(i))){
				position = i;
				found = true;
			}
			else{
				i++;
			}
		}
		names.set(position,newName);

		return names;
	}


}