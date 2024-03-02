
public class Ex004 {
    public static void main(String[] args) {
        String palavra = "";
        String palavraVirada = "";

        for (int i = args.length - 1; i > -1; i--) {
            palavra = args[i];

            for (int pos = palavra.length() - 1; pos > -1; pos--) {
                palavraVirada += palavra.charAt(pos);

            }
            if (i > 0) {
                palavraVirada += "-";
            }
        }
        System.out.println(palavraVirada);
    }
}
