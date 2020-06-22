import java.util.*;
import java.util.Scanner;

public class Restaurant {
    private String name;
    private ArrayList<BrowseMenu> burgers = new ArrayList<BrowseMenu>();    

    public Restaurant(String burgerName)
    {
            name = burgerName;
    }
    
    public static void main(String[] args)
    {   
        // Created a Scanner Object
        Restaurant m;
        m= new Restaurant("Selected");

        //Burger options added
        m.addBurger("Chicken Burger");
        m.addBurger("Beef Burger");
        m.addBurger("Veggie Burger");
        m.addBurger("Fish Burger");
        System.out.println(" \n WELCOME TO HEALTHY BURGERS!! \n ");
        m.burgerSelection("Burger");
    }

    //Method for Burger Selection
       public void burgerSelection(String burgerType){
        Scanner myScanner = new Scanner(System.in);
        Restaurant bm;
        bm= new Restaurant("Burger choice");

        System.out.println("Please select from the following options: \n 1. Chicken Burger \n 2. Beef Burger \n 3. Fish Burger \n 4. Veggie Burger \n ");
        System.out.println("Enter your choice");
        //int choice = 0;
        try{  
       int choice = myScanner.nextInt();
        //User choice for Chicken Burger
        
            //choice = myScanner.nextInt();
            
        if(choice == 1)
        {
            
            bm.printBurgers("Chicken Burger");
            //Subtypes of Chicken Burger
            System.out.println("Select a Subtype from the following choices: \n 1. Sweet chilli chicken \n 2. Peri peri chicken");
            int chickenSubs = 0;
       do {
            chickenSubs = myScanner.nextInt();
            switch (chickenSubs) {
            case 1:
            System.out.println("Your selection: \n Sweet chilli chicken");
                break;
            case 2:
            System.out.println("Your selection: \n Peri peri chicken");
                break;
            default:
            System.out.println("Please provide correct input");
           
            }
    }while (chickenSubs < 1 || chickenSubs > 2);        
        }

        //User choice for Beef Burger
        if(choice == 2)
        {
            bm.printBurgers("Beef Burger");
            //Subtypes of Beef Burger
            System.out.println("Select a Subtype from the following choices: \n 1. Grilled Beef  \n 2. Chilli Addict Beef \n 3. Wagyu Beef ");
           
            int beefSubs = 0;
            do {
                 beefSubs = myScanner.nextInt();
                 switch(beefSubs)
                 {
                     case 1:
                     System.out.println("Your selection: \n Grilled Beef Burger");
                     break;
                     case 2:
                     System.out.println("Your selection: \n Chilli Addict Beef Burger");
                     break;
                     case 3:
                     System.out.println("Your selection: \n Wagyu Beef");
                     break;
                     default:
                     System.out.println("Please provide correct input");
                 }
         }while (beefSubs < 1 || beefSubs > 3);
        }

        //User Choice for Fish Burger
        if(choice == 3)
        {
            bm.printBurgers("Fish Burger");
            System.out.println("We only have standarad Fish Burger");
        }

        //User choice for Veggie Burger
        if(choice == 4)
        {
            bm.printBurgers("Veggie Burger");
            //Subtypes of Veggie Burger
            System.out.println("Select a Subtype from the following choices: \n 1. Garden Goodness  \n 2. Vegan Cheese ");
            int vegSubs = 0;
            do{
                vegSubs = myScanner.nextInt();
                switch(vegSubs)
                {   
                case 1:
                System.out.println("Your selection: \n Garden Goodness Burger");
                break;
                case 2:
                System.out.println("Your selection: \n Vegan Cheese Burger");
                break;
                default:
                System.out.println("Please provide correct input");
            }
        }while (vegSubs < 1 || vegSubs > 2);
    }
        if(choice >= 5)
        {
            System.out.println("Wrong input!! Please resume the selection again");
        }
        if(choice < 1)
        {
            System.out.println("Wrong selection again");
        }
    }
    catch(Exception e){
        System.out.println("Unidentified input provided!!");
    }
    }

        //Method to add Burger Type in the menu
        public void addBurger(String burgerType)   
        {
            BrowseMenu bg;
            bg = new BrowseMenu(burgerType);
            burgers.add(bg);
        }
       
        //Method to print the available options
        public void printBurgers(String burgerType)
        {
            int i;
            BrowseMenu b;
            
            for(i=0; i < burgers.size(); i++)
            {
                b=burgers.get(i);
                if(b.getType().equals(burgerType))
                {
                    b.printBurger();
            }
            }

    }
}





 
