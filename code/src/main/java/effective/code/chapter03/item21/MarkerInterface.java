package effective.code.chapter03.item21;

public interface MarkerInterface {

    default void hello() {
        System.out.println("hello interface");
    }
}
