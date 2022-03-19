package ashdihomwork252arraylist;

import org.junit.jupiter.api.function.Executable;

import javax.naming.InvalidNameException;
import java.util.Collection;

public interface EmployeeMapInterface {
    Employee addToRepositoryEmployee(String firstname, String lastname) throws NotFoundAnyMatchException, javax.naming.InvalidNameException;
    Employee removeFromRepositoryEmployee(String firstname, String lastname) throws NotFoundAnyMatchException, InvalidNameException;
    Employee findEmployeeInRepository(String firstname, String lastname) throws NotFoundAnyMatchException, InvalidNameException;

    Collection<Employee> getAllEmployees();
}
