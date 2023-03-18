



public class Main {
    public static void main(String[] args) {
        Animal c=new Cat();
        Animal D=new Dog();
        Animal B=new Bull();
        PrintName printName =new PrintName();
        printName.printname(c);
        printName.printname(D);
        printName.printname(B);
    }
}