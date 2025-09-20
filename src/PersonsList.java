
public class PersonsList {

    String firstName;
    String secondName;
    int age;
    String group;

//    public PersonsList(String addFirstName,String addSecondName, int addAge, String addGroup){
//        this.firstName = addFirstName;
//        this.secondName = addSecondName;
//        this.age = addAge;
//        this.group = addGroup;
//    }

    public void setPerson(String addFirstName,String addSecondName, int addAge, String addGroup){
        this.firstName = addFirstName;
        this.secondName = addSecondName;
        this.age = addAge;
        this.group = addGroup;
    }

    public String getFirstName(){
        return firstName;

    }

    public String getSecondName(){
        return secondName;
    }

    public int getAge(){
        return age;
    }




}
