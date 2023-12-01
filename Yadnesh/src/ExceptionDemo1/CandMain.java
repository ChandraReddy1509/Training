package ExceptionDemo1;
import java.util.ArrayList;
import java.util.List;

public class CandMain {


public static void main(String[] args) {
    // Sample usage
    List<Candidate> candidates = new ArrayList<>();
    candidates.add(new Candidate(1, "John", 30, "Male", "Product Development", 2010, 80000.0));
    candidates.add(new Candidate(2, "Alice", 28, "Female", "Product Development", 2012, 75000.0));
    candidates.add(new Candidate(3, "Bob", 25, "Male", "Marketing", 2015, 70000.0));
    candidates.add(new Candidate(4, "Eve", 26, "Female", "Marketing", 2014, 72000.0));

    // Testing the methods
    System.out.println("Count by Gender: " + getCount(candidates));
    
    System.out.println("Average Age by Gender: " + getAverageAge(candidates));
   // System.out.println("Count by Department: " + countCandidatesDepartmentWise(candidates));
  //  System.out.println("Youngest Male in Product Development: " + getYoungestCandidateDetails(candidates));
}

private static String getAverageAge(List<Candidate> candidates) {
	// TODO Auto-generated method stub
	return null;
}

private static String getCount(List<Candidate> candidates) {
	// TODO Auto-generated method stub
	return null;
}
}

