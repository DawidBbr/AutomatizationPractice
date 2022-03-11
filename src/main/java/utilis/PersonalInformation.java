package utilis;

public class PersonalInformation {

    protected final String firstName;
    protected final String lastName;
    protected final String password;

    private PersonalInformation(PersonalInformationBuilder builder) {
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

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class PersonalInformationBuilder {
        protected String firstName;
        protected String lastName;
        protected String password;

        public PersonalInformationBuilder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonalInformationBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonalInformationBuilder password(final String password) {
            this.password = password;
            return this;
        }
        public PersonalInformation build() {
            return new PersonalInformation(this);
        }
    }

}