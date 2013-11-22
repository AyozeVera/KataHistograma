package katahistograma;

class Email {
    String address;

    public Email(String adress) {
        this.address = adress;
    }

    public String getAdress() {
        return address;
    }
    
    public String getDomain(){
        return address.split("@")[1];
    }
}
