class Trabajador extends Persona{
    private double salario;

    public Trabajador(String nombre, int edad, int telefono, double salario){
        super(nombre, telefono, telefono);
        this.salario = salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}
