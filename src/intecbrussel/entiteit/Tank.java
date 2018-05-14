package intecbrussel.entiteit;

public class Tank extends Hero{

    private String alias;
    private int age;
    public Tank(){}

    public Tank(String alias){}
    public Tank(String alias,int age){
        this.alias= alias;
        this.age =age;
    }

    @Override
    public void useSuperPower() {
        System.out.println("haha no damage, stupid enemy");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
