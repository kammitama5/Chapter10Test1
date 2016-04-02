import javax.swing.JOptionPane;

public class CargoShip extends Ship
{
    private int tonnage;

    public CargoShip(String newName, String newYear, int newTonnage)
    {
        super(newName, newYear);
        this.tonnage = newTonnage;
    }

    public void setCargoCapacity(int newTonnage)
    {
        this.tonnage = newTonnage;
    }

    public int getCargoCapacity()
    {
        return this.tonnage;
    }

    
    public String toString()
    {
        return ("Cargo Ship: " + super.getShipName() + "\n" + "Tonnage: " + this.tonnage);
    }
}