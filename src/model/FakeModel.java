package model;

import bean.User;
import model.service.UserService;

import java.util.Arrays;

public class FakeModel implements Model {

   private ModelData modelData = new ModelData();
   private UserService userService;


    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(Arrays.asList(new User("A", 1, 1),
                new User("B", 2, 1)));
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long uderId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
