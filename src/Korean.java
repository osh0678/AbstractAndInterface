public abstract class Korean extends Food implements Soupable{

    public Korean(String noodle, int salt, int portion) {
        super(noodle, salt, portion);
    }

    @Override
    public void noodleStyle() {
        System.out.println("소면입니다.");
    }

    @Override
    public void soup() {
        System.out.println("국물요리입니다.");
    }
}
