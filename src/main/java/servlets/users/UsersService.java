package servlets.users;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class UsersService {
    private static UsersService instance;

    public static  UsersService instanceOf (){
        if (instance == null){
            instance = new UsersService();

        }
        return instance;
    }

    private List<User>users;

    private UsersService() {
        this.users = new ArrayList<>();
        users.add(new User("Jan","Warszak","22","Men"));
        users.add(new User("Monika","Sander","30","Women"));
        users.add(new User("Goerge","Lucas","44","Men"));
    }

    public List<User> findAll () {
        return new ArrayList<>(users);

    }

    public void save (User user) {
        users.add(user);
    }

    public User findByID (int id) {
        return users.get(id);
    }

}
