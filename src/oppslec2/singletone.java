package oppslec2;

public class singletone {
    private static singletone instance;


    private singletone() {

    }

    public singletone getInstance() {
        //check wether 1 obj only is created or not

        if (instance == null) {
            instance = new singletone();

        }
        return instance;


    }
}
