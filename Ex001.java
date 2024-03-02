public class Ex001 {
    public static void main(String[] args) {
        String palavra = "";
        for(int i = 0; i < args.length; i++){
            palavra += args[i];
        }
        System.out.println(palavra);
        System.out.println(args[0].length());
        }
    }
    //Digite um nome, imprima quantas letras tem esse nome

    