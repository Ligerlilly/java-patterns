public abstract class Duck {
   FlyBehavior flyBehavior;
   QuackBehavior quackBehavior;

   public Duck() {

   }

   public abstract void display();

   public void preformFly() {
       flyBehavior.fly();
   }

   public void preformQuack() {
       quackBehavior.quack();
   }

   public void swim() {
       System.out.println("swimming!");
   }

   public void setQuackBehavior(QuackBehavior qb) {
       quackBehavior = qb;
   }

   public void setFlyBehavior(FlyBehavior fb) {
       flyBehavior = fb;
   }
}
