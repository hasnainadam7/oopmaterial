class P2 {

    static String name ;
    static String email;
    static String gender;
    static String book ;

    P2(String name, String email, String gender, String book) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.book = book;
    }

    void display() {
        show();
    }

    static {
        name = "HAsnain";

        email = "hasnainadam7@gmail.com";
        gender = "Male";
        book = "Assan Sindhi Part 2 aruthor Gafoor Shitroo";
    }

    static void show() {
        System.out.println(" Your name is : " + name);
        System.out.println(" Your email is : " + email);
        System.out.println(" Your gender is : " + gender);
        System.out.println(" Your book is : " + book);
    }

    public static void main(String[] args) {
        P2 Obj = new P2("Haseeb", "mygmail@gmail.com", "male", "Asan Farsi");
        Obj.display();
    }
}
