/**
 * This class implements the factory design pattern
 */

public class HospitalManagementFactory {
    public HospitalManagement getItem(String item, String expense){
        if(item == null){
            return null;
        }
        if(item.equalsIgnoreCase("Patients")) {
            HospitalManagement g= new Patients();
            ((Patients) g).selectExpense(expense);
            return g;
        }
        else if(item.equalsIgnoreCase("Doctors")){
            HospitalManagement g= new Doctors();
            ((Doctors) g).selectExpense(expense);
            return g;
        }
        else if(item.equalsIgnoreCase("Staff")) {
            HospitalManagement g= new Staff();
            ((Staff) g).selectExpense(expense);
            return g;
        }
        return null;
    }
}
