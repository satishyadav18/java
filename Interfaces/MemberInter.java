interface Member{
    public void callback();
}

class Store{
    Member members[] = new Member[10];
    int count = 0;
    Store(){
        // System.out.println("Store() constructor called");
    }

    void register(Member m){
        members[count++] = m;
    }
    void inviteSale(){
        for(int i = 0; i < count; i++){
            members[i].callback();
        }
    }
}

class Customer implements Member{
    String name;

    Customer(String n){
        name = n;
    }

    @Override
    public void callback() {
        System.out.println("Inviting " + name + " to the sale.");
    }
}

public class MemberInter {
    public static void main(String[] args) {
        Store store = new Store();
        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");
        store.register(cust1);
        store.register(cust2);
        
        store.inviteSale();
    }
}
