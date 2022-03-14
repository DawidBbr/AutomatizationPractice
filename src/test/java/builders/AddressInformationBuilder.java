package builders;

import enums.State;
import utilis.AddressInformation;

public class AddressInformationBuilder {

    public static AddressInformation.AddressInformationBuilder getBaseAddressInformationBuilder() {
        AddressInformation.AddressInformationBuilder addressData = new AddressInformation.AddressInformationBuilder()
                .company("SWMind")
                .addressStreet("Polna Street")
                .addressBuilding("167/6")
                .city("Michigan")
                .postalCode("23213")
                .additionalInformation("Something")
                .mobilePhone("667884335")
                .referenceAddress("Wiejska Street")
                .state(State.HAWAII);
        return addressData;
    }
}
