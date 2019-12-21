package vjezbe;
import java.io.*;
import java.util.logging.Level;
public class Vjezbe {

    public static void main(String[] args)throws IOException, ClassNotFoundException
    {

        FileInputStream fis = new FileInputStream("MyCar");
        ObjectInputStream objIn = new ObjectInputStream(fis);
        Car c = (Car)objIn.readObject();
        System.out.println(c);
        
   
    
        
        
    }
   
       
}
