public class ContagemCliente {
    //O comando for (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora, seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.
    public static void main(String[] args) {
        

        for (int clientes = 1 ; clientes <=20; clientes ++){
            System.out.println("Cliente n° "+clientes +" Adicionado");

        }

        String nomes[] ={"André","Matheus","Felipe","Paulo", "Fernando"};

        for(int a = 0; a<nomes.length; a++){
            System.out.println("O nome no indice = " + a + " é " +nomes[a]);

        }

        //Break significa quebrar, parar, frear, interromper. E é isso que se faz, quando o Java encontra esse comando pela frente. Continue, como o nome diz, ele 'continua' o laço. O comando break interrompe o laço, já o continue interrompe somente a iteração atual.

        for (int numero = 0; numero  <=99; numero++){
            if(numero == 40)
                continue;

                System.out.println(numero);
        }
    }

}
