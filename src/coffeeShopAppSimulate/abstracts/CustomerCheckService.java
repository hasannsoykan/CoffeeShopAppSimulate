package coffeeShopAppSimulate.abstracts;

import coffeeShopAppSimulate.entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
