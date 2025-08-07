public class stud {
    int[] marks = {90, 50, 60, 40, 87}; 
    float averageMarks;

    void average() {
    int sum = 0;
    for (int i = 0; i < marks.length; i++) {
        sum += marks[i];
    }    
    float avg = (float) sum / marks.length;
    System.out.println("Average: " + avg);
}


    void grade() {
        if (averageMarks < 50 ) {
            System.out.println("C Grade");
        } else if (averageMarks >= 90) {
            System.out.println("A Grade");
        } else {
            System.out.println("B Grade");
        }
    }

    public static void main(String[] args) {
        stud s = new stud();
        s.average();
        s.grade();
    }  
}
