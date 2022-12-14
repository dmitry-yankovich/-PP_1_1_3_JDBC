package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserDao extends AutoCloseable {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void saveUserList(List<User> userList);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();


}
