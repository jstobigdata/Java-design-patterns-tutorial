package builderpattern;

public class BuilderImplementaion {

  public static void main(String[] args) {

    CustomerForm customerData = new CustomerForm.CustomerFormBuilder("Pra") // required parameters
        .addAge("25") // optional
        .addGender("M") // optional
        .addcustomerType("Prime").build(); // to get back student option
    System.out.println(customerData);
  }
}