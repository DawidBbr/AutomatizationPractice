package utilis;

public class YourPersonalInformation {

    protected final String firstName;
    protected final String lastName;
    protected final String password;

    private YourPersonalInformation(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.password = builder.password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {
        protected String firstName;
        protected String lastName;
        protected String password;

        public Builder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder password(final String password) {
            this.password = password;
            return this;
        }
        public YourPersonalInformation build() {
            return new YourPersonalInformation(this);
        }
    }
}