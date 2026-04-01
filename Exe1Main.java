public class Exe1Main {
    static void main() {
        Exe1 objeto1 = new Exe1("asdf");
        Exe1 objeto2 = new Exe1(new Banana("Branca","Brasil"));
        Exe1 objeto3 = new Exe1(new Animal("Peixe"));
        Exe1 objeto4 = new Exe1(1);

        System.out.println(objeto1.getValue()+"\n"+
                objeto2.getValue()+"\n"+
                objeto3.getValue()+"\n"+
                objeto4.getValue()+"\n");

    }
}
