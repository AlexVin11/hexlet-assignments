package exercise;


class Address {
    // BEGIN
    @NotNull/*(description = "Field country must not be null")*/
    // END
    private String country;

    // BEGIN
    @NotNull/*(description = "Field city must not be null")*/
    // END
    private String city;

    // BEGIN
    @NotNull/*(description = "Field street must not be null")*/
    // END
    private String street;

    // BEGIN
    @NotNull/*(description = "Field houseNumber must not be null")*/
    // END
    private String houseNumber;

    private String flatNumber;

    Address(String country, String city, String street, String houseNumber, String flatNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
}
