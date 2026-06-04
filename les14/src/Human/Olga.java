package Human;

public class Olga extends Human {

    public Olga(String say, int teeth) {
        setOld(teeth);
        setSay(say);
    }

    public String getSay() {
        String say = super.getSay();
        return say + " New!";
    }

    void says() {
    System.out.println(getSay() + " говорит в свои " +
            getOld() + " года");
}

}
