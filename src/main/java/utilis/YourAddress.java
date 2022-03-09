package utilis;

import java.util.Objects;

public class YourAddress {
    protected String company;
    protected String addressStreet;
    protected String addressBuilding;
    protected String city;
    protected String postalCode;
    protected String additionalInformation;
    protected String mobilePhone;
    protected String referenceAddress;

    public YourAddress(String company, String addressStreet,
                       String addressBuilding, String city, String postalCode,
                       String additionalInformation, String mobilePhone, String referenceAddress) {
        this.company = company;
        this.addressStreet = addressStreet;
        this.addressBuilding = addressBuilding;
        this.city = city;
        this.postalCode = postalCode;
        this.additionalInformation = additionalInformation;
        this.mobilePhone = mobilePhone;
        this.referenceAddress = referenceAddress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressBuilding() {
        return addressBuilding;
    }

    public void setAddressBuilding(String addressBuilding) {
        this.addressBuilding = addressBuilding;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getReferenceAddress() {
        return referenceAddress;
    }

    public void setReferenceAddress(String referenceAddress) {
        this.referenceAddress = referenceAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YourAddress that = (YourAddress) o;
        return Objects.equals(company, that.company) && Objects.equals(addressStreet, that.addressStreet) && Objects.equals(addressBuilding, that.addressBuilding) && Objects.equals(city, that.city) && Objects.equals(postalCode, that.postalCode) && Objects.equals(additionalInformation, that.additionalInformation) && Objects.equals(mobilePhone, that.mobilePhone) && Objects.equals(referenceAddress, that.referenceAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, addressStreet, addressBuilding, city, postalCode, additionalInformation, mobilePhone, referenceAddress);
    }

    @Override
    public String toString() {
        return "YourAddress{" +
                "company='" + company + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressBuilding='" + addressBuilding + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", referenceAddress='" + referenceAddress + '\'' +
                '}';
    }
}
