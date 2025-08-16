package repositories;

import com.thanthiti.tmp.models.user;

import java.util.ArrayList;
import java.util.List;

public class userRepository {
    private List<user> users = new ArrayList<>(

         List.of(
                new user("Thanthiti", "a@example.com"),
                new user("We", "a@example.com"),
                new user("Beer", "a@example.com")
        )
    );
    public List<user> getUsers() {
        return users;
    }

    public void  addUser(user user){
        users.add(user);
    }

    public void removeUser(user user){
        users.remove(user);
    }
}
