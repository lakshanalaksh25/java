class father{
    void print(){
        System.out.println("Sometime");
    }
}

public class child extends father {
    public static void main(String[] args) {
        child obj = new child();
        obj.print();
    }
    
}
