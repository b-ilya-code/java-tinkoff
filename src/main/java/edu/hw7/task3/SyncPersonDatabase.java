package edu.hw7.task3;

import java.util.List;

public class SyncPersonDatabase extends SimplePersonDatabase {

    @Override
    public synchronized void add(Person person) throws NonuniqueIDException {
        super.add(person);
    }

    @Override
    public synchronized void delete(int id) {
        super.delete(id);
    }

    @Override
    public synchronized List<Person> findByName(String name) {
        return super.findByName(name);
    }

    @Override
    public synchronized List<Person> findByAddress(String address) {
        return super.findByAddress(address);
    }

    @Override
    public synchronized List<Person> findByPhone(String phone) {
        return super.findByPhone(phone);
    }
}
