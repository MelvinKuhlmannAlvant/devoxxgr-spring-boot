package nl.alvant.springbootdemo.model;

public class Country {

    public static final Country DUMMY;

    static {
        Country dummy = new Country();
        Name name = new Name();
        name.setCommon("dummy");
        dummy.setName(name);
        dummy.setCca2("du");
        DUMMY = dummy;
    }

    private Name name;
    private String cca2;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public static class Name {
        private String common;


        public String getCommon() {
            return common;
        }

        public void setCommon(String common) {
            this.common = common;
        }

        @Override
        public String toString() {
            return "Name{" +
                    "common='" + common + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Country{" +
                "name=" + name.toString() +
                ", cca2='" + cca2 + '\'' +
                '}';
    }
}
