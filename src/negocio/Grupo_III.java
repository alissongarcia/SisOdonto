/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author alisson
 */
public class Grupo_III {
    
    private String diagnostico;
    int flag;
    
    public String diagnosticar(int rqE9a, int rqE9b, int rqE2, int rqE4b, int rqE4c, int rqE6a, int rqE6b, int rqE5a, int rqE5b, int rqE7a, int rqE7b, int rqE7c){
        
        //AMBOS, DOR À PALPAÇÃO E RELATO DE DOR
        if(rqE9a != 0 || rqE9b != 0 && rqE2 != 0 || rqE4b != 0 || rqE4c != 0 || rqE6a != 0 || rqE6b != 0){
            flag = 0;
            diagnostico = segundaParte(rqE5a, rqE5b, rqE7a, rqE7b, rqE7c);
        }
        
        //NEM DOR À PALPAÇÃO NEM RELATO DE DOR
        else if(rqE9a == 0 || rqE9b == 0 && rqE2 == 0 || rqE4b == 0 || rqE4c == 0 || rqE6a == 0 || rqE6b == 0){
            flag = 1;
            diagnostico = segundaParte(rqE5a, rqE5b, rqE7a, rqE7b, rqE7c);
        }
        
        //DOR À PALPAÇÃO OU RELATO DE DOR, MAS NÃO AMBOS
        else if(rqE9a != 0 || rqE9b != 0 || rqE2 != 0 || rqE4b != 0 || rqE4c != 0 || rqE6a != 0 || rqE6b != 0){
            diagnostico = "Sem diagnóstico do grupo III do lado direito";
        }
        
        return diagnostico;
    }
    
    public String segundaParte(int rqE5a, int rqE5b, int rqE7a, int rqE7b, int rqE7c ){
        if(flag == 0){
            if(rqE5a == 2 || rqE5b == 2 || rqE7a == 2 || rqE7b == 2 || rqE7c == 2){
               diagnostico = "IIIb. Osteoartrite";
            }
            else{
                diagnostico = "IIIa. Artralgia";
            }
        }
        
        else{
            if(rqE5a == 2 || rqE5b == 2 || rqE7a == 2 || rqE7b == 2 || rqE7c == 2){
               diagnostico = "IIIc. Osteoartrose";
            }
            else{
                diagnostico = "Sem diagnóstico do grupo III do lado direito";
            }
        }
        
        return diagnostico;
    }
    
}
