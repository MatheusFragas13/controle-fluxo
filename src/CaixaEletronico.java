/**
 * @author Matheus Fragas
 * @version 1.0.0
 * 
 */


public class CaixaEletronico {
    public static void main(String[] args) {
        
        
        boolean contaConsulta = false;

        if(contaConsulta == true) //Quando ocorre uma validação de execução de fluxo, somente quando a condição for positiva, consideramos como uma estrutura
        
        {
            System.out.println("Legal voce ja tem uma conta no nosso banco");
        }
        
        
        
        double saldo = 17.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque efetuado saldo restante: "+saldo);
            }
            //Algumas vezes, o nosso programa deverá seguir mais de uma jornada de execução, condionado a uma regra de negócio
        else{
            System.out.println("Negado, Saldo insuficiente!");
        }
        
        int score =20;

       if(score >=40)
        System.out.println("Credito aprovado");
        else if ( score >=30 && score < 40)
        System.out.println("Credito irá para analise"); //Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições.
        else
            System.out.println("Credito não aprovado");
        
            

        
    }
}
