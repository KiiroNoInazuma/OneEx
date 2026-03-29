package ru.app.dao;

import ru.app.domain.Person;

public interface PersonDao {

    Person findByName(String name);

}
