package coffeeShopAppSimulate.adapters;

import coffeeShopAppSimulate.abstracts.CustomerCheckService;
import coffeeShopAppSimulate.entities.Customer;
import coffeeShopAppSimulate.mernisService.MVVKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    MVVKPSPublicSoap mvvkpsPublicSoap = new MVVKPSPublicSoap();

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        try {
            return mvvkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
