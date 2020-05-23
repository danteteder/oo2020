public abstract class House {

    public int NumberOfApartments = 34;
    public String HouseColor = "Yellow";
    public int Area = 400;
    public int HouseNumber = 78;

    public void HouseInfo(){
        System.out.println(" House is " + this.HouseColor + " and there are " + NumberOfApartments + " Apartments");
    }

    public abstract String DailyLife();
}