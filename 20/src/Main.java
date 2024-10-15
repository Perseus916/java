public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");

        Degree d = new Degree();
        d.getDegree();
        Undergraduate u = new Undergraduate();
        u.getDegree();
        Postgraduate p = new Postgraduate();
        p.getDegree();
    }
}
class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am an Postgraduate");
    }
}