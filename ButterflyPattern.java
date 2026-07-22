public class ButterflyPattern {
    public static void main(String[] args){
        int n = 5;
        for(int i=1; i<=2*n-1; i++){
            int Stars = i;
            if(Stars>n){
                Stars = 2*n-i;
            }
            for(int j=1; j<=Stars; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-Stars); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=Stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
