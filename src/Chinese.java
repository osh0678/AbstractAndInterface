public abstract class Chinese extends Food implements Sauceable{

    public Chinese(String noodle, int salt, int portion) {
        super(noodle, salt, portion);
    }

    @Override
    public void noodleStyle() {
        System.out.println("수타면입니다.");
    }
}
