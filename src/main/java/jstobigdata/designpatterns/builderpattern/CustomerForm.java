package builderpattern;

public class CustomerForm {

  private String name; // required
  private String age; // required
  private String gender; // optional
  private String customerType; // optional

  private CustomerForm(CustomerFormBuilder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.gender = builder.gender;
    this.customerType = builder.customerType;
  }

  @Override
  public String toString() {
    return " Name=" + name + "\n age=" + age + "\n gender=" + gender + "\n CustomerType=" + customerType;
  }

  public static class CustomerFormBuilder {

    private String name;
    private String age;
    private String gender;
    private String customerType;

    public CustomerFormBuilder(String Name) {
      this.name = Name;

    }

    public CustomerFormBuilder addAge(String age) {
      this.age = age;
      return this;
    }

    public CustomerFormBuilder addGender(String gender) {
      this.gender = gender;
      return this;
    }

    public CustomerFormBuilder addcustomerType(String customertype) {
      this.customerType = customertype;
      return this;
    }

    public CustomerForm build() {
      return new CustomerForm(this);
    }

  }

}