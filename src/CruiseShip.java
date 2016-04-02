
public class CruiseShip extends Ship
{
    int maxPassengers;

    public CruiseShip(String newName, String newYear, int newMaxPassengers)
    {
        super(newName, newYear);
        maxPassengers = newMaxPassengers;
    }

    public void setNumPassengers(int newMaxPassengers)
    {
        this.maxPassengers = newMaxPassengers;
    }

    public int getNumPassengers()
    {
        return this.maxPassengers;
    }

    public String toString()
    {
        return ("Cruise Ship: " + super.getShipName() + "\n" + "Number of Passengers: " +
                this.maxPassengers);
    }
}