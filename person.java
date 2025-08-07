public class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Person name:"+name);
        System.out.println("Person age:"+age);
    }
    public static void main(String[] args) {
        person p=new person("laksh",20);
        p.display();
    }
}
