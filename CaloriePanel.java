import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CaloriePanel extends JPanel implements ActionListener
{

	private JButton calculateButton;
	private JButton buttonTwo;

	JPanel panelCont;
	JPanel panelFirst;
	JPanel panelSecond;
	
	int [] items;
	JTextField [] fields;
	JLabel  [] infoLabels;
	JLabel [] empty; // empty space to keep neatly positioned information inside infoLabels[]
	
	int size = 0;
	
	double []calorieValue;
	double totalCalories;
	
	
	
	CaloriePanel() //default constructor
	{
	    initiateMisc();
		initiateLabels();
		initiateFields();
		setCalorieAmount();
		setTheStage();

	
	
	}  // end constructor
	
	public void initiateMisc( ) 
	{ 
		//layout set
		this.setLayout(new GridLayout(11,3));
		//
	//	totalCalories = 0;

		
		items = new int [21];
		size = items.length;
		calculateButton = new JButton("Calculate!");
		
	}
	
	
	public void initiateLabels() 
	{
		infoLabels = new JLabel[size];
		empty = new JLabel[size];
		for(int i = 0; i < size; i++)
		{ 
			infoLabels[i] = new JLabel(Integer.toString(i+1));
			empty[i] = new JLabel("");
		}
		
		
		
		
	}
	
    public void initiateFields()
    { 
    	fields = new JTextField[size];
    	int fieldSize = 12;
    	for(int i = 0; i < size; i++)
		{ 
    		if(i > 8) 
    		{ 
    			fieldSize = 11;
    		}
    		fields[i] = new JTextField(fieldSize);
    		fields[i].setText("0");
		}
    }
    
    public void setTheStage()
    { 
    	for(int i = 0; i < size; i++)
		{ 
    
    		this.add(empty[i]);
    		this.add(infoLabels[i]);
    		
    		this.add(fields[i]);
    	
		}
    	calculateButton.addActionListener(this);
    	setInfoLabelsText();	
    	this.add(calculateButton);
    	

    	
    }
    
     public void setInfoLabelsText() 
     { 
    	 String []it = {"Porridge","Musli", "Milk 65", "Banana 100", "Cottage cheese 150", "Peaunut butter", "Walnuts", "Pumpking seeds", "Sunflower seeds", "-1", "Enter misc Calories"};
    	 String []it2 = {"Bacon 260", "Eggs 131", "Beans", "Rice cake", "White rice 378", "Chicken breast 123"};
    	 //it[]     lighter 
    	 infoLabels[0].setText(it[0]); //owsianka
    	 infoLabels[2].setText(it[1]); //musli
    	 infoLabels[4].setText(it[2]); // mleko
    	 infoLabels[6].setText(it[3]); // banan
    	 infoLabels[8].setText(it[4]); // serek wiejski
    	 infoLabels[10].setText(it[5]); // maslo orzechowe
    	 infoLabels[12].setText(it[6]); // orzechy wloskie
    	 infoLabels[14].setText(it[7]); // pumpkin seeds
    	 infoLabels[16].setText(it[8]); // Sunflower seeds
    	 infoLabels[16].setText(it[9]); // ????
    	 infoLabels[20].setText(it[10]); // Misc x 1
    	 
    	 //it2 [] heavier
    	 infoLabels[1].setText(it2[0]); //bekon
    	 infoLabels[3].setText(it2[1]); //jajka
    	 infoLabels[5].setText(it2[2]); //beans
    	 infoLabels[7].setText(it2[3]); //wafel ryzowy
    	 infoLabels[9].setText(it2[4]); //ryz bialy
    	 infoLabels[11].setText(it2[5]); //kurczak

     }
     
     public void setCalorieAmount() 
     { 
    	 // calorie value per 100 grams of product
    	 calorieValue = new double[21];
    	 
    	 calorieValue[0] = 3.75;  // owsianka // 375kcal
    	 calorieValue[2] = 3.4;   // musli
    	 calorieValue[4] = 0.65;  // mleko 65kcal
    	 calorieValue[6] = 0.89;  // banan 100g = 89kcal
    	 calorieValue[8] = 1.5;   // serrk wiejski 100g = 150kcal
    	 calorieValue[10] = 6.12; // maslo orzechowe 
    	 calorieValue[12] = 7.14; // Orzechy wloskie 
    	 calorieValue[14] = 5.8; // Pumpking seeds
    	 calorieValue[16] = 5.8; // Sunflower seeds 
    	 calorieValue[18] = 0; // ???
    	 calorieValue[20] = 1; // misc calories 50 entered = 50

    	 // heavier
    	 //it2 [] heavier
    	 calorieValue[1] = 2.6; //bekon
    	 calorieValue[3] = 1.31; //jajka
    	 calorieValue[5] = 3.2; //beans
    	 calorieValue[7] =  33; //wafel ryzowy
    	 calorieValue[9] = 3.78; //ryz bialy
    	 calorieValue[11] = 1.23; //kurczak
    
    	 
    	 

     }
	
	
	public void actionPerformed(ActionEvent e) 
	{
	System.out.println("calcasdasd");
	
	for(int i = 0; i< size; i ++) 
	{ 
	//	totalCalories = totalCalories + Integer.parseInt(fields[i].getText());
		totalCalories = totalCalories + (Double.parseDouble(fields[i].getText()) * calorieValue[i]);
	}
	
	System.out.println("total caloress: " + totalCalories);
	
//	initiateMisc();
	totalCalories = 0;
	}

	
	
	
	
	
	}

	


	

