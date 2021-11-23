package by.overone.homework27;

import java.io.Serializable;

public class Hero implements Serializable {
    private String name;
    private String gender;

    public Hero(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  name + "(" + gender + ") ";
    }
}
