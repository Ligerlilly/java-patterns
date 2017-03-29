public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25min at 350");
    }

    void cut() {
        System.out.println("Cutting the Pizza into slices");
    }

    void box() {
        System.out.println("Place pizza in box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}