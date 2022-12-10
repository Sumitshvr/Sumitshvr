import java.util.Scanner;
public class Student {
    String USN, Name, Branch, Phone;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.println("Enter StudentDetails: ");
        System.out.println("Enter USN:");
        USN = sc.nextLine();
        System.out.println("Enter name:");
        Name = sc.nextLine();
        System.out.println("Enter Branch: ");
        Branch = sc.nextLine();
        System.out.println("Enter Phone: ");
        Phone = sc.nextLine();
    }

    void display() 
    {
        System.out.println("USN:", +USN);
        System.out.println("Name:", +Name);
        System.out.println("Branch:", +Branch);
        System.out.println("Phone:", +Phone);
    }

    public class Student {
        public void main(System[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number os students details to be created:");
            int number = input.nextInt();
            Student s[] = new Student[number];
            for (int i = 0; i < number; i++) {
                s[i] = new Student();
                s[i].read();
                for (int i = 0; i < number; i++) {
                    System.out.println();
                    s[i].display();
                }
            }
            input.close();
        }
    }
}






