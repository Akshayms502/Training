package day2;

public class Tester {

	public static void main(String[] args) {
		Runner1 r=new Runner1();
		
		r.getStringLength(new StringInterface(){

			@Override
			public void comapreString(String s1, String s2) {
				if(s1.length()>s2.length()){
					System.out.println(s1);
				}else{
					System.out.println(s2);
				}
				
			}
			
		});
		
		///java 8
		
		//list.sort();
		
		r.getStringLength((s1,s2)->{
		if(s1.length()>s2.length()){
			System.out.println(s1);
		}else{
			System.out.println(s2);
		}
		}
				
				);

	}

}
