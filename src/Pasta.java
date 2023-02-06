public class Pasta extends Western implements Sauceable{

    public Pasta(String noodle, int salt, int portion) {
        super(noodle, salt, portion);
    }

    @Override
    public void sauce(int spoon) {
        setSalt(getSalt() + spoon);
        if (getSalt() > 3){
            System.out.println("더 이상 넣으면 간이 짤 수 있습니다.");
        }

        System.out.println("토마토 소스를 넣습니다.");
    }

    @Override
    public void addPerson(int portion) {
        setPortion(getPortion() + portion);
        System.out.println("파스타" + portion + "인분 추가이고 총 " + getPortion() + "인분입니다.");
    }

    @Override
    public void showInfo() {
        System.out.println("짜짱면 정보는 : " + toString());
    }
}
