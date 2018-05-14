package intecbrussel.entiteit;

public class Energizer extends Hero{

    private String alias;
    private int age;
    public Energizer(){}

    public Energizer(String alias){}

    public Energizer(String alias,int age){
        this.alias= alias;
        this.age =age;
    }


    @Override
    public void useSuperPower() {
        System.out.println("charging... , attacks enemy with charged superpowers");
    }

    @Override
    public String toString() {
        return "Energizer{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
