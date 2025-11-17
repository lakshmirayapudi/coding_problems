class Base1 { 
public void basemsg() { 
System.out.println("This is Base1 class message"); 
} 
} 
interface Base2Interface { 
void basemsgFromInterface(); 
} 
class Derived extends Base1 implements Base2Interface { 
public void basemsgFromInterface() { 
System.out.println("This is Base2 Interface message"); 
} 
public void derivemsg() { 
System.out.println("This is derived class"); 
} 
} 
class Multipleinheritance { 
public static void main(String args[]) { 
System.out.println("This is Multiple inheritance demonstration"); 
Derived obj = new Derived(); 
obj.basemsg(); 
obj.basemsgFromInterface(); 
obj.derivemsg(); 
} 
}
