package exmicronaut.user;

import java.util.List;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;

@Controller("/users")
public class UserController {

    private UserRepository repository = UserRepository.testsetup();

    @Get("/{id}")
    public UserResource get(@PathVariable Long id) {
        return repository.findById(id);
    }

    @Get
    public List<UserResource> index() {
        return repository.findAll();
    }

    @Post
    public UserResource post(UserResource resource) {
        return repository.create(resource);
    }
}
