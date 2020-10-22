public class helloworld {
    //public allows other classes to use this funtion  
    //static means that only a class can call for this funtion to execute
    //void states that this function does ot return any values after it is done
    //main is required in every java program. This function is executed first
    //every main function must accept an array of string objects

// class variables must start with static if you want to access them with any other methods in the class
static String randomString = "this is a random string";
static String anotherString = "and this is another string";
static String andAnotherString = randomString + ' ' + anotherString;

//constant variables are defined with the word final
static final double PINUM = 3.1415929;

public static void main(String [] args){
    //System.out is an object that outputs information
    //println is a function that prints to the screen what ever you provide between braces
    //"hello world" is a string of characters, strings must be surrounded with quotes
    //every statement needs a semi colon;

    System.out.println(andAnotherString);
    
    //variables are case sensitive, Age is not the same as age
    //variables are to begin with letters, underscores or $ and can contain numbers

    // declaration statement example : int integerone = 22;
    // expression statement example : int integertwo = integerone + 1;

    //java primitive types
    //byte bigByte = 127; // Minimum value -128 Maximum value 127
//short bigShort = 32767; // Minimum value -32768 Maximum value 32767
//int bigInt = 2147483647; // Minimum value -2147483648 Maximum value 2147483647
//long bigLong = 9223372036854775807L; // Minimum value -9223372036854775808L

//how to convert any other type to string

//String byteString= Byte.toString(bigByte);
//String intString = Integer.toString(bigInt);
//This will be the same for double, float, char, boolean and long


}
}
