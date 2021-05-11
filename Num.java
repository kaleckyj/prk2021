public class Num {
	float value;
	boolean isInt;

    public Num(float value) {
        this.value = value;
		this.isInt = false;
    }

    public Num(int value) {
        this.value = value;
		this.isInt = true;
    }
}