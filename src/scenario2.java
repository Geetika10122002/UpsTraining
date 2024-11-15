import java.util.*;
public class scenario2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Candidate attendance=new Candidate();
        while(true){
            System.out.println("Choose an option:");
            System.out.println("1.Check-in:");
            System.out.println("2.Check-out:");
            System.out.println("3.Display:");
            System.out.println("4.Exiting:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter id:");
                    int n=sc.nextInt();
                    attendance.checkIn(n);
                    break;
                case 2:
                    System.out.println("Enter id:");
                    int n1=sc.nextInt();
                    boolean f=attendance.isCheckedin(n1);
                    if(f==true){
                        attendance.removeCheckedin(n1);
                    }
                    break;
                case 3:
                    attendance.displayAllCheckedin();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
class Candidate{
    private Set<Integer>attendees=new HashSet<>();
    public void checkIn(int id){
        attendees.add(id);
    }
    public boolean isCheckedin(int id){
        return attendees.contains(id);
    }
    public void removeCheckedin(int id)
    {
        attendees.remove(id);
    }
    public void displayAllCheckedin(){
        for(int i:attendees){
            System.out.println(i);
        }
    }


}
