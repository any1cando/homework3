package org.example;
public class TelephoneApparat {
    private String number;
    private int productionYear;
    private String manufacturer;

    public TelephoneApparat(String number, int productionYear, String manufacturer) {
        this.number = number;
        this.productionYear = productionYear;
        this.manufacturer = manufacturer;
    }

    public void call(String number) {
        System.out.println("Звоним по номеру " + number);
    }

    @Override
    public String toString() {
        return "TelephoneApparat{" +
                "number='" + number + '\'' +
                ", productionYear=" + productionYear +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear < 1900 || productionYear > 2023) {
            productionYear = 2023;
        }
        this.productionYear = productionYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
