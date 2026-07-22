public class Pattern3{
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i; j++){
                System.err.print(" ");
            }
            for(int k = 1 ; k <= 2*i-1; k++){
                System.err.print("*");

            }
            for(int r = 1; r <= 5-i; r++){
                System.err.print(" ");
            }
            System.err.println("");
        }
    }
}