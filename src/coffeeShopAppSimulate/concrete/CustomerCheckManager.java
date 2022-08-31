package coffeeShopAppSimulate.concrete;

import coffeeShopAppSimulate.abstracts.CustomerCheckService;
import coffeeShopAppSimulate.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
