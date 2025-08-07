public class BankAccount {
    String name;
    int n;

    BankAccount() {
        display();
    }

    
    BankAccount(String a ,int b){
         this.name = a;
         this.n = b; 
         display(); 
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+n);
    }
   
    public static void main(String[] args){
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount("laksh",1234);
        a.display();
        b.display();

    }

}
