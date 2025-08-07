class dog {
    void barks(){
        System.out.println("dog barks");
    }
}
public class cat extends dog {
    void meow(){
        System.out.println(" cat Meows");
    }
    public static void main(String[] args) {
        cat obj = new cat();
        obj.meow();
        obj.barks();
    }
}
