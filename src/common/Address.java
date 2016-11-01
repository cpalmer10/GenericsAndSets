package common;

import java.util.Objects;

public class Address {
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String email;

    public Address(String address, String city, String state, String zipCode){
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.address);
        hash = 83 * hash + Objects.hashCode(this.zipCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Address{" + "address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", phone=" + phone + ", email=" + email + '}';
    }



}
