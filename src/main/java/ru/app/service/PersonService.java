package ru.app.service;

import ru.app.domain.Person;

public interface PersonService {
    Person getByName(String name);
}
