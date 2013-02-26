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
    String diagnostico, resultado;
    int dif, MAX, ABE;
    
    public String diagnostico(String rE5a, int med_est_abert, int med_est_fecho, String rE5b, String rE5c, String E7_dir_exc_dir, String E7_dir_exc_esq, String E7_dir_prot, String rq14a, int E4b, int E4c, int E4d, int E6b, String E3){
        diagnostico = "";
        if(rE5a.equalsIgnoreCase("Estalido - 1") == false && rE5b.equalsIgnoreCase("Estalido - 1") == false){
            
            diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3, rE5a, rE5b, rE5c, E7_dir_exc_dir, E7_dir_exc_esq, E7_dir_prot);
        }
        
        
        else if("Estalido - 1".equalsIgnoreCase(rE5a) && "Estalido - 1".equalsIgnoreCase(rE5b)){
            dif = med_est_abert - med_est_fecho;
            
            if(dif >= 5){
                if("Sim".equalsIgnoreCase(rE5c)){
                    diagnostico = "IIa DD Direita com Redução";
                }
                else if("Não".equalsIgnoreCase(rE5c)){
                    if("Estalido - 1".equalsIgnoreCase(E7_dir_exc_dir) || "Estalido - 1".equalsIgnoreCase(E7_dir_exc_esq) || "Estalido - 1".equalsIgnoreCase(E7_dir_prot)){
                        diagnostico = "IIa DD Direita com Redução";
                    }
                    else{
                        diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3, rE5a, rE5b, rE5c, E7_dir_exc_dir, E7_dir_exc_esq, E7_dir_prot);
                    }
                }
            }
            else if(dif < 5){
                if("Estalido - 1".equalsIgnoreCase(E7_dir_exc_dir) || "Estalido - 1".equalsIgnoreCase(E7_dir_exc_esq) || "Estalido - 1".equalsIgnoreCase(E7_dir_prot)){
                    diagnostico = "IIa DD Direita com Redução";
                }
                else{
                    diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3, rE5a, rE5b, rE5c, E7_dir_exc_dir, E7_dir_exc_esq, E7_dir_prot);
                }
            }
        }
        
        else if("Estalido - 1".equalsIgnoreCase(rE5a) || "Estalido - 1".equalsIgnoreCase(rE5b)){
            
            if("Estalido - 1".equalsIgnoreCase(E7_dir_exc_dir) || "Estalido - 1".equalsIgnoreCase(E7_dir_exc_esq) || "Estalido - 1".equalsIgnoreCase(E7_dir_prot)){
                diagnostico = "IIa DD Direita com Redução";
            }
            else{
                diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3, rE5a, rE5b, rE5c, E7_dir_exc_dir, E7_dir_exc_esq, E7_dir_prot);
            }
        }
        
        return diagnostico;
    }
    
    public String segundaParte(String rq14a, int E4b, int E4c, int E4d, int E6a_b, String E3_direita_esquerda, String E5ad, String E5bd, String E5cd, String E7_excursao_direita, String E7_excursao_esquerda, String E7_protusao){
        resultado = "";
        
        if("Sim".equalsIgnoreCase(rq14a)){
            MAX = E4b + E4d;
            ABE = E4c - E4b;
            
            if(MAX <= 35 && ABE <= 4){
                if(E6a_b < 7){
                    resultado = "IIb DD Direita sem redução e com limitação de abertura";
                }
                
                else{
                    if("Desvio lateral direito (não corrigido) - 1".equalsIgnoreCase(E3_direita_esquerda)){
                        resultado = "IIb DD Direita sem redução e com limitação de abertura";
                    }
                    
                    else{
                        resultado = "Sem diagnóstico do grupo II do lado Direito";
                    }
                }
            }
            
            else if(MAX > 35 && ABE > 4){
                if(E6a_b >= 7){
                    if(!"Nenhum - 0".equalsIgnoreCase(E5ad) || !"Nenhum - 0".equalsIgnoreCase(E5bd) || !"Não - 0".equalsIgnoreCase(E5cd) || !"Nenhum - 0".equalsIgnoreCase(E7_excursao_direita) || !"Nenhum - 0".equalsIgnoreCase(E7_excursao_esquerda) || !"Nenhum - 0".equalsIgnoreCase(E7_protusao)){
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
        
        //Se o conteúdo da questão 14a for NÃO
        else{
            resultado = "Sem diagnóstico do grupo II do lado Direito";
        }
        return resultado;
    }
    
}
