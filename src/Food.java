public abstract class Food implements Eatable{
    private String noodle;
    private int salt;
    private int portion;

    public Food(String noodle, int salt, int portion){
        this.noodle = noodle;
        this.salt = salt;
        this.portion = portion;
    }

    public String getNoodle(){
        return noodle;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public abstract void noodleStyle();
    public abstract void showInfo();


    @Override
    public String toString(){
        return " " + noodle + ", 간농도 : " + salt + ", 총 : " + portion + "인분";
    }
}
