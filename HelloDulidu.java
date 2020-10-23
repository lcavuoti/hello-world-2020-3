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
}