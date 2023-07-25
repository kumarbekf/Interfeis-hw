public class Supermen implements CanFlyAble,CanSwimAbl,CanRunAble{

    @Override
    public void fly() {
        System.out.println("Supermen is fly");
    }

    @Override
    public void Run() {
        System.out.println("Supermen is Run");
    }

    @Override
    public void swim() {
        System.out.println("Supermen is swim");
    }
}
