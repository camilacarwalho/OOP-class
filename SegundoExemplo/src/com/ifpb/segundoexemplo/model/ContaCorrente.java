package com.ifpb.segundoexemplo.model;

    public class ContaCorrente{
        // Atributos
    private String titular;
    private int agencia;
    private String conta;
    private float saldo;

        //Construtor
    public ContaCorrente(String titular, int agencia, String conta, float saldo){
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
       }

        //Getters and Setters
        public String getTitular(){
        return titular;
    }
        public void setTitular(String titular){
        this.titular = titular;
    }
        public int getAgencia(){
        return agencia;
    }
        public void setAgencia(int agencia)[
        this.agencia = agencia;
    }
        public String getConta(){
        return conta;   
    }
        public void setConta(String conta){
        this.conta = conta;
    }
        public float getSaldo(){
        return saldo;
    }

        //Importar scanner
         Scanner scanner = new Scanner(System.in);

        //Criar conta
        public void criarconta(){
        System.out.println("Informe o Titular: ");
        String titular = scanner.nextLine();
        
        System.out.println("Informe a Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Informe a Conta: ");
        String conta = scanner.nextLine();

        System.out.println("Valor inicial da conta: ");
        float saldo = scanner.nextFloat();
        }
        
        // Sacar
        public void sacar(float valor){
            float valorAtual = getSaldo;
            if(valor>valorAtual){
            System.out.println("Saldo Indisponível no momento;");
            }else{
            float valorFinal = valorAtual - valor;
            setSaldo(valorFinal);
            System.out.println("Saque feito com sucesso!!");
            }
     
    }
        //Depositar
        public void depositar(float valor){
            float valorAtual = gerSaldo;
            float valorFinal = valorAtual + valor;
            setSaldo(valorFinal);
            System.out.println("Depósito feito com sucesso!!");

    }
        //Transferir
        public void transferir(){
        System.out.printl("Informe o valor da transferência");
        float valorTrans = scanner.nextFLoat();
        if(valorTrans>saldo){
            System.out.println("Valor Insuficiente");
        }else{
        saldo -= valorTrans;
        scanner.nextLine();
        System.out.println("Informe a agencia da transferencia");
        int agenciaTrans = scanner.nextInt();
        System.out.println("Informe o numero da conta da transferencia");
        String contaTrans = scanner.nextLine();
        System.out.println("Transferencia feita com sucesso");
}
        
    }
}

