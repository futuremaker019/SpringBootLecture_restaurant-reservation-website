package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.User;
import kr.co.fastcampus.eatgo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        List<User> users = userRepository.findAll();

        return users;
    }

    public User addUser(String email, String name) {
        User user = User.builder().email(email).name(name).build();

        return userRepository.save(user);

//        return user;
    }

    public User updateUser(Long id, String email, String name, Long level) {
        //TODO: restaurantService의 예의 처리 참고.
        User user = userRepository.findById(1004L).orElse(null);

        user.setEmail(email);
        user.setName(name);
        user.setLevel(level);

        return user;
    }
}
