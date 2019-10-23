import javax.swing.*;

public class UnderGrad extends Student {
    private String[] subjects;
    private String category;

    public UnderGrad(){
        super();
        this.subjects = subjects;                                   //not sure
        this.category = "Full-Time";
    }

    public UnderGrad(String name, int age){
        super(name, age);
        setSubjects();
    }

    public String[] getSubjects() {
        return subjects;
    }

    public String getCategory(){
        return category;
    }//end accessor methods

    public void setSubjects(){
        String input = JOptionPane.showInputDialog("Enter a subject");

        while(!input.equals("")){
            for(int i=0; i<10; i++){
                subjects[i] = input;

                input = JOptionPane.showInputDialog("Enter another subject");
            }
        }
    }

    public void setCategory(String category){
        this.category = category;
    }//end mutator methods

    public String toString(){
        return (super.toString() +
                "\nSubjects: " + getSubjects() +
                "\nCategory: " + getCategory());
    }

    public void selectOldestUnderGrad(){
        
    }
}