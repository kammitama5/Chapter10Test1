import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Main {



		public static void main(String[] args) throws FileNotFoundException {

			CruiseShip crs = new CruiseShip("Aegean Spirit", "2003", 4500);
			CargoShip cs = new CargoShip("Classica", "Edith Maersk", 2007 );
			Ship s = new Ship("Enchanted Capri", "Explorer of the Seas 2");
			
			
			JOptionPane.showMessageDialog(null,crs.toString() + "\n" + cs.toString() + "\n" + s.toString());
			
			String csvFile = "res/Ships-2.csv";

		       //create BufferedReader to read csv file
		       BufferedReader br = new BufferedReader(new FileReader(csvFile));
		       String line = "";
		       StringTokenizer st = null;

		       int lineNumber = 0; 
		       int tokenNumber = 0;

		       //read comma separated file line by line
		       try {
				while ((line = br.readLine()) != null) {
				     lineNumber++;

				     //use comma as separator
				     st = new StringTokenizer(line, ",");

				     while (st.hasMoreTokens()) {
				       tokenNumber++;

				       //display csv values
				       System.out.print(st.nextToken() + "  ");
				     }

				     System.out.println();

				     //reset token number
				     tokenNumber = 0;
	 
				 
	   }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		       

		}

	}
