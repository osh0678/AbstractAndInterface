public class Main {
    public static void main(String[] args) {
        Janchi janchi = new Janchi("잔치국수", 1, 1);
        janchi.showInfo();
        janchi.addPerson(10);
        janchi.showInfo();
        janchi.noodleStyle();
        janchi.soup();

        Blackbean blackbean = new Blackbean("짜장면", 1, 3);
        blackbean.sauce(1);
        blackbean.sauce(1);
        blackbean.sauce(1);
        blackbean.addPerson(4);

    }
}
