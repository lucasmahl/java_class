package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> nPrimos = new ArrayList<>();
		nPrimos.add(2);
		nPrimos.add(3);
		nPrimos.add(5);
		nPrimos.add(7);
		Integer i = 8;
		
		while (i<100) {
			for (Integer integer : nPrimos) {
				int x = nPrimos.get(nPrimos.size()-1);//pega o ultimo nprimo
				//System.out.println(i+"-"+integer);
				if(i%integer==0 && integer < x) {
					break;
				}else if(i%integer!=0 && integer >=x){
					System.out.println(i+"-"+integer);
					//nPrimos.add(i);
				}
			}
			i++;
		}
			
		
	

		System.out.println(nPrimos);

	}
}
