package coffeeShopAppSimulate;

import coffeeShopAppSimulate.abstracts.BaseCustomerManager;
import coffeeShopAppSimulate.adapters.MernisServiceAdapter;
import coffeeShopAppSimulate.concrete.NeroCustomerManager;
import coffeeShopAppSimulate.concrete.StarbucksCustomerManager;
import coffeeShopAppSimulate.entities.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        BaseCustomerManager neroCustomerManager = new NeroCustomerManager() ;
        BaseCustomerManager starbucsCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        Customer hasan = new Customer();
        hasan.setId(1);
        hasan.setFirstName("Hasan");
        hasan.setLastName("Soykan");
        hasan.setNationalityId("12312312312");
        hasan.setDateOfBirth(LocalDate.of(1995,3,22));

        Customer engin = new Customer(2,"Engin","Demirog", LocalDate.of(1985,1,6),"12121212121");
        neroCustomerManager.save(hasan);
        neroCustomerManager.save(engin);
        starbucsCustomerManager.save(hasan);
        starbucsCustomerManager.save(engin);


    }
}
