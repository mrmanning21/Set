import java.util.Scanner; //Importing utility.

public class Test {

      public static void main (String [] args) {

    	  //Adding my title information.
    	  System.out.println ("Programming Fundamentals\nNAME: Michael Ryan Manning\nPROGRAMMING ASSIGNMENT 4 - SET");
          Set set = new Set ();

          //Adding scanner and string space.
          String command = "";
          Scanner scn = new Scanner (System.in);
            
          while (true) {
                System.out.print ("Enter command: ");

                command = scn.nextLine ();

                String gather [] = command.split (" ");

                if (gather.length == 2) {

                	//Starting the if, try, catch for all inputs to formulate responses based off strings.
                    if (gather [0].trim ().equalsIgnoreCase ("add")) {

                          try {
                        	  
                        	  	//Parsing the array for the try statement.
                                int numb = Integer.parseInt (gather [1]);
                                set.add (numb);
                                System.out.println (set);
                            	} 
                          
                          catch (Exception e) {

                                System.out.println ("This is not correct. Please try again.");

                              					}

                } 
                    else if (gather [0].trim ().equalsIgnoreCase ("del")) {

                          try {

                                int numb = Integer.parseInt (gather [1]);
                                set.delete (numb);
                                System.out.println (set);
                            	} 
                            
                          catch (Exception e) {

                                  System.out.println ("Invalid input, try again!");
                              					}

                } 
                    else if (gather[0].trim ().equalsIgnoreCase ("exists")) {
                    		
                            try {
                            	
                                int numb = Integer.parseInt (gather[1]);
                                System.out.println(set.exists (numb));
                              		} 
                              
                            catch (Exception e) {
                                 System.out.println ("This is not correct. Please enter again.");
                              						}

                        } 
                      
                    else {
                            System.out.println ("Command not recognized.");
                        	}

              }
              else {
                      System.out.println ("You should be entering the command and then the number.");
                  }

            }

      }

}