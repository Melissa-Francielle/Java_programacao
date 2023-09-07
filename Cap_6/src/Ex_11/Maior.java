package Ex_11;

public class Maior {
	
	void Maior(int...v) {
		int maior = 0;
			for(int i = 0; i < v.length;i++) {
				if (maior < v.length) {
					maior = v[i];
					
				}
				
			}
			System.out.println("maior: "+maior);
	}
}
