package lab5;


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
        int hash = 5;
        hash = 79 * hash + (this.address != null ? this.address.hashCode() : 0);
        hash = 79 * hash + (this.city != null ? this.city.hashCode() : 0);
        hash = 79 * hash + (this.state != null ? this.state.hashCode() : 0);
        hash = 79 * hash + (this.zipCode != null ? this.zipCode.hashCode() : 0);
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
        if ((this.address == null) ? (other.address != null) : !this.address.equals(other.address)) {
            return false;
        }
        if ((this.city == null) ? (other.city != null) : !this.city.equals(other.city)) {
            return false;
        }
        if ((this.state == null) ? (other.state != null) : !this.state.equals(other.state)) {
            return false;
        }
        if ((this.zipCode == null) ? (other.zipCode != null) : !this.zipCode.equals(other.zipCode)) {
            return false;
        }
        return true;
    }



}
