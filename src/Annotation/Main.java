package Annotation;

public class Main {

  public static void main(String[] args) throws IllegalAccessException, InstantiationException   {
    
    MyObject myObject = new MyObject();
    System.out.println(myObject.getName());
    
    MyContextContainer demo = new MyContextContainer();
    MyObject obj = demo.get(MyObject.class);
    System.out.println(obj.getName());
    System.out.println(obj.getDefaultValue());
    System.out.println(obj.getInvalidType());
  }
}
