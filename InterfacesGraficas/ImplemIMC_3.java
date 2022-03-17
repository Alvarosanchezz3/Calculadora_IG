package InterfacesGraficas;

public class ImplemIMC_3 {

    double altura;
    double peso;
    double imc;



    public ImplemIMC_3(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularimc() {
        imc=peso/(altura * altura);
        return imc;
    }
}