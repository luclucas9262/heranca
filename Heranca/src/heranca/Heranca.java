/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author 051968
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        do{
            p.ExibirMenu();
            p.SetOPC();
            if (p.GetOPC()<0 || p.GetOPC()>3){
                p.ExibirOPCInval();
            }
            else{
                if (p.GetOPC()==1){
                    Aluno a = new Aluno();
                    a.SetNome();
                    a.SetRa();
                    a.Setsexo();
                    System.out.println("**ALUNO**");
                    a.ExibirDadosPessoa();
                    a.ExibirRA();
                }
                if (p.GetOPC()==2){
                    Funcionario f = new Funcionario();
                    f.SetNome();
                    f.SetCargo();
                    f.Setsexo();
                    System.out.println("**FUNCIONÁRIO**");
                    f.ExibirDadosPessoa();
                    f.ExibirCargo();
                }
                if (p.GetOPC()==3){
                    professor m = new professor();
                    m.SetNome();
                    m.SetCarga();
                    m.Setsexo();
                    m.Settitulacao();
                    System.out.println("**PROFESSOR**");
                    m.ExibirDadosPessoa();
                    m.ExibirCarga();
                } 
                
                if(p.GetOPC()==0){
                    p.Sair();
                }
            }
        }while (p.GetOPC()!=0);
        
        
        
        
    }
    
}

