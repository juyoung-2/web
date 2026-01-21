package org.joonzis.ex;
class Room <T1, T2>{
	private T1 furniture1;
	private T2 furniture2;
	public void setFurniture1(T1 furniture1) {
		this.furniture1 = furniture1;
	}
	public void setFurniture2(T2 furniture2) {
		this.furniture2 = furniture2;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("첫 번째 가구 : ").append(furniture1).append("\n");
		sb.append("첫 번째 가구 : ").append(furniture2);
		return sb.toString();
	}
}
class Chair{
	
}
class Table{
	
}
class Bed{
	
}
class DressTable{
	
}
public class Ex04_generic {
	public static void main(String[] args) {
		
	}
}
