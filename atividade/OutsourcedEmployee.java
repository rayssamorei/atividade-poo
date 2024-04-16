public class OutsourcedEmployee extends Employee{
    //Atributos
    private Double addtionalCharge;

    //Construtores
    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    public OutsourcedEmployee(String nome, Integer hours, Double valuePerHour, Double addtionalCharge) {
        super(nome, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }
    
    //Métodos getters e setters
    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    //Método pagamento reenscrito, pois os funcionários tem acesso a 110% sobre o recebimento adicional deles
    @Override
    public double payment() {
        return super.payment() + addtionalCharge * 1.1;
    }
}