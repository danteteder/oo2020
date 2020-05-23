public class Apartment extends House{

    public String User;
    public int ApNumber;
    public int ApArea;
    public String Gender;

	public void ApInfo(){
        super.HouseInfo();
        System.out.println(" In apartment " + ApNumber + " Lives " + User+ ", " + Gender+ " has "+ApArea+ " square meters of space.");
        System.out.println("------------------------------------------------------");
    }

    @Override
    public String DailyLife() {
        // TODO Auto-generated method stub
        return null;
    }
}