package coffeeShopAppSimulate.concrete;

import coffeeShopAppSimulate.abstracts.BaseCustomerManager;
import coffeeShopAppSimulate.abstracts.CustomerCheckService;
import coffeeShopAppSimulate.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Not a valid person");
        }
    }
}