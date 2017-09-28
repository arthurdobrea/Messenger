package org.arthur.model;

import org.arthur.enums.Gender;
import org.arthur.modelBehaviour.PersonalBehaviour;

/**
 * Created by adobrya on 9/26/2017.
 */
public class Mentor extends Human implements PersonalBehaviour {


    public Mentor() {
        super();
    }

    public Mentor(String name, Integer age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi, i'm your mentor");
    }

    @Override
    public void getOlder() {
        System.out.println("Mentors never get old");
    }
}
