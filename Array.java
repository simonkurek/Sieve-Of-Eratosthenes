import java.util.*;
public class Array {
	//Arrays Init
	ArrayList<Integer> poz = new ArrayList<Integer>();
	ArrayList<Integer> ban = new ArrayList<Integer>();
	//Ban Check
	public boolean isBan(int num){
		boolean banned = false;
		for (int i = 0; i < ban.size(); i++) {
			if(ban.get(i) == num){
				banned = true;
			}
		}
		return banned;
	}
	public int getLast(){
		return poz.get(poz.size()-1);
	}
}