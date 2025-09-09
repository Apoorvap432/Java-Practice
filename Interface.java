interface Home{
    void food();
    void money();
}

class Father implements Home{
    public void food(){
        System.out.println("Mother cooks food for everyone");
    }
    public void money(){
        System.out.println("Mother didn't earn money");
    }
}

class Mother implements Home{
    public void food(){
        System.out.println("Father don't know how to cook food");
    }

    public void money(){
        System.out.println("Father earns money for everyone");
    }
}

public class Interface{
    public static void main(String[] args) {
        Home h1 = new Mother();
        h1.food();
        h1.money();

        Home h2 = new Father();
        h2.food();
        h2.money();
    }
}