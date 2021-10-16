public abstract class HospitalManagement {
    int cost ;
    ExpenseAdapter expense;

    abstract void setCost (int cost );

    public int calculateBill(int units){
        return units*cost ;
    }
}