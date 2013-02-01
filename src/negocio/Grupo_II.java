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
    
    public String diagnostico(int rE5a, int med_est_abert, int med_est_fecho, int rE5b, int rE5c, int E7dir_excur_direita, int E7dir_excur_esquerda, int E7dir_Protusao, int rq14a, int E4b, int E4c, int E4d, int E6b, int E3){
        if(rE5a == 0 && rE5b == 0){
            diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3);
        }
        else if(rE5a > 0 && rE5b > 0){
            dif = med_est_abert - med_est_fecho;
            
            if(dif >= 5){
                if(rE5c == 1/*->para sim*/){
                    diagnostico = "IIa DD Direita com Redução";
                }
                else if(rE5c == 0/*->para não*/){
                    if(E7dir_excur_direita > 0 || E7dir_excur_esquerda > 0 || E7dir_Protusao > 0){
                        diagnostico = "IIa DD Direita com Redução";
                    }
                    else{
                        diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3);
                    }
                }
            }
            else if(dif < 5){
                if(E7dir_excur_direita > 0 || E7dir_excur_esquerda > 0 || E7dir_Protusao > 0){
                    diagnostico = "IIa DD Direita com Redução";
                }
                else{
                    diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3);
                }
            }
        }
        else if(rE5a > 0 || rE5b > 0){
            if(E7dir_excur_direita > 0 || E7dir_excur_esquerda > 0 || E7dir_Protusao > 0){
                diagnostico = "IIa DD Direita com Redução";
            }
            else{
                diagnostico = segundaParte(rq14a, E4b, E4c, E4d, E6b, E3);
            }
        }
        
        return diagnostico;
    }
    
    public String segundaParte(int rq14a, int E4b, int E4c, int E4d, int E6b, int E3){
        String resultado = "";
        if(rq14a == 1){
            MAX = E4b + E4d;
            ABE = E4c - E4b;
            
            if(MAX <= 35 && ABE <= 4){
                if(E6b < 7){
                    resultado = "IIb DD Direita sem redução e com limitação de abertura";
                }
                else if(E6b >= 7){
                    //Tirar dúvida com o cliente sobre esse trecho
                    if(E3 == 1){
                        resultado = "IIb DD Direita sem redução e com limitação de abertura";
                    }
                    else if(E3 != 1){
                        resultado = "Sem diagnóstico do grupo II do lado Direito";
                    }
                }
            }
            
            else if(MAX > 35 && ABE > 4){
                if(E6b >= 7){
                    if(/*Não entendi essa parte*/MAX == 1){
                        resultado = "IIc DD Direita sem redução e sem limitação de abertura";
                    }
                    else if(E6b < 7){
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
