/*
1 - O exemplo abaixo apresenta uma classe que tem como tipo de atributo uma String,
utilizando o conceito de Generics crie uma classe que seja capaz de ser genérica,
portanto, armazene qualquer tipo. Crie a classe e o Main, demonstrando no Main pelo menos a
utilização com três tipos diferentes (objetos do Java e pelo menos um que você criou).


// Classe
public class MeuString
   private String str;
   public MeuString(String str) dado = str;
   public String getStr() return str;

// Main
   MeuString d = new MeuString(“Oi”);
   String x = d.getStr()
 */

public class Exe1<T> {
    private T value;

    public Exe1(T value) {
        setValue(value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
