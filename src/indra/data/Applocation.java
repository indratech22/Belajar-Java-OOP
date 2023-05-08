package indra.data;

public class Applocation {
    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
