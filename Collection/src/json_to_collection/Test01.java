package json_to_collection;

import java.util.ArrayList;
import java.util.List;
//[{userId=1, title=5 point some one, completed=true}, {userId=2, title=one man army, completed=false}, {userId=3, title=Zero to Hero, completed=true}, {userId=4, title=Selenium Express, completed=true}]
public class Test01 {
	
	public static void main(String[] args) {
		
		List<UserDto> list = new ArrayList<UserDto>();
		
		UserDto dto1 = new UserDto(1, "5 point some one" , true);
		UserDto dto2 = new UserDto(2, "one man army" , false);
		UserDto dto3 = new UserDto(3, "Zero to Hero" , true);
		UserDto dto4 = new UserDto(4, "Selenium Express" , true);
		
		
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		
		
		System.out.println(list);
		
		
	}

}
