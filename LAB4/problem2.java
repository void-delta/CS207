package LAB4;
import java.util.Scanner;

class LearnLang{
    String[] a = new String[10];
    String[] b = new String[10];
    int top = -1;
    int topE = -1;

    void push(String word){
        if(top != 9){
            top = top + 1;
            a[top] = word;
        }
        else{
            System.out.println("Stack Full");
        }
        return;
    }
    String pop(){
        if(top != -1){
            String temp = a[top];
            top = top - 1;
            return temp;
        }
        return "Error";
    }
    void push2(String word){
        if(topE != 9){
            topE = topE + 1;
            b[topE] = word;
        }
        else{
            System.out.println("Stack Full");
        }
        return;
    }
    String pop2(){
        if(topE != -1){
            String temp = b[topE];
            topE = topE - 1;
            return temp;
        }
        return "Error";
    }
    public static void main(String[] arggs){
        LearnLang German = new LearnLang();
        German.push("Montag");
        German.push("Dienstag");
        German.push("Mittwoch");
        German.push("Donnerstag");
        German.push("Freitag");
        German.push("Samstag");
        German.push("Sonntag");
        German.push("Gesundheit");
        German.push("Entschuldigung");
        German.push("Guten Tag");
        German.push2("Monday");
        German.push2("Tuesday");
        German.push2("Wednesday");
        German.push2("Thursday");
        German.push2("Friday");
        German.push2("Saturday");
        German.push2("Sunday");
        German.push2("Bless You");
        German.push2("Sorry");
        German.push2("Good Day");
        String check, wordG, wordE;
        Scanner scan = new Scanner(System.in);
        while(German.top != -1){
            wordE = German.pop2();
            System.out.println("Word: " + wordE);
            check = scan.nextLine();
            wordG = German.pop();
            if(wordG.compareTo(check) == 0){
                System.out.println("Correct");
            }
            else{
                German.push(wordG);
                German.push2(wordE);
                System.out.println("Wrong. Try Again");
            }
        }
        System.out.println("Great Work");
        scan.close();
    }
}

