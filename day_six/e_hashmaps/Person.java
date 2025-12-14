package e_hashmaps;

public class Person {
    private String name;
    private String surname;
    private int money;

    Person(String name, String surname, int money){
        this.name = name;
        this.surname = surname;
        this.money = money;
    }

    String getName(){
        return name;
    }

    String getSurname(){
        return surname;
    }

    int getMoney(){
        return money;
    }

    String getPersonInfo(){
        return(name + " " + surname + " $" + money);
    }
}
