interface IComputer {
  void code();
}

class Laptop implements IComputer {

  @Override
  public void code() {
    System.out.println("code, compile, run");
  }

}

class Desktop implements IComputer {

  @Override
  public void code() {
    System.out.println("code, compile, run: faster");
  }

}

class Developer {
   
  // Developer to code method
  public void devApp(IComputer work) { // parameter type is an interface
    work.code(); // more flexible, whoever class that implements IComputer should implement code() method
  }

}

public class Demo {
  public static void main(String[] args) {

    /**
     * we can create an object to a reference of IComputer
     */
    IComputer lap = new Laptop();
    IComputer desk = new Desktop();

    Developer joe = new Developer();
    joe.devApp(lap);

  }
}