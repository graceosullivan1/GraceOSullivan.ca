public abstract class Student implements Categorizable{
    private String name;
    private int age;
    private String category;

    public Student(){
        this("Unknown", 0);
    } //end no-argument constructor

    public Student(String name, int age){
        setName(name);
        setAge(age);
    }//end multiple-argument constructor

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    } // end accessor methods

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    } // end mutator methods

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    } //end abstract methods

    public String toString(){
        return ("Name: " + getName() +
                "\nAge: " + getAge());
    }//end toString method
}
