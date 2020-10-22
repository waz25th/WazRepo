public class javaLessonThree{
    public static void main(String[]args){
        
        char theGrade = 'b';
        switch (theGrade){
            case 'A':
            case 'a': // having two cases allows for lower case and upper case values to return a string
            System.out.println("Good Job");
            break; // the break stops the program from checking for more values

            case 'B':
            case 'b':
            System.out.println("well done");
            break;

            case 'C':
            case 'c':
            System.out.println("OK");
            break;

            case 'D':
            case 'd':
            System.out.println("Satisfactory");
            break;

            default:
            System.out.println("You Failed");
            break;
        }

    }
}

