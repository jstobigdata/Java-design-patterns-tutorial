package javadesignpatterns.creational.prototype;

public class PrototypeMain {

  public static void main(String[] args) throws Exception {

    Apparelstore appstore = new Apparelstore();
    appstore.setStorename("Prototype Store");
    appstore.fetchData();
    System.out.println(appstore);

    Apparelstore duplicatedappstore = appstore.clone();

    duplicatedappstore.setStorename("Clone Store");

    System.out.println(duplicatedappstore);

  }

}
