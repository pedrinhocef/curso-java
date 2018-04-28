package br.com.bytebank.banco.testes;

public class TestaString {

    public static void main(String[] args) {

        String nome = "Pedro";
        System.out.println(nome.contains("Ped"));

        char c = nome.charAt(2);
        System.out.println(c);

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        String vazia = "  ";
        String vaziaTrim = vazia.trim();

        System.out.println(vazia.isEmpty());
        System.out.println(vaziaTrim.isEmpty());

        int pos = nome.indexOf("rio");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();
        System.out.println(texto);

    }
}
