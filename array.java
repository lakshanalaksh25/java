import  java.util.Scanner;
class array1{
    array1(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
        System.out.println(arr[i]);  
        }
    }
}

public class array extends array1 {
    
    public static void main(String[] args) {
        array obj = new array();
    }
}
