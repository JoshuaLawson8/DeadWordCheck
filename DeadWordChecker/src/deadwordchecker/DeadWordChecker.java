/*
 *  Joshua Lawson, Student and Pursuer of knowledge
 *  Code under no copyrights, free to use
 *  Credit is appreciated
 */
package deadwordchecker;

import java.util.Scanner;

/**
 *
 * @author Josh
 */
public class DeadWordChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        boolean finale = true;
        int inital = 0;
        Scanner in = new Scanner(System.in);
        String inputUser = "nothing";
        boolean isPresent = false;
        while(!(inputUser.equals("")))
        {
            inputUser = in.nextLine();
                        
            String[] deadwords = {" about how ", " a lot ", " always ", 
            " and so on ", " and etc. ", " anything "," bad ", 
            " because ", " 'cause ", " could of ", " 'cuz ", 
            " due to ", " etc. ", " everything ", " forever ", 
            " get ", " getting ", " good ", " got ", " gotten ", "had of ",
            " here are ", " here is ", " I believe ", 
            " I think ", " in conclusion ", " in my opinion "," just ", " kind of ",
            " like ", " lottsa ", " major ", " majorly ", " might of ", " never ", "nice ",
            " nothing ", " ok ", " pretty ", " really ", " should of ", " shows ", " shows that ",
            " so ", "something ", "somewhat ", " sorta ", " sort of ", " so yeah ", " stuff ",
            "talks about ", "talks about how ", "talks about why", " there are ", " there is ",
            " thing ", " 'til ", " 'till ", " til ", " till ", " to me ", "try and", " very ",
            " would of ", " you ", " yours ", " off of ", " due to the fact ", ". And ",
            ". Because ", ". But ", ". Finally ", ". First", ". However ",
            ".I am going to be writing about ", ". In conclusion ",
            ". Second", ". Then ",". Though ", ". Well ", " appear ",
            " become ", " feel ", " grow ", " keep ", " look ", " prove ",
            " remain ", " resemble ", " seem ", " smell ", " sound ",
            "stay ", "taste ", " turn ", " be ", " am ", " is "," are ", 
            " was ", " were ", " been ", " being "};
            for(int i = 0; i<deadwords.length;i++)    
            {
                isPresent = check(inputUser,deadwords[i]);
                if(inital==0 && isPresent)
                {
                    inital++;
                    finale = false;
                }
            }
        }
        if(finale)
        {
            System.out.println("You have none of the words in the current list in your writing, but be careful."
                    + "You may have words that aren't included in this list bringing your writing down.");
        }
    }
    
    
    public static boolean check(String input,String word)
    {
        int x = 0;
        for(int i = 0; i<input.length()-word.length()+1; i++)
        {
            if(input.substring(i,i+word.length()).equals(word))
            {
                x++;
            }
        }
        if(x==1)
        {
            System.out.println("There is "+x+" use of"+word+"in your writing.");
            return true;
        }
        if(x>1)
        {
            System.out.println("There are "+x+" uses of"+word+"in your writing.");
        }
        return false;
    }
}
