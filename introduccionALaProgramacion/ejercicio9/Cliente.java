class Cliente extends Persona{
    private double credito;

    public Cliente(String nombre, int edad, int telefono, double credito){
        super(nombre, telefono, telefono);
        this.credito = credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public double getCredito() {
        return credito;
    }
}
