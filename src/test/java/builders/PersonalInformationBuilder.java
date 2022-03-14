package builders;

import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.YearOfBirth;
import utilis.PersonalInformation;

public class PersonalInformationBuilder {

    public static PersonalInformation.PersonalInformationBuilder getBasePersonalInformationBuilder() {
        PersonalInformation.PersonalInformationBuilder personalData = new PersonalInformation.PersonalInformationBuilder()
                .firstName("Jan")
                .lastName("Kowalski")
                .password("Password123")
                .dayOfBirth(DayOfBirth.DAY4)
                .monthOfBirth(MonthOfBirth.JULY)
                .yearOfBirth(YearOfBirth.BORNIN1995);
        return personalData;
    }
}
