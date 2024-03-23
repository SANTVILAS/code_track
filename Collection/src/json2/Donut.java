package json2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Donut {

	private String id;
	private String type;
	private String name;
	private int ppu;
	private Map<String, List<Map<String, String>>> batters;
	private List<Map<String, String>> topping;

	
	

	public Donut(String string, String type, String name, int ppu, Map<String, List<Map<String, String>>> batters,
			List<Map<String, String>> topping) {
		super();
		this.id = string;
		this.type = type;
		this.name = name;
		this.ppu = ppu;
		this.batters = batters;
		this.topping = topping;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPpu() {
		return ppu;
	}

	public void setPpu(int ppu) {
		this.ppu = ppu;
	}

	public Map<String, List<Map<String, String>>> getBatters() {
		return batters;
	}

	public void setBatters(Map<String, List<Map<String, String>>> batters) {
		this.batters = batters;
	}

	public List<Map<String, String>> getTopping() {
		return topping;
	}

	public void setTopping(List<Map<String, String>> topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		return "{id=" + id + ", type=" + type + ", name=" + name + ", ppu=" + ppu + ", batters=" + batters
				+ ", topping=" + topping + "}";
	}

	public static void main(String[] args) {

		Map<String, List<Map<String, String>>> batterMap = new HashMap<String, List<Map<String, String>>>();

		List<Map<String, String>> batterList = new ArrayList<Map<String, String>>();

		Map<String, String> batter1 = new HashMap<String, String>();
		batter1.put("id", "1000");
		batter1.put("type", "Regular");

		Map<String, String> batter2 = new HashMap<String, String>();
		batter2.put("id", "1001");
		batter2.put("type", "Chocolate");

		Map<String, String> batter3 = new HashMap<String, String>();
		batter3.put("id", "1002");
		batter3.put("type", "Blackberry");

		Map<String, String> batter4 = new HashMap<String, String>();
		
		batter4.put("id", "1003");
		batter4.put("type", "Forest");

		batterList.add(batter1);
		batterList.add(batter2);
		batterList.add(batter3);
		batterList.add(batter4);
		

		batterMap.put("batters", batterList);
		
		
		
		
		List<Map<String, String>> toppingList = new ArrayList<Map<String,String>>();
		
		Map<String, String> topping1 = new HashMap<String, String>();
		topping1.put("id", "4001");
		topping1.put("type", "None");
		
		Map<String, String> topping2 = new HashMap<String, String>();
		topping2.put("id", "4002");
		topping2.put("type", "Glased");
		
		Map<String, String> topping3 = new HashMap<String, String>();
		topping3.put("id", "4003");
		topping3.put("type", "Sugar");
		
		Map<String, String> topping4 = new HashMap<String, String>();
		topping4.put("id", "4004");
		topping4.put("type", "Powder sugar");
		
		toppingList.add(topping1);
		toppingList.add(topping2);
		toppingList.add(topping3);
		toppingList.add(topping4);
		
		
		Donut donut = new Donut("001", "donut", "cake", 1, batterMap, toppingList);
		
		System.out.println("ID: " + donut.getId());
		System.out.println("Name: " + donut.getName());
		System.out.println("Type: " + donut.getType());
		System.out.println("PPU: " + donut.getPpu());
		System.out.println("Batters: " + donut.getBatters());
		System.out.println("Toppings: " + donut.getTopping());
		
		
		
	}

}
