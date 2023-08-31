public class square {
public static void main(String[] args) {
    
    for(int a=1;a<7;a++){
        for(int b=1;b<7;b++){
            if(a==1||b==1||a==7-1||b==7-1){
              System.out.print ("*");
            }
            else{
                System.out.print( " ");

            }

        }
        System.out.println( );
    }
}
}
