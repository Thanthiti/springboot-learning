package com.thanthiti.tmp.Learn_API_1.repositories;

import com.thanthiti.tmp.Learn_API_1.models.user;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class userRepository {
    private List<user> users = new ArrayList<>(

            List.of(
                    new user("1","Thanthiti", "a@example.com"),
                    new user("2","We", "a@example.com"),
                    new user("3","Beer", "a@example.com")
            )
    );
    public List<user> getUsers() {
        return users;
    }

    public void  addUser(user user){
        users.add(user);
    }

    public void updateUser(String id, user updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.set(i, updatedUser);
                return;
            }
        }
    }

    public void removeUser(user user){
        users.remove(user);
    }
}