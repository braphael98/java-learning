public class Ex003 {
    public static void main(String[] args) {
        String palavra = "";
        for (int i = args.length - 1; i > -1; i--) {
            palavra += args[i];
            if (i > 0) {
                palavra += "-";
            }
        }
        System.out.println(palavra);
    }

}
/*Exercicio que troca as palavras de lugar, lembrando que toda posição de um array começa em 0, se uma array tem 3 elementos
é contada como [0,1,2]