package SoftwareDevLect;

enum d {g,h}
// final can't be inherited
// enum Singleton {endaVarde}
public class Main {
    enum Ppl {a,b,c};

    enum Champ {
        Briar(10),
        Kayle(7);
        int usefullness;
        Champ(int usefullness){
            this.usefullness = usefullness;
        }

        void incrUsefullness() {
            usefullness++;
        }

        public String toString() {
            return super.toString() + " " + Integer.toString(usefullness) + " ";
        }
    }

    public static void main(String []args) {

        for (Ppl p: Ppl.values()) {
            System.out.println(p);
        }

        for (Champ c: Champ.values()) {
            System.out.println(c);
            System.out.println(c.usefullness);
            c.incrUsefullness();
            System.out.println(c);
            System.out.println(c.usefullness);

        }
        // TDD ...
        // LSP, Liskov substitution principle. Ersätttningsbarhet.

    }

}
