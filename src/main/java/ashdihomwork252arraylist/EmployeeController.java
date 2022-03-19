package ashdihomwork252arraylist;

import org.junit.jupiter.api.function.Executable;
import org.springframework.web.bind.annotation.*;

import javax.naming.InvalidNameException;

@RestController
public class EmployeeController {
    private final EmployeeServiceMap employeeService;


    public EmployeeController(EmployeeServiceMap employeeService) {
        this.employeeService = employeeService;
    }

@GetMapping(path="/post/add")
    public Employee addEmployee(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastname) throws InvalidNameException, NotFoundAnyMatchException {
        return employeeService.addToRepositoryEmployee(firstname, lastname);
    }
@GetMapping(path="/get/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastname) throws InvalidNameException, NotFoundAnyMatchException {
        return employeeService.removeFromRepositoryEmployee(firstname, lastname);
    }
@GetMapping(path="/get/search")
    public Employee findEmployee(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastname) throws InvalidNameException, NotFoundAnyMatchException {
        return employeeService.findEmployeeInRepository(firstname, lastname);
    }
   /* @GetMapping(path = "/get/rep")
    @RequestMapping(value = "/get/rep" , method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> printService() {
        return employeeService.printRepository();
    }*/
}
