public class Test1 {
    public static void main(String[] args) {
        new Test1().longTest( 2L );
    }
    private Test1 () {

    }

    void longTest (Long l ) {
        System.out.println("Long");
        new Test1();
    }
}
