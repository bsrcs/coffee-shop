package abstracts;

import entities.Customer;

// hem starbucks hem de nero i�in kullanmak �zere
public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
