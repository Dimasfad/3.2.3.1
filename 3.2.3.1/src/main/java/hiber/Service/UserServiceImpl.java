package hiber.Service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> users() {
        return userDao.users();
    }


    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void remove(long id) {
        userDao.remove(id);
    }

    @Override
    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }
}
