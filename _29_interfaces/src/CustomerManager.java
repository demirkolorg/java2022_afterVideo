public class CustomerManager {
    private CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public  void add(){
        //iş kodları
        this.customerDal.add();
    }
}
