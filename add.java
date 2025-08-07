 public class add{
    int a,b,c,d;
    
    add(int a,int b){
        this.a=a;
        this.b=b;
        c=a+b;
        d=a-b;
    }
    void display(){ 
        System.out.println("c:"+c);
        System.out.println("d"+d);
    }
    public static void main(String[] args) {
        add p=new add(10,20);
        p.display();
    }
}
    
