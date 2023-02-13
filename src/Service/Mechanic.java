package Service;

import Utilities.Utilities;
import Exception.TransportTypeException;
import transport.Transport;

public class Mechanic {
    private String name;
    private final String company;

    public Mechanic(String name, String company) {
        this.name = Utilities.check(name);
        this.company = Utilities.check(company);
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = Utilities.check(name);
    }

   public void doMaintenance(Transport transport) throws TransportTypeException {
        transport.diagnose();
   }

   public void fixCar(Transport transport) {
       System.out.println("Починить машину " + transport);
   }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
