import java.util.*;
public class School {

    private ArrayList<Student> year1 = new ArrayList<Student>();
    private ArrayList<Student> year2 = new ArrayList<Student>();
    private ArrayList<Student> year3 = new ArrayList<Student>();
    private ArrayList<Student> year4 = new ArrayList<Student>();
    Scanner in = new Scanner(System.in);

    //School constructors
    public School()
    {
        System.out.println("Please enter the year of the first student as an integer between 1 & 4 (1 = freshman, 2 = sophomore, 3 = junior, 4 = senior) or any other number to quit: ");
        int year = in.nextInt();
        //Hint 1
        while(/*ToDo*/)
        {
           //Hint 1
            /*ToDo*/
        }
        alphabetizeList(year1);
        alphabetizeList(year2);
        alphabetizeList(year3);
        alphabetizeList(year4);
    }

    public School(ArrayList<Student> year1, ArrayList<Student> year2, ArrayList<Student> year3, ArrayList<Student> year4)
    {
        //Initialize the instance variables to the values in the parameters.
        /*ToDo*/
        alphabetizeList(year1);
        alphabetizeList(year2);
        alphabetizeList(year3);
        alphabetizeList(year4);
    }

    /** getter methods - first, alphabetize the lists according to last name, then first name; then, return them.
     * Each one returns the instance variable lists after alphabetizing them.
     * Postcondition: The students in year1, year2, year3, and year4 are sorted in alphabetical
     * order by last name and then first name at return.*/
    /*ToDo*/


    /** Returns an alphabetized ArrayList of students representing those on the Dean's List -
     * all students with GPAs at or above 3.75.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects.
     * Postcondition: year1, year2, year3, and year4 are unchanged.
     * A return, the list representing the Dean's List is full of students with GPAs at or above 3.75,
     * alphabetized by last name, then first name.*/
    public /*ToDo*/ deansList()
    {
        /*ToDo*/
    }

    /** calcSchoolAverageGpa()
     * Returns the value representing the average GPA of all students at a school.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects.
     * Postcondition: year1, year2, year3, and year4 are unchanged.*/
    /*ToDo*/


    private void alphabetizeList(ArrayList<Student> list) {
        int min;
        Student temp;
        for(int outer=0; outer<list.size()-1; outer++)
        {
            min = outer;
            for(int inner=outer+1; inner<list.size(); inner++)
            {
                //Compare the two last names of the Students at the indices inner and min. If the last name at index inner comes before the last name at index min alphabetically, {min becomes inner}.
                if (/*ToDo*/)
                { min = inner; }
                //If two last names of the Students at the indices inner and min are the same, then compare the two first names at indices inner and min. If the first name at index inner comes before the first name at index min alphabetically, {min becomes inner}.
                else if(/*ToDo*/)
                { min = inner; }
            }

            //swap
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
        }
    }

    /** Returns the Student object with the ID number, id. If id does not match anyone
     * in the school, return null.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects.
     * Postcondition: year1, year2, year3, and year4 are unchanged.*/
    public /*ToDo*/ findStudent(int id)
    {
        /*ToDo*/
    }

    /** Removes the Student objects in schools that are equal, according to the
     * equals method in the Student class so that only one remains.
     * Returns a count of the number of objects that have been removed.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects and no Student objects
     * across lists are equal. For example, there are no Student objects in year1 that are equal to
     * Student objects in year2, year3, or year4 and there are no Student objects in year2 that are equal to
     * Student objects in year1, year3, or year4, and so on.
     * Postcondition: Any Student objects in year1, year2, year3, and year4 that are doubles are removed
     * from their respective lists so that only one remains.
     * At return, a count of the number of objects that have been removed.*/
    public int removeDoubles()
    {
        /*ToDo*/
    }


}
