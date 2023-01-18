import java.util.Scanner;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        //content

        System.out.println("enter content : ");
        Scanner scanner1 = new Scanner(System.in);
        String content = scanner1.nextLine();

        //student number&key

        System.out.println("enter student number : ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        number = number.substring(number.length()-5,number.length());
        System.out.println("your key : "+number);


        //choice

        System.out.println("choice the action");
        System.out.println("1.Encoder");
        System.out.println("2.Decoder");
        Scanner scanner2 = new Scanner(System.in);

        int action = scanner2.nextInt();


         ///hashmap

        HashMap<Character, Character> codValues = new HashMap<Character, Character>();

        codValues.put(' ', '1');
        codValues.put('!', 'g');
        codValues.put('"', 'q');
        codValues.put('#', 'T');
        codValues.put('$', 'h');
        codValues.put('%', 'b');
        codValues.put('&', 'I');
        codValues.put('\u02C8', 'F');
        codValues.put('(', 'M');
        codValues.put(')', 'y');
        codValues.put('*', 'w');
        codValues.put('+', ']');
        codValues.put(',', 'O');
        codValues.put('-', ')');
        codValues.put('.', '%');
        codValues.put('/', '$');
        codValues.put('0', '-');
        codValues.put('1', 'c');
        codValues.put('2', 'P');
        codValues.put('3', 'n');
        codValues.put('4', 'H');
        codValues.put('5', '(');
        codValues.put('6', '!');
        codValues.put('7', 'j');
        codValues.put('8', '\u0338');
        codValues.put('9', 'V');
        codValues.put(':', 'z');
        codValues.put(';', 't');
        codValues.put('<', 'k');
        codValues.put('=', ' ');
        codValues.put('>', '*');
        codValues.put('?', 'S');
        codValues.put('@', '5');
        codValues.put('A', '0');
        codValues.put('B', 'Y');
        codValues.put('C', 'r');
        codValues.put('D', '@');
        codValues.put('E', '.');
        codValues.put('F', '\u02C8');
        codValues.put('G', 'x');
        codValues.put('H', 's');
        codValues.put('I', '6');
        codValues.put('J', 'a');
        codValues.put('K', '7');
        codValues.put('L', '"');
        codValues.put('M', 'i');
        codValues.put('N', 'v');
        codValues.put('O', '4');
        codValues.put('P', '^');
        codValues.put('R', ',');
        codValues.put('Q', 'm');
        codValues.put('S', '>');
        codValues.put('T', 'N');
        codValues.put('U', '[');
        codValues.put('V', 'Z');
        codValues.put('W', 'L');
        codValues.put('X', '2');
        codValues.put('Y', '?');
        codValues.put('Z', 'C');
        codValues.put('[', ';');
        codValues.put('\u0338', 'Q');
        codValues.put(']', '3');
        codValues.put('^', 'E');
        codValues.put('_', 'f');
        codValues.put('a', '+');
        codValues.put('b', 'd');
        codValues.put('c', '#');
        codValues.put('d', 'e');
        codValues.put('e', 'D');
        codValues.put('f', '/');
        codValues.put('g', 'R');
        codValues.put('h', '&');
        codValues.put('i', '9');
        codValues.put('j', 'A');
        codValues.put('k', 'P');
        codValues.put('l', 'X');
        codValues.put('m', 'G');
        codValues.put('n', 'U');
        codValues.put('o', 'w');
        codValues.put('p', 'u');
        codValues.put('q', ':');
        codValues.put('r', '8');
        codValues.put('s', 'K');
        codValues.put('t', '_');
        codValues.put('u', 'o');
        codValues.put('v', '=');
        codValues.put('w', 'l');
        codValues.put('x', 'J');
        codValues.put('y', 'B');
        codValues.put('z', '<');




   //encoder
   if(action==1){
       String encodedContent = "";
       for(int i=0;i<content.length();i++){
           Character ch1=content.charAt(i);
           if(codValues.containsKey(ch1)) {

               Character ench11 = codValues.get(ch1);
               System.out.println(ch1 + " is encoded to " + ench11);
               encodedContent +=ench11;

           }
       }
       System.out.println("encoded content : " +encodedContent);
   }
   //decoder
   if(action==2){


   }



    }
    }


