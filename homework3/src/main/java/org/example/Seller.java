package org.example;
public class Seller {
    private String name;
    private boolean free;

    public Seller(String name) {
        this.name = name;
        this.free = true;
    }

    public void modify(TelephoneApparat telephoneApparat) {
        char[] array = telephoneApparat.getManufacturer().toCharArray();
        for (int i=0; i<array.length; i++) {
            if (array[i] == 'o' || array[i] == 'O') {
                array[i] = 'a';
            }
        }
        if (array[0] == 'n' || array[0] == 'N') {
            telephoneApparat.setManufacturer(new String(array));
        } else {
            for (int i=0; i<array.length; i++) {
                array[i] = Character.toLowerCase(array[i]);
            }
            telephoneApparat.setManufacturer(new String(array));
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
