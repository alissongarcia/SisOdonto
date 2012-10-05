package negocio;


public class Grupo_I {
	String diagnostico;
	
	public void diagnostico(int q3, int somaq8, int somaq10, int q1, int rq4a, int rq4b, int rq4c, int rq4d){
		if(q3 == 0){
			diagnostico = "Sem diagnostico";
			System.out.println(diagnostico);
		}
		else{
			int total = 0;
			total = somaq8 + somaq10;
			if(total < 3){
				diagnostico = "Sem diagnostico";
				System.out.println(diagnostico);
			}
			else{
				if(q1 == 0){
					diagnostico = "Sem diagnostico";
					System.out.println(diagnostico);
				}
				else{
					total = 0;
					total = rq4a + rq4d;
					if(total < 40){
						total = 0;
						total = rq4c + rq4a;
						if(total < 5){
							diagnostico = "Ia - Dor Miofascial";
							System.out.println(diagnostico);
						}
						else{
							diagnostico = "Ib - Dor Miofascial com limitação da abertura";
							System.out.println(diagnostico);
						}
					}
					else{
						diagnostico = "Ia - Dor Miofascial";
						System.out.println(diagnostico);
					}
				}
			}
		}
	}
	
}
