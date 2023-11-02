import java.util.ArrayList;

public class ProcessNamesStudentOutputTests {

    public static void main(String[] args) throws Exception {
        ProcessNames processNames = new ProcessNames();
        ArrayList<String> myNames = new ArrayList<String>();

        //Task1
        myNames = processNames.readNames("namesFile1.txt");
        System.out.println(myNames);

        //Task2
        System.out.println(processNames.sortNames(myNames));
        //System.out.println(myNames);

        //Task3
        System.out.println(processNames.findNamePosition(myNames,"Tory Warren"));

        //Task4
        System.out.println(processNames.deleteName(myNames, "Hiram Mcfarland"));;

        //Task5
        System.out.println(processNames.changeName(myNames, "Clark Snow", "John Snow"));
    }

}
