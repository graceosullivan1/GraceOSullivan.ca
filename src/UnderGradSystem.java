import javax.swing.*;
import java.util.Arrays;

public class UnderGradSystem<oldest> {
    public static void main(String[] args) {

        UnderGrad david = new UnderGrad("David Clifford", 20);
        UnderGrad louise = new UnderGrad("Louise Buckley", 23);


        JOptionPane.showMessageDialog(null, david.toString() + "\n\n" + louise.toString());

        UnderGrad[] underGrad = new UnderGrad[10];

        for(int i=0; i<underGrad.length; i++){
            int option = JOptionPane.showConfirmDialog(null, "Create an UnderGrad object?", "UnderGrad..", JOptionPane.YES_NO_OPTION);

            while(option == JOptionPane.YES_OPTION) {
                underGrad[i] = new UnderGrad("Grace O Sullivan", 19);
            }

            if(option==JOptionPane.NO_OPTION)
                break;
        }

        JOptionPane.showMessageDialog(null, "----UnderGrad Array----\n" +
                Arrays.toString(underGrad));

        UnderGrad oldest = new UnderGrad();

        oldest = oldest.selectOldestUnderGrad();
    }

}


