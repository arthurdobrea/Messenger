package org.arthur.model;

import org.arthur.modelBehaviour.CheckStatus;
import org.arthur.enums.Gender;
import org.arthur.enums.Status;
import org.arthur.enums.Stream;
import org.arthur.enums.WorkingPlace;
import org.arthur.modelBehaviour.PersonalBehaviour;

import java.util.Random;

/**
 * Created by adobrya on 9/25/2017.
 */
public class Intern extends Human implements PersonalBehaviour,CheckStatus {
    private Stream stream;
    private WorkingPlace workingPlace;
    private Status status;

    public Intern() {
    }

    public Intern(String name, Integer age, Gender gender) {
        super(name, age, gender);
    }

    public Intern(String name, Integer age, Gender gender, Stream stream, WorkingPlace workingPlace, Status status) {
        super(name, age, gender);
        this.stream = stream;
        this.workingPlace = workingPlace;
        this.status = status;
    }

    @Override
    public void sayHello() {
        System.out.println("HI");
    }

    @Override
    public void getOlder() {
        System.out.println("i'm getting older " + getAge());
        setAge(getAge() + 1);
    }

    public Stream getStream() {
        return stream;
    }


    public void setStream(Stream stream) {
        this.stream = stream;
    }

    public WorkingPlace getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(WorkingPlace workingPlace) {
        this.workingPlace = workingPlace;
    }

    public Status getStatus() {
        Random random = new Random();
        int i = random.nextInt(4);
        return Status.values()[i];
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Intern{" + " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                " stream=" + stream +
                ", workingPlace=" + workingPlace +
                '}';
    }

}
