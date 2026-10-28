import java.util.ArrayList;
import java.util.Scanner;
public class ContactManager{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> phones = new ArrayList<>();
        int choice;
        do{
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1.Add Contact");
            System.out.println("2.View Contacts");
            System.out.println("3.Search Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter contact name:");
                    String name=sc.nextLine();
                    if (name.trim().isEmpty()){
                        System.out.println("Name cannot be empty!");
                        break;
                    }
                    System.out.print("Enter phone number:");
                    String phone=sc.nextLine();
                    names.add(name);
                    phones.add(phone);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    if(names.isEmpty()){
                        System.out.println("No contacts available.");
                    } 
                    else{
                        for(int i=0;i<names.size();i++) {
                            System.out.println("Name:"+names.get(i)+",Phone:"+phones.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search:");
                    String search=sc.nextLine();
                    boolean found=false;
                    for(int i = 0;i<names.size();i++){
                        if(names.get(i).equalsIgnoreCase(search)){
                            System.out.println("Name:"+names.get(i));
                            System.out.println("Phone:"+phones.get(i));
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter name to delete:");
                    String delete=sc.nextLine();
                    boolean removed=false;
                    for(int i=0;i<names.size();i++){
                        if(names.get(i).equalsIgnoreCase(delete)){
                            names.remove(i);
                            phones.remove(i);
                            removed=true;
                            System.out.println("Contact deleted!");
                            break;
                        }
                    }
                    if(!removed){
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Contact Manager...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice!=5);
        sc.close();
    }
}
