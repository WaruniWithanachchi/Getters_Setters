 public class Student {
    private String name;
    private int age;
    private char grade;

    public Student(String name,int age,char grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;

    }

     public Student()
     {

     }


     public String getName()
    {
            return name;
    }

    public void setName(String newName)
    {
     name=newName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public char getGrade()
    {
        return grade;
    }

    public void setGrade(char newGrade)
    {
        grade = newGrade;
    }

    void displayInfo()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Grade : "+grade);
    }

        public static void main(String[] args)
        {

            Student st = new Student();

            st.setName("Zara");
            st.setAge(21);
            st.setGrade('A');

            st.displayInfo();

        }
    }

