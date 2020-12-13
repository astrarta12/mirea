package lab24.ex2;

import java.util.StringTokenizer;

public class Address {

    private String country, city, street, house;

    private Address(
            String country,
            String city,
            String street,
            String house
    ) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public static Address parseWithSplit(String address, String delimiter){
        String[] split = address.split(delimiter + " ");
        return new Address(split[0], split[1], split[2], split[3]);
    }

    public static Address parseWithStringTokenizer(String address, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(address, " " + delimiter);
        return new Address(
                tokenizer.nextToken(),
                tokenizer.nextToken(),
                tokenizer.nextToken(),
                tokenizer.nextToken()
        );
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
