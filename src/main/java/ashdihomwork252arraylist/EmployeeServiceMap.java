package ashdihomwork252arraylist;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.naming.InvalidNameException;
import java.util.*;

@Service
public class EmployeeServiceMap implements EmployeeMapInterface{

    private final Map<String, Employee> employeesMap = new HashMap<>();

    @Override
    public Employee addToRepositoryEmployee(String firstname, String lastname) throws NotFoundAnyMatchException, InvalidNameException {

        validatorEmployee(firstname, lastname);
        Employee addEmpoyee = new Employee(refactoringString(firstname), refactoringString(lastname));
        String key = refactoringString(firstname) + refactoringString(lastname);
        if (!employeesMap.containsKey(firstname + lastname)) {
            throw new NotFoundAnyMatchException("Error - not found");
        }
        employeesMap.put(key, addEmpoyee);
        return  addEmpoyee;
    }

    private String refactoringString(String anyString) {
        return StringUtils.capitalize(anyString.toLowerCase());
    }

    private void validatorEmployee(String... names) throws InvalidNameException {
        for (String name : names) {
            if (!StringUtils.isAlpha(name)){
                throw new InvalidNameException("oops something goes wrong with name!!!");
            }
        }
    }

    @Override
    public Employee removeFromRepositoryEmployee(String firstname, String lastname) throws NotFoundAnyMatchException, InvalidNameException {
        validatorEmployee(firstname, lastname);
        String key = refactoringString(firstname) + refactoringString(lastname);
        if (!employeesMap.containsKey(key)) {
            throw new NotFoundAnyMatchException("Error - not found");
        }
        return employeesMap.remove(key);
    }

    @Override
    public Employee findEmployeeInRepository(String firstname, String lastname) throws NotFoundAnyMatchException, InvalidNameException {
        validatorEmployee(firstname, lastname);
        String key = refactoringString(firstname) + refactoringString(lastname);
            if (!employeesMap.containsKey(key)) {
                throw new NotFoundAnyMatchException("Error - not found");
            }
            return employeesMap.get(key);
    }

    @Override
    public Collection<Employee> getAllEmployees() {
        return Collections.unmodifiableCollection(employeesMap.values());
    }


}
