package com.ssh.service;

import java.util.List;

import com.ssh.entity.Person;

/**
 * Created by Evin
 * On 2/2/2017.2:39 PM
 */
public interface PersonService {
    Long savePerson();

    List<Person> findAll();

    void updatePerson(Long id);
}