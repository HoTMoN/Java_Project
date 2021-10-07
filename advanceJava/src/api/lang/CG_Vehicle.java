package api.lang;

public class CG_Vehicle {
	CG_Owner owner;
	int price;
	
	@Override
	public String toString() {
		return "소유자정보 : "+owner.toString()+" 이고 \n"+"차량정보 : 가격은 "+price+"입니다.";
	}
	public CG_Owner getOwner() {
		return owner;
	}
	public void setOwner(CG_Owner owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object otherObject) {
		boolean state = false;
		if(otherObject instanceof CG_Vehicle) {
			CG_Vehicle obj = (CG_Vehicle)otherObject;
		if(this.owner.equals(obj.owner)) {
			state = true;
			}
		}
	return state;
	}
}
