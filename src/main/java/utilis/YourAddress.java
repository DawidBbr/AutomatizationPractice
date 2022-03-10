package utilis;

public class YourAddress {

    protected final String company;
    protected final String addressStreet;
    protected final String addressBuilding;
    protected final String city;
    protected final String postalCode;
    protected final String additionalInformation;
    protected final String mobilePhone;
    protected final String referenceAddress;

    private YourAddress(Builder builder) {
        this.company = builder.company;
        this.addressStreet = builder.addressStreet;
        this.addressBuilding = builder.addressBuilding;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
        this.additionalInformation = builder.additionalInformation;
        this.mobilePhone = builder.mobilePhone;
        this.referenceAddress = builder.referenceAddress;
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

    public static class Builder {
        protected String company;
        protected String addressStreet;
        protected String addressBuilding;
        protected String city;
        protected String postalCode;
        protected String additionalInformation;
        protected String mobilePhone;
        protected String referenceAddress;

        public Builder company(final String company) {
            this.company = company;
            return this;
        }
        public Builder addressStreet(final String addressStreet) {
            this.addressStreet = addressStreet;
            return this;
        }
        public Builder addressBuilding(final String addressBuilding) {
            this.addressBuilding = addressBuilding;
            return this;
        }
        public Builder city(final String city) {
            this.city = city;
            return this;
        }
        public Builder postalCode(final String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder additionalInformation(final String additionalInformation) {
            this.additionalInformation = additionalInformation;
            return this;
        }
        public Builder mobilePhone(final String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public Builder referenceAddress(final String referenceAddress) {
            this.referenceAddress = referenceAddress;
            return this;
        }
        public YourAddress build() {
            return new YourAddress(this);
        }
    }
}





