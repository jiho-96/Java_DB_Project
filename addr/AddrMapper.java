package addr;

import java.util.ArrayList;

public interface AddrMapper {
	
	public ArrayList<Addr> getAddresses(); // 주소 정보를 가져오는 메서드
	                                       // Addr 객체의 리스트를 반환
	public void insertAddress(Addr addr);  // 새로운 정보를 추가하는 메서드
	public void updateAddress(Addr addr); // 정보를 업데이트하는 메서드
	public void deleteAddress(int id);  // 정보를 삭제하는 메서드
										// 매개변수 id
}
