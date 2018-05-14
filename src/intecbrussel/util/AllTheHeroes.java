package intecbrussel.util;

import intecbrussel.entiteit.Hero;

/**
 * Created by Mrrobot on 31/10/2017 heroes.
 *
 * Deze klasse krijgen jullie cadeau
 */
public class AllTheHeroes {

    private Hero[] listOfHeroes;

    public AllTheHeroes() {
        listOfHeroes = new Hero[4];
    }

    public void addSuperHero(Hero hero) {
        if (!isHeroTypePresent(hero)) {
            for (int i = 0; i < listOfHeroes.length; i++) {
                if (listOfHeroes[i] == null) {
                    listOfHeroes[i] = hero;
                    return;
                } else if (listOfHeroes[i] != null && i == listOfHeroes.length){
                    System.out.println("Sorry no more place in this squad.");
                }
            }
        }
    }

    public void removeSuperHero(Hero hero) {
        if (isHeroTypePresent(hero)){
            for (int i = 0; i < listOfHeroes.length; i++){
                if (hero.equals(listOfHeroes[i])){
                    listOfHeroes[i] = null;
                    return;
                }
            }
        }
    }

    private boolean isHeroTypePresent (Hero hero) {
        for (Hero h: listOfHeroes) {
            if (h != null) {
                if (h.getClass() == hero.getClass()){
                    return true;
                }
            }
        }
        return false;
    }


    public Hero[] getHeroes () {
        return listOfHeroes;
    }
}
