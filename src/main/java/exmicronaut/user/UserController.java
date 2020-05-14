package exmicronaut.user;

import java.util.List;

import com.google.gson.Gson;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/users")
public class UserController {

    private UserRepository repository = UserRepository.testsetup();

    @Get("/")
    public String index() {
        List<UserResource> result = repository.findAll();

        return new Gson().toJson(result);

    }

    @Post("/")
    public String post(UserResource resource) {
        UserResource createdResource = repository.create(resource);

        return new Gson().toJson(createdResource);
    }
}
