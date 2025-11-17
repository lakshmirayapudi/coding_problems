interface A 
{ 
    void showA(); 
} 
interface B
 { 
    void showB(); 
} 
class C implements A, B
 { 
    public void showA()
 { 
        System.out.println("This is method from Interface A"); 
    } 
      public void showB()
 { 
        System.out.println("This is method from Interface B"); 
    } 
 
    public void showC()
 { 
        System.out.println("This is method from Class C"); 
    } 
} 
class D extends C
 { 
    public void showD() 
{ 
        System.out.println("This is method from Class D"); 
    } 
} 
public class HybridInh
 { 
    public static void main(String[] args) { 
        D obj = new D(); 
        obj.showA();  
        obj.showB();  
        obj.showC();  
        obj.showD();  
    } 
} 
 
 
