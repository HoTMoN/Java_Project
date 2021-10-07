package api.lang;

public class CG_Owner {
	String name;
	String cellPhone;
	
	public CG_Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}
	@Override
	public boolean equals(Object otherObject) {
		boolean state = false;
		if(otherObject instanceof CG_Owner) {
			CG_Owner obj = (CG_Owner)otherObject;
		if(this.name.equals(obj.name)) {
			state = true;
			}
		}
	return state;
	}
	
	@Override
	public String toString() {
		return "이름은 "+name+"이고, 핸드폰 번호는 "+cellPhone;
	}
}
