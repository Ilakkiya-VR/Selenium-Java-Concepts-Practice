package Interface_OOP;

import Encapsul.Apollo;

public class TestAPollo {
	static WHO W;

	public static void main(String[] args) {
		Apollo ap=new Apollo();
		ap.apolloServies();
		ap.cardioServices();
		ap.ENTServices();
		ap.gynoServices();
		ap.medicalServices();
		ap.orthoServices();
		ap.pediaServices();
		ap.physioServices();
		ap.vaccination();
		Medical.medicalNews();
		System.out.println("------------------");
		USMedical us=new Apollo();
		us.cardioServices();
		us.orthoServices();
		us.vaccination();
		ap.orthoServices();
		System.out.println(WHO.MIN_VAC_FEE);
		System.out.println(Apollo.MIN_VAC_FEE);
		System.out.println(USMedical.MIN_VAC_FEE);
		System.out.println(UKMedical.MIN_VAC_FEE);
		System.out.println(IndianMedical.MIN_VAC_FEE);
		W=new Apollo();
		W.vaccination();
		UKMedical ukm=(UKMedical) us;
		ukm.ENTServices();
		us.USMethod();
		ap.USMethod();
		Apollo.USStatic();
		USMedical.USStatic();
	
		
		
		
	

}
}