package annotation;

@Controller
public class UserController {

    @RequestMapping("cccc")
    public User getUser(int userId){
        return new User(1111,"张三");
    }
    @RequestMapping
    public void m1(){

    }
}
