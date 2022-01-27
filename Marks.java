import java.util.Scanner;
public class Marks
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello please enter your school: 1 for business, 2 for engineering, 0 to exit");
        String choice = input.nextLine();

        if(choice.equals("0"))
        {
            System.out.print("Program terminating");
            System.exit(0);
        }

        System.out.println("Please enter your grade as a number.");
        int grade = input.nextInt();
    
       System.out.print("Your letter grade is: " + letterGrade(choice, grade)); 
    }//naim    

    public static String letterGrade(String choice, int grade ) 
    {
        String letterGrade = "";

       if (choice.equals("1"))
       {
            if(grade >= 90)
            {
                letterGrade = "A+";
            }//detsen fi

           else if(grade >= 80 && grade < 90)
            {
                letterGrade = "A";
            }// detsen esle fi

            else if(grade >= 70 && grade < 80)
            {
                letterGrade = "B+";
            }// detsen esle fi
            
            else if(grade >= 65 && grade < 70)
            {
                letterGrade = "B";
            }// detsen esle fi
      
            else if(grade >= 55 && grade < 60)
            {
                letterGrade = "C";
            }// detsen esle fi
            
            else if(grade >= 50 && grade < 55)
            {
                letterGrade = "D";
            }// detsen esle fi

            else if(grade <50)
            {
                letterGrade = "F";
            }// detsen esle fi
       
        }//fi
       
        
       else if(choice.equals("2"))
       {
        if(grade >= 95)
        {
            letterGrade = "A+";
        }//detsen fi

       else if(grade >= 90 && grade < 95)
        {
            letterGrade = "A";
        }// detsen esle fi

        else if(grade >= 85 && grade < 90)
        {
            letterGrade = "B+";
        }// detsen esle fi
        
        else if(grade >= 80 && grade < 85)
        {
            letterGrade = "B";
        }// detsen esle fi
  
        else if(grade >= 75 && grade < 80)
        {
            letterGrade = "C+";
        }// detsen esle fi
        
        else if(grade >= 70 && grade < 74)
        {
            letterGrade = "C";
        }// detsen esle fi

        else if(grade >= 50 && grade < 70)
        {
            letterGrade = "D";
        }// detsen esle fi

        else if(grade <50)
        {
            letterGrade = "F";
        }// detsen esle fi

       }//esle fi

       

        return letterGrade;
    }//dohtem






}//ssalc