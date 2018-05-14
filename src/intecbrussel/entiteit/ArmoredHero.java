package intecbrussel.entiteit;

public class ArmoredHero extends Hero{

    private String alias;
    private int age;


    public ArmoredHero(){}

    public ArmoredHero(String alias){
        this.alias = alias;
    }

    public ArmoredHero(String alias,int age){
        this.alias= alias;
        this.age =age;
    }

    @Override
    public void useSuperPower() {
        System.out.println("Uses suit to shoot enemy");
    }

    @Override
    public String toString() {
        return "ArmoredHero{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
