package api.lang;
public class CG_VehicleTest {
	public static void main(String[] args) {
		CG_Vehicle vehicle1= new CG_Vehicle();
		CG_Owner owner1= new CG_Owner("LEE", "010-2233-4455");
		vehicle1.setOwner(owner1);
		vehicle1.setPrice(25000000);
		System.out.println(vehicle1);
		CG_Vehicle vehicle2= new CG_Vehicle();
		CG_Owner owner2= new CG_Owner("LEE", "010-6677-8899");
		vehicle2.setOwner(owner2);
		vehicle2.setPrice(50000000);
		System.out.println(vehicle2);
		System.out.println("悼老茄 家蜡林 咯何 : "+ vehicle1.equals(vehicle2));

	}
}