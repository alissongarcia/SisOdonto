package negocio;


public class Grupo_I {
	String diagnostico;
	
	public String diagnostico(String q3, int somaq8, int somaq10, String q1, int rq4a, int rq4b, int rq4c, int rq4d){
		if("não".equalsIgnoreCase(q3)){
			diagnostico = "Sem diagnostico";
			return diagnostico;
		}
		else{
			int total = 0;
			total = somaq8 + somaq10;
			if(total < 3){
				diagnostico = "Sem diagnostico";
				return diagnostico;
			}
			else{
				if("não".equalsIgnoreCase(q1)){
					diagnostico = "Sem diagnostico";
					return diagnostico;
				}
				else{
					total = 0;
					total = rq4a + rq4d;
					if(total < 40){
						total = 0;
						total = rq4c + rq4a;
						if(total < 5){
							diagnostico = "Ia - Dor Miofascial";
							return diagnostico;
						}
						else{
							diagnostico = "Ib - Dor Miofascial com limitação da abertura";
							return diagnostico;
						}
					}
					else{
						diagnostico = "Ia - Dor Miofascial";
						return diagnostico;
					}
				}
			}
		}
	}
	
}
