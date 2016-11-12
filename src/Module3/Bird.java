package Module3;

/**
 * Created by aleks_000 on 12.11.2016.
 */
public class Bird {


    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Bird(String birdName)
    {
        this.name = birdName;
    }

    public void walk() 
    {
        System.out.println("I am walk");
    }

    public void fly() 
    {
        System.out.println("I am fly");
    }

    public void sing()
    {
        System.out.println("I am singing");
    }

    public void introduce() 
    {
        System.out.println("I am "+name);
    }
}
