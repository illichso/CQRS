package conference.classlevel.cqrs;

import conference.classlevel.Customer;

interface CustomerRepositoryQuery {
    Customer find(int id);
}

interface CustomerRepositoryCommand {
    void delete(int id);
}
