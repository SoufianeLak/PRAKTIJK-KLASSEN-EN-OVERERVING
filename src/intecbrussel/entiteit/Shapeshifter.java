package intecbrussel.entiteit;

public class Shapeshifter extends Hero{

    private String alias;
    private int age;
    public Shapeshifter(){}

    public Shapeshifter(String alias){}
    public Shapeshifter(String alias,int age){
        this.alias= alias;
        this.age =age;
    }

    @Override
    public void useSuperPower() {
        System.out.println("disguises as enemy, attack enemy from behind");
    }

    @Override
    public String toString() {
        return "Shapeshifter{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
