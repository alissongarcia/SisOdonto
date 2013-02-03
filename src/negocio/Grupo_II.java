/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author alisson
 */
public class Grupo_II {
    String diagnostico;
    int dif, MAX, ABE;
    
    public String diagnostico(int rE5a, int med_est_abert, int med_est_fecho, int rE5b, int rE5c, int E7_excursao_direita, int E7_excursao_esquerda, int E7_protusao, int rq14a, int E4b, int E4c, int E4d, int E6b, int E3, int E5ad, int E5bd, int E5cd, int E7_dir_exc_dir, int E7_dir_exc_esq, int E7_dir_prot){
        
        if(rE5a != 1 && rE5b != 1){
            diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3, E5ad, E5bd, E5cd, E7_excursao_direita, E7_excursao_esquerda, E7_protusao);
        }
        
        
        else if(rE5a == 1 && rE5b == 1){
            dif = med_est_abert - med_est_fecho;
            
            if(dif >= 5){
                if(rE5c == 1/*->para sim*/){
                    diagnostico = "IIa DD Direita com Redução";
                }
                else if(rE5c == 0/*->para não*/){
                    if(E7_excursao_direita > 0 || E7_excursao_esquerda > 0 || E7_protusao > 0){
                        diagnostico = "IIa DD Direita com Redução";
                    }
                    else{
                        diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3, E5ad, E5bd, E5cd, E7_dir_exc_dir, E7_dir_exc_esq, E7_dir_prot);
                    }
                }
            }
            else if(dif < 5){
                if(E7_excursao_direita > 0 || E7_excursao_esquerda > 0 || E7_protusao > 0){
                    diagnostico = "IIa DD Direita com Redução";
                }
                else{
                    diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3, E5ad, E5bd, E5cd, E7_dir_exc_dir, E7_dir_exc_esq, E7_dir_prot);
                }
            }
        }
        
        else if(rE5a == 1 || rE5b == 1){
            if(E7_excursao_direita > 0 || E7_excursao_esquerda > 0 || E7_protusao > 0){
                diagnostico = "IIa DD Direita com Redução";
            }
            else{
                diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3, E5ad, E5bd, E5cd, E7_dir_exc_dir, E7_dir_exc_esq, E7_dir_prot);
            }
        }
        
        return diagnostico;
    }
    
    public String segundaParte(int rq14a, int E4b, int E4c, int E4d, int E6a_b, int E3_direita_esquerda, int E5ad, int E5bd, int E5cd, int E7_excursao_direita, int E7_excursao_esquerda, int E7_protusao){
        String resultado = "";
        if(rq14a == 1){
            MAX = E4b + E4d;
            ABE = E4c - E4b;
            
            if(MAX <= 35 && ABE <= 4){
                if(E6a_b < 7){
                    resultado = "IIb DD Direita sem redução e com limitação de abertura";
                }
                
                else{
                    if(E3_direita_esquerda == 1){
                        resultado = "IIb DD Direita sem redução e com limitação de abertura";
                    }
                    
                    else{
                        resultado = "Sem diagnóstico do grupo II do lado Direito";
                    }
                }
            }
            
            else if(MAX > 35 && ABE > 4){
                if(E6a_b >= 7){
                    if(E5ad != 0 || E5bd != 0 || E5cd != 0 || E7_excursao_direita != 0 || E7_excursao_esquerda != 0 || E7_protusao != 0){
                        resultado = "IIc DD Direita sem redução e sem limitação de abertura";
                    }
                    else {
                        resultado = "Sem diagnóstico do grupo II do lado Direito";
                    }
                }
                
            }
            //Combinação diferente das duas acima
            else{
                resultado = "Sem diagnóstico do grupo II do lado Direito";
            }
        }
        return resultado;
    }
    
}
