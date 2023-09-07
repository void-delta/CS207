package LAB4;
import java.util.Scanner;

class Student{
    String Name;
    int Age;
    String Address;
    Student(){
        Name = "Unknown";
        Age = 0;
        Address = "Not Available";
    }
    
    void setInfo(String name, int age){
        Name = name;
        Age = age;
        return;
    }

    void setInfo(String name, int age, String Add){
        Name = name;
        Age = age;
        Address = Add;
        return;
    }

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        Student[] stu = new Student[10];
        for(int i = 0; i < 10; i++){
            stu[i] = new Student();
        }
        stu[1].setInfo("Digant Singh", 19, "Mumbai");
        int age;
        String naem;
        String addr;
        for(int i = 2; i < 7; i++){
            naem = scan.nextLine();
            age = scan.nextInt();
            scan.nextLine();
            addr = scan.nextLine();
            stu[i].setInfo(naem, age, addr);
        }
        for(int i = 0; i < 10; i++){
            System.out.println(stu[i].Name + " " + stu[i].Age + " " + stu[i].Address);
        }
        scan.close();
    }
}
