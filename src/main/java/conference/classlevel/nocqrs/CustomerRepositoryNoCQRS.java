package conference.classlevel.nocqrs;

import conference.classlevel.Customer;

public interface CustomerRepositoryNoCQRS {
    Customer find(int id);

    Customer delete(int id);
}
