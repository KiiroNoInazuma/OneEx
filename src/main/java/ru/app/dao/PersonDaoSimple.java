package ru.app.dao;

import ru.app.domain.Person;

public class PersonDaoSimple implements PersonDao {

    private int defaultAge;

    public void setDefaultAge(int defaultAge) {
        this.defaultAge = defaultAge;
    }

    @Override
    public Person findByName(String name) {
        return new Person(name, defaultAge);
    }
}
