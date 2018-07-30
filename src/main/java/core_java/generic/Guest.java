package core_java.generic;

/**
 * Hello world!
 *
 */
public class Guest 
{
    public static void main( String[] args )
    {
        Glass<Juice> glass = new Glass<Juice>();
        Juice juice = new Juice();
        glass.liquid=juice;
        
       Juice j = glass.liquid;
       
       Glass<Water> glass2 = new Glass<Water>();
       Juice juice2 = new Juice();
       glass.liquid=juice2;
       
      Water water = glass2.liquid;
      
      
      Color<Red,Green,Blue> color = new Color<>();
      
      Bartender bartender = new Bartender();
      bartender.mix(juice, water);
      bartender.<Juice,Water>mix(juice, water);
        
    }
}
