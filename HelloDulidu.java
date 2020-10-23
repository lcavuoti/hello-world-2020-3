public class HelloDulidu {

    private String hello = "Hello Guguseli";
    private String coolFeature = "My cool feature";

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

    public static void main(Strin[] args) {
        // test object instanciating
        HelloDulidu hd = new HelloDulidu();

        System.out.println("hello hot fix " + hd.getCoolFeature());
    }
}