public class Operadora {public static void main(String[] args) {
    String plano = "D"; // A estrutura switch, compara o valor de cada caso, com o da variável sequencialmente e sempre que encontra um valor correspondente, executa o código associado ao caso.

    switch (plano) { //pega a varivael (plano e cria casos para ela, estrutura e decide qual caso e a regra a ser executado)
        case "T": { // case e o caso que vai rodar apartir do numero incluido na variavel
            System.out.println("5Gb Youtube");
        }
        case "M": {
            System.out.println("WhatsApp e Instagram grátis");
        }
        case "B": {
            System.out.println("100 minutos de ligação");
        }

        default: //so é executado quando o dado incluido na variavel não entra em nennhum case.
            System.out.println("Invalido!!!");   
    }

}
    
}
