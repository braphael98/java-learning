public class Ex002 { 
    public static void main(String[] args) {
        String palavras = "";
        for(int i = 0; i < args.length; i++){
            palavras += args[i];
        }
        System.out.println(palavras.length());

    }
    
}
//Exercicio para digitar varias palavras e contar quantas letras tem;