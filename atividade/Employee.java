
public class Employee{
    //Atributos
    private String name;
    private Integer hours;
    private Double valuePerHour;

    //Construtores
    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    //Métodos getters e setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    
    //Método de pagamento dos funcionários, que é o valor de horas trabalhadas multiplicado pelas horas
    public double payment(){
        return valuePerHour * hours;
    }
}