package OOPS.Inheritance.Hierarchical;

public class Parent {

    Parent(){
        super();
        System.out.println("Hii Parent Constructor");
    }
    Parent(int a){
        this();
        System.out.println(a);
    }

    public void add(int a , int b){
        System.out.println(a+b);
    }
}
