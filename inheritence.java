
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          ChoiceQuestion q = new ChoiceQuestion();
          q.setQuestion("Who is James Gosling?");

          q.setChoices("a", true);
          q.setChoices("b", false);
          q.setChoices("c", false);
          q.setChoices("d", false);

          boolean a = q.check("1");
          System.out.println(a);
          q.display();

     }
}

class Question {

     private String text;
     private String answer;

     Question() {
          text = "";
          answer = "";
     }

     public void setQuestion(String q) {
          text = q;
     }

     public void setAnswer(String a) {
          answer = a;
          System.out.println("Answer is set to" + a);
     }

     public boolean check(String a) {
          System.out.println("Answer given" + a);
          System.out.println("Answer set is" + answer);
          // System.out.print("1" == "1");
          // if (a == answer) {
          // return true;
          // } else {
          // return false;
          // }
          return a == answer;

     }

     public void display() {
          System.out.print(text);

     }

}

class ChoiceQuestion extends Question {
     ArrayList<String> choices = new ArrayList<>();

     public void setChoices(String s, boolean correct) {
          choices.add(s);
          if (correct) {
               // text = 'a'; Error to access private instance variable of superclass in a
               // subclass
               String Csize = "" + choices.size();
               setAnswer(Csize);
          }
     }

}
