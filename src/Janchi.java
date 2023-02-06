public class Janchi extends Korean {

    public Janchi(String noodle, int salt, int portion) {
        super(noodle, salt, portion);
    }
    @Override
    public void addPerson(int portion) {
        setPortion(getPortion() + portion);
        System.out.println("잔치국수 " + portion + "인분 추가이고 총 " + getPortion() + "인분입니다.");
    }

    @Override
    public void showInfo() {
        System.out.println("잔치국수 정보는 :" + toString());
    }

}
