package Models;

public class contact {
    private String Name;
    private String Adreess;
    private String typeContact;
    private String email;
    private int cellphone;

    public contact(String name, String adreess, String typeContact, String email, int cellphone) {
        Name = name;
        Adreess = adreess;
        this.typeContact = typeContact;
        this.email = email;
        this.cellphone = cellphone;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAdreess() {
        return Adreess;
    }

    public void setAdreess(String adreess) {
        Adreess = adreess;
    }

    public String getTypeContact() {
        return typeContact;
    }

    public void setTypeContact(String typeContact) {
        this.typeContact = typeContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCellphone() {
        return  cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "contact{" +
                "Name='" + Name + '\'' +
                ", Adreess='" + Adreess + '\'' +
                ", typeContact='" + typeContact + '\'' +
                ", email='" + email + '\'' +
                ", cellphone=" + cellphone +
                '}';
    }
}
