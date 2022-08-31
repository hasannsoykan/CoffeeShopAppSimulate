package coffeeShopAppSimulate.abstracts;

import coffeeShopAppSimulate.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

    @Override
    public void save(Customer customer) {
        System.out.println("Saved to do: " + customer.getFirstName());
    }
}
