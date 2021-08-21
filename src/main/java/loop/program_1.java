package loop;

public class program_1 {
    public static void main(String[] args) {

        //even numbers
        for(int i=0;i<=100;i+=2){
            System.out.println(i);

            if (i==50){
                break;
            }
        }
        //odd numbers
        for(int i=1;i<=100;i+=2){
            System.out.println(i);

            if (i==50){
                continue;
            }
        }
    }
}
