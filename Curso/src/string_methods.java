public class string_methods {
    public static void main(String[] args) {

        String nome = " João Pedro ";
        String nome2 = "Nicolas";
        String vazio = "Nicolas";
        String vazio1 = "Nicolas";
        int idade = 0;

        int length = nome.length();  //Quantidade de caractéres
        char letter = nome.charAt(1);  //Mostra o caractér com base no index pedido
        int index = nome.indexOf("o");  //Mostra a primeira ocorrência do caractér pedido
        int lastIndex = nome.lastIndexOf("o");  //Mostra a ultima ocorrência do caractér pedido
        nome = nome.toUpperCase();  //Transforma todas as letras da variável em maiúsculas
        nome = nome.trim();  //elimina os espaços da variável (não elimina os espaços entre as palavras)

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(nome);
        nome = nome.toLowerCase();  //Transforma todas as letras da variável em minúsculas
        System.out.println(nome);
        nome = nome.replace("j", "b");  //substitui o caractér selecionado por outro escolhido
        System.out.println(nome);                        //LEMBRE-SE QUE O CARACTÉR DEVE EXISITIR NA VÁRIVEL QUE SERÁ MUDADA

        if (vazio.isEmpty()) {
            System.out.println("Não tem nada aqui...");  //se a variavel estiver sem valor, printar "Não tem nada aqui"
        }
        else {
            System.out.println(vazio);                //se a variavél NÃO estiver vazia, printar (variável)
        }
        if (idade <= 0) {
            System.out.println("Nem nasceu direito ainda");
        }
        else {
            System.out.println("Você é nascido");
        }
        if (nome.contains(" ")) {
            System.out.println("Seu nome tem esse caractér");  //faz um boolean checar se tal caractér existe na variável
        }
        else {
            System.out.println("Seu nome não tem esse caractér");
        }
        if (nome.equals("boão pedro")) {
            System.out.println("É a mesma coisa!");  //checar se as variáveis são iguais ou não
        }
        else {
            System.out.println("São diferentes");
        }
        if (nome2.equalsIgnoreCase("nicolas")) {
            System.out.println("É a mesma coisa!");  //checar se as variáveis são iguais ou não
        }                                            //E ignora se as letras são maisculas ou minusculuas
        else {
            System.out.println("São diferentes");
        }
        if (vazio.equals(vazio1)) {
            System.out.println("É a mesma coisa!");  //checar se as variáveis são iguais ou não
        }
        else {
            System.out.println("São diferentes");
        }
    }
}