public abstract class Western extends Food implements Sauceable{

    public Western(String noodle, int salt, int portion) {
        super(noodle, salt, portion);
    }

    @Override
    public void noodleStyle() {
        System.out.println("파스타면입니다.");
    }
}
