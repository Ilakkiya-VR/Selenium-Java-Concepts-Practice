package Interface_OOP;
	public class Apollo extends Medical implements UKMedical,USMedical,IndianMedical {

		@Override
		public void pediaServices() {
			System.out.println("Apollo---pediaServices");
			
		}

		@Override
		public void gynoServices() {
			System.out.println("Apollo---gynoServices");
				
		}

		@Override
		public void orthoServices() {
			System.out.println("Apollo---orthoServices");
			
		}

		@Override
		public void cardioServices() {
			System.out.println("Apollo---orthoServices");
			
		}

		@Override
		public void physioServices() {
			System.out.println("Apollo--- physioServices");
		}

		@Override
		public void ENTServices() {
			System.out.println("Apollo--- ENTServices");
			
		}

		@Override
		public void vaccination() {
			System.out.println("Apollo--- vaccination");
		
		}
		public void apolloServies() {System.out.println("Apollo--- Services");
		}
		@Override
		public void USMethod() {System.out.println("Apollo Method");}

		public static void USStatic() {System.out.println("ApolloStatic Method");}
		

	}



