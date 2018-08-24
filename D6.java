import java.util.*;
class Animal
{
 String color,breed;
 void getData(){}
 void speak(){}
}
class Dog extends Animal
{
  void getData()
  {
    color="black"; 
    breed="A";
  }
  void speak()
  {
    System.out.println(color+" "+breed+" "+"bark");
  }
}
class Cat extends Animal
{
  void getData()
  {
    color="white"; 
    breed="B";
  }
  void speak()
  {
    System.out.println(color+" "+breed+" "+"Meow");
  }
}
class D6
{
 public static void main(String args[])
 {
   Animal a;
   Dog d = new Dog();
   Cat c = new Cat();
   a=d;
   a.getData();
   a.speak();
   a=c;
   a.getData();
   a.speak();
 }
}
