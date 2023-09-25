package com.example.designpatterns.builder;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Address {

    private String houseNumber;

    private String street;

    private String city;

    private String zipcode;

    private String state;

    private void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    private void setCity(String city) {
        this.city = city;
    }

    private void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    private void setState(String state) {
        this.state = state;
    }

    public static class AddressBuilder  {

        private String houseNumber;

        private String street;

        private String city;

        private String zipcode;

        private String state;

        private Address address;

        public AddressBuilder houseNumber(String houseNumber) {
            this.houseNumber=houseNumber;
            return this;
        }

        public AddressBuilder street(String street) {
            this.street=street;
            return this;
        }

        public AddressBuilder city(String city) {
            this.city=city;
            return this;
        }

        public AddressBuilder zipCode(String zipcode) {
            this.zipcode=zipcode;
            return this;
        }

        public AddressBuilder state(String state) {
            this.state=state;
            return this;
        }

        public Address build() {
            this.address=new Address();
            address.setHouseNumber(houseNumber);
            address.setCity(city);
            address.setState(state);
            address.setStreet(street);
            address.setZipcode(zipcode);

            return address;
        }

        public Address getAddress() {
            return address;
        }
    }
}
