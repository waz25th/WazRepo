public class jt4{
    public static void main(String[]args){


        double myPi = 4.0;
        double j = 3.0;

        while( j < 300000){
            myPi = myPi - (4/j) + (4/(j+2));
            j += 4;

            System.out.println(myPi);
        
        
        }

        System.out.println("the real value of pi is:" + Math.PI);

    }
}
