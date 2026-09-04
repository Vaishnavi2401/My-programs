
public class DemoFinalize {

    public static void main(String[] args) {

        DemoFinalize demo = new DemoFinalize();

        System.out.println(demo.hashCode());

        demo = null;

        System.gc();

        System.out.println("end");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}
