import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {

    static GroupList gp;
    static Scanner scan;
    public static void main(String[] args) {
        gp = new GroupList();
        scan = new Scanner(System.in);

        while (true){
            printMenu();
            int command = scan.nextInt();
            scan.nextLine();


            if(command == 1){
                addPerson();
            }else if(command == 2){
                gp.printGroup();
            }else if(command == 3){
                System.out.println("Введите имя группы");
                String group = scan.nextLine();
                gp.printPersonByGroup(group);
            } else if (command == 4) {
                return;
            }

        }
    }

    public static void addPerson(){
        System.out.println("Введите имя пользователя");
        String name = scan.nextLine();
        System.out.println("Введите фамилию пользователя");
        String secondName = scan.nextLine();
        System.out.println("Введите возраст");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Введите группу");
        String group = scan.nextLine();
        PersonsList personsList = new PersonsList();
        personsList.setPerson(name,secondName,age,group);
        gp.addGroupList(group,personsList);
    }

    public static void printMenu(){
        System.out.println();
        System.out.println("Введите команды");
        System.out.println("1 добавить человека");
        System.out.println("2 показать список групп");
        System.out.println("3 показать членов группы");
        System.out.println("4 выйти из программы");
        System.out.println("5 показать всех членов и всех групп");
    }
}
