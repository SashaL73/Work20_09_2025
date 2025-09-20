import java.util.ArrayList;
import java.util.HashMap;

public class GroupList {
    HashMap<String, ArrayList<PersonsList>> groupList = new HashMap<>();
    ArrayList<String> nameOfGroup = new ArrayList<>();


    public void setGroupList(String nameGroup){
        if (!chekGroup(nameGroup)){
            nameOfGroup.add(nameGroup);
        }
    }

    public boolean chekGroup(String nameForChek){
        return nameOfGroup.contains(nameForChek);
    }

    public void addGroupList(String nameByGroup, PersonsList personsList){
        if(!chekGroup(nameByGroup)){
            nameOfGroup.add(nameByGroup);
            ArrayList<PersonsList> personsListArrayList = new ArrayList<>();
            personsListArrayList.add(personsList);
            groupList.put(nameByGroup, personsListArrayList);

        }else {
            groupList.get(nameByGroup).add(personsList);
        }
    }

    public void printGroup(){
        System.out.println("Список групп:");
        System.out.println();
        for(String name : nameOfGroup){
            System.out.println(name);
        }
    }

    public void printPersonByGroup(String group){
        if(chekGroup(group)){
            chekQuantityGroupPersons(group);
            for(int i = 0; i < groupList.get(group).size(); i++){
                System.out.println(groupList.get(group).get(i).getFirstName() +
                        " " + groupList.get(group).get(i).getSecondName() +
                        " " + groupList.get(group).get(i).getAge());
            }
        }else{
            System.out.println("Такой группы пока нет");
        }
    }

    public void chekQuantityGroupPersons(String group){
        System.out.println("Количество членов в группе " + group + ": " + groupList.get(group).size());
    }


}
