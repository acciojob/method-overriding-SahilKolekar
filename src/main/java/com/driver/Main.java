package com.driver;
class A{
  public string meth{
    String a="Invoking method from class A";
    return a;
  }
}
class B extends class A{
  public string meth{
    String a="Method is overridden in Extendend class B";
    return a;
  }
}
public class Main {
  public static void main(String[] args){
    A obj=new B();
    obj.meth();
    B ob=new B();
    ob.meth();
  }
}
