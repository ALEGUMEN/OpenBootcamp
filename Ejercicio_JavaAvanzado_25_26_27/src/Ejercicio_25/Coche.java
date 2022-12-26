package Ejercicio_25;

class Coche extends Vehiculo {
    String marca;

    public Coche(int velocidad, String nombre, String color, String modelo){
        super(velocidad, nombre, color, modelo);
        this.marca="Lexus";
    }
    @Override
    public void acelerar() {
        velocidad++;
    }

    @Override
    public void frenar() {
        velocidad--;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }


}

class cocheElectrico extends Vehiculo{
    Double kwatts;

    public cocheElectrico(int velocidad, String nombre, String color, String modelo){
        super(velocidad, nombre, color, modelo);
        this.kwatts= 17d;

    }
    @Override
    public void acelerar() {
        velocidad++;
    }

    @Override
    public void frenar() {
        velocidad--;
    }

    @Override
    public String toString() {
        return "cocheElectrico{" +
                "watts=" + kwatts +
                ", velocidad=" + velocidad +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

}

class Combustible extends Vehiculo{

    int ltrDeCombustible;

    public Combustible(int velocidad, String nombre, String color, String modelo){
        super(velocidad, nombre, color, modelo);
        this.ltrDeCombustible=25;

    }
    @Override
    public void acelerar() {
        velocidad++;
    }

    @Override
    public void frenar() {
        velocidad--;
    }

    @Override
    public String toString() {
        return "Combustible{" +
                "ltrDeNafta=" + ltrDeCombustible +
                ", velocidad=" + velocidad +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }


}

class Hibrido extends Vehiculo{
    int HP;

    public Hibrido(int velocidad, String nombre, String color, String modelo) {
        super(velocidad, nombre, color, modelo);
        this.HP= 156;
    }
    @Override
    public void acelerar() {
        velocidad++;
    }

    @Override
    public void frenar() {
        velocidad--;
    }

    @Override
    public String toString() {
        return "Hibrido{" +
                "HP=" + HP +
                ", velocidad=" + velocidad +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
