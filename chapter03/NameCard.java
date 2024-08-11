package chapter03;

public class NameCard {
    String name;
    String phone;

    public NameCard(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showNameCardInfo() {
        System.out.println(this);
    }

    public boolean nameCompare(String name) {
        return this.name.equals(name);
    }

    public void changePhoneNum(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "NameCard{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
