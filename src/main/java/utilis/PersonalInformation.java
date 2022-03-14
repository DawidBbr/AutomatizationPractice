package utilis;

import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.YearOfBirth;

public class PersonalInformation {

    protected String firstName;
    protected String lastName;
    protected String password;
    protected DayOfBirth dayOfBirth;
    protected MonthOfBirth monthOfBirth;
    protected YearOfBirth yearOfBirth;


    private PersonalInformation(PersonalInformationBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.password = builder.password;
        this.dayOfBirth = builder.dayOfBirth;
        this.monthOfBirth = builder.monthOfBirth;
        this.yearOfBirth = builder.yearOfBirth;
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

    public DayOfBirth getDayOfBirth() {
        return dayOfBirth;
    }

    public MonthOfBirth getMonthOfBirth() {
        return monthOfBirth;
    }

    public YearOfBirth getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static class PersonalInformationBuilder {
        protected String firstName;
        protected String lastName;
        protected String password;
        protected DayOfBirth dayOfBirth;
        protected MonthOfBirth monthOfBirth;
        protected YearOfBirth yearOfBirth;

        public PersonalInformationBuilder firstName (String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonalInformationBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonalInformationBuilder password(String password) {
            this.password = password;
            return this;
        }
        public PersonalInformationBuilder dayOfBirth (DayOfBirth dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
            return this;
        }

        public PersonalInformationBuilder monthOfBirth(MonthOfBirth monthOfBirth) {
            this.monthOfBirth = monthOfBirth;
            return this;
        }

        public PersonalInformationBuilder yearOfBirth(YearOfBirth yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        public PersonalInformation build() {
            return new PersonalInformation(this);
        }
    }

}