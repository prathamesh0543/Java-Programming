package OOPs;
// dynamic methid dispatch

class Game
{
	public void type()
	{
		System.out.println(" Indoor & Outdoor");
	}
}
class cricket extends Game
{
	public void type() {
		System.out.println(" cricket is outdoor game ");
	}
}
public class june19_jm_upcasting {

	public static void main(String[] args) {
		Game gm = new Game();
		cricket ck = new cricket();
		gm.type();
		ck.type();
		gm=ck;
		gm.type();

	}

}
