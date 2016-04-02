public class Ship
{
    private String name;
    private String year;

    public Ship(String newName, String newYear)
    {
        this.name = newName;
        this.year = newYear;
    }

    public void setShipName(String newName)
    {
        this.name = newName;
    }

    public void setYearBuilt(String newYear)
    {
        this.year = newYear;
    }

    public String getShipName()
    {
        return this.name;
    }

    public String getYearBuilt()
    {
        return this.year;
    }

    public String toString()
    {
        return ("Ship: " + this.name + "\n" + "Built: " + this.year);
    }
}