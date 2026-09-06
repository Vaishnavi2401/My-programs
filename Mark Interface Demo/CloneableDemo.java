class A implements Cloneable{
 int i;

 public A (int i){
    this.i = i;
 }

 @Override
 protected Object clone() throws CloneNotSupportedException{
    return super.clone();
 }
}
public class CloneableDemo{

    public static void main(String[] args) throws CloneNotSupportedException{
        A a = new A(20);
        
        A b = (A)a.clone();

        System.out.println(b.i);
    }
}