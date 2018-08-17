import javax.swing.*;


public class TestCaloriePanel {
public static void main(String [] args) { 
	 
	 CaloriePanel myCaloriePanel = new CaloriePanel();
	JFrame myMainFrame = new JFrame("Calculate Calories");
	
	myMainFrame.add(myCaloriePanel);
	myMainFrame.setSize(700,600);
	myMainFrame.setVisible(true);
	myMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 
	
}
}
