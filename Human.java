public class Human{
    private Sting name;
    int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }




    public void print(){
        System.out.println("Human: " + name + " age: " + age);
    }
}