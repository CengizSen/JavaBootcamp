package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase yazma �ekli.
		
		String internetSubeButonu ="�nternet �ubesi";
		
		System.out.println(internetSubeButonu);
        System.out.println(internetSubeButonu);
        
        double dolarDun=8.15;
        double dolarBugun=8.16;
        int vade=36;
        boolean dustuMu=false;
        
        
        if(dolarBugun<dolarDun) {
        	System.out.println("Dolar D��t� Resmi");
        }
        else if(dolarDun<dolarBugun) {
        	System.out.println("Dolar Y�kseldi Resmi");
        	
        }
        
        else {
        	System.out.println("Dolar e�ittir Resmi");
        }
        
        String[] krediler=
        	{
        			"H�zl� Kredi",
        			"Kolay Kredi",
        			"Konut Kredi",
        			"Ta��t Kredi"

        			
        	};
        for(String kredi:krediler ) {
        	System.out.println(kredi);
        }
        
        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;  //De�er Tipli
        sayi2=100;
        System.out.println(sayi1);

        int[]sayilar1= {10,20,30,40};
        int[]sayilar2= {100,200,300,400};
        sayilar1=sayilar2;
        sayilar2[0]=100;     //Referans-Tipli
        System.out.println(sayilar1[0]);

        
        String sehir1="Ankara";
        String sehir2="�stanbul";
        sehir1=sehir2;
        sehir2="izmir";     //Stringler karakterleri arrray olarak tutar.
        System.out.println(sehir1);
      
        
	}
	
 
}
