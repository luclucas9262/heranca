
package heranca;


public class professor extends Pessoa{
    
    private int carga_horaria;
    private String titulacao;
    
    public void SetCarga(){
        System.out.print("Digite a carga Hóraria:");
        this.carga_horaria = entrada.nextInt();
    }
    public int GetCarga(){
        return this.carga_horaria;
    }
    
    public void Settitulacao(){
        System.out.print("Digite a Titulação: ");
        this.titulacao = entrada.nextLine();  
    }
    
    public String GetTitulacao(){
        return this.titulacao;
    }
    
    public void ExibirCarga(){
        System.out.print(" Cargo do Funcionário: "+carga_horaria);
        System.out.print(" Titulação: "+titulacao);
         
    }
    
    
    
}


