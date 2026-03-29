package ru.app.service;

import ru.app.dao.PersonDao;
import ru.app.domain.Person;

public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
