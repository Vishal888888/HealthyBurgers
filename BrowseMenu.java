//import java.util.*;

public class BrowseMenu{

    private String burgerType;
    private int choice;
    public BrowseMenu(String burger)
    {
        burgerType = burger;
    }
    public void setType(String newType)
	{
		this.burgerType = newType;
    }
    public String getType()
    {
        return this.burgerType;
    }
    public void setChoice(int newChoice)
    {
        this.choice = newChoice;
    }
    public int getChoice()
    {
        return this.choice;
    }
    public void printBurger()
    {
        System.out.println ("Your selection: "  + burgerType);
    }

}


