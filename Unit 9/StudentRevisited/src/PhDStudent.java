public class PhDStudent extends CollegeStudent {

    //instance variables
    private String thesisTitle; //thesis title
    private boolean isTeaching; //whether or not a PhDStudent is teaching
    private String classTeaching; //the class the PhDStudent is teaching

    //constructor
    public PhDStudent(String name, int age, String gender, String idNum, double gpa, double totalStudyHours, int year, String major,
                      String thesisTitle, boolean isTeaching, String classTeaching)
    {
        // use the super class's constructor
        /*ToDo*/
        //initialize what's new to PhDStudent
        /*ToDo*/
    }

    //getter methods
    public /*ToDo*/ getThesisTitle()
    {
        /*ToDo*/
    }
    public /*ToDo*/ getIsTeaching(){ /*ToDo*/}
    public /*ToDo*/ getClassTeaching()
    {
        /*ToDo*/
    }


    //setter methods
    public /*ToDo*/ setThesisTitle(String thesisTitle)
    {
        /*ToDo*/
    }
    public /*ToDo*/ setIsTeaching(boolean isTeaching)
    {
        /*ToDo*/
    }
    public /*ToDo*/ setClassTeaching(String classTeaching)
    {
        /*ToDo*/
    }

    //Postcondition: totalStudyHours is updated to include the number of hours a PhDStudent spends writing a thesis.
    public /*ToDo*/ writesThesis(int hours)
    {
        /*ToDo*/
    }

    /* overrides the toString method in the parent class to include a PhDStudent's thesisTitle, whether or not the
       PhDStudent is teaching, and the class the PhDStudent is teaching.
     */
    public /*ToDo*/ toString()
    {
        return (/*ToDo*/ + ", thesis title: " + thesisTitle + ", It is " + isTeaching + " that I am teaching. class teaching: " + classTeaching);
    }

}
