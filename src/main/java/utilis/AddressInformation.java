package utilis;

import enums.State;

public class AddressInformation {

    protected String company;
    protected String addressStreet;
    protected String addressBuilding;
    protected String city;
    protected String postalCode;
    protected String additionalInformation;
    protected String mobilePhone;
    protected String referenceAddress;
    protected State state;


    private AddressInformation(AddressInformationBuilder builder) {
        this.company = builder.company;
        this.addressStreet = builder.addressStreet;
        this.addressBuilding = builder.addressBuilding;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
        this.additionalInformation = builder.additionalInformation;
        this.mobilePhone = builder.mobilePhone;
        this.referenceAddress = builder.referenceAddress;
        this.state = builder.state;
    }

    public String getCompany() {
        return company;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressBuilding() {
        return addressBuilding;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getReferenceAddress() {
        return referenceAddress;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "AddressInformation{" +
                "company='" + company + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressBuilding='" + addressBuilding + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", referenceAddress='" + referenceAddress + '\'' +
                ", state=" + state +
                '}';
    }

    public static class AddressInformationBuilder {
        protected String company;
        protected String addressStreet;
        protected String addressBuilding;
        protected String city;
        protected String postalCode;
        protected String additionalInformation;
        protected String mobilePhone;
        protected String referenceAddress;
        protected State state;

        public AddressInformationBuilder company(String company) {
            this.company = company;
            return this;
        }
        public AddressInformationBuilder addressStreet(String addressStreet) {
            this.addressStreet = addressStreet;
            return this;
        }
        public AddressInformationBuilder addressBuilding(String addressBuilding) {
            this.addressBuilding = addressBuilding;
            return this;
        }
        public AddressInformationBuilder city(String city) {
            this.city = city;
            return this;
        }
        public AddressInformationBuilder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public AddressInformationBuilder additionalInformation(String additionalInformation) {
            this.additionalInformation = additionalInformation;
            return this;
        }
        public AddressInformationBuilder mobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public AddressInformationBuilder referenceAddress(String referenceAddress) {
            this.referenceAddress = referenceAddress;
            return this;
        }
        public AddressInformationBuilder state(State state) {
            this.state = state;
            return this;
        }
        public AddressInformation build() {
            return new AddressInformation(this);
        }
    }
}





