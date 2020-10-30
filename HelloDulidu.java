public class HelloDulidu {

    private String hello = "Hello Guguseli";
    private String coolFeature = "My cool feature";
    private String coolFeature4 = "my feature 4";
    private String coolFeature5 = "jehh, a new feature";

    public HelloDulidu() {
        coolFeature = "cool-feature";
    }

    public String getHello() {

        return this.hello;
    }

    public String getCoolFeature() {
        return this.coolFeature;
    }

    public void setCoolFeature(String cool) {
        this.coolFeature = cool;
    }

    <<<<<<<HEAD

    public static void main(Strin[] args) {
        // test object instanciating
        HelloDulidu hd = new HelloDulidu();

        System.out.println("hello hot fix " + hd.getCoolFeature());
=======

    public String getCoolFeature4() {
        return coolFeature4;
    }

    public void setCoolFeature4(String coolFeature4) {
        this.coolFeature4 = coolFeature4;
>>>>>>> cool-feature-5
    }
}