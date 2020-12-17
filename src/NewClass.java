
public class NewClass {
	public class Superclass { 
         void print() 
        { 
            System.out.println("print in superclass."); 
        } 
    } 
    public class Subclass extends Superclass { 
       void print(int i) 
        { 
            System.out.println("print in subclass."); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
    	NewClass class1=new NewClass();
        Superclass A = class1.new Superclass(); 
        Subclass B = class1.new Subclass(); 
        A.print(); 
        B.print(1); 
    } 
} 

