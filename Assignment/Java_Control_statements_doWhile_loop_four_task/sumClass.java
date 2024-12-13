public class sumClass{
    public static void main(String[] args) {
        double sum=0.0,i=1;
        do{
            sum+=i;
            i-=0.1;
        }while(i>=0.1);
        System.out.println("Sum = "+sum);
    }
    
}