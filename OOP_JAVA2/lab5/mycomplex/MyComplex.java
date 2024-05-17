package lab5.mycomplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(){
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString(){
        return "(" + this.real + " + " + this.imag + "i" + ")";
    }

    public boolean isReal(){
        return this.imag == 0;
    }

    public boolean isImaginary(){
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == this.imag;
    }
    
    public boolean equals(MyComplex another) {
        return (this.real == another.getReal()) && (this.imag == another.getImag());
           
    }

    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }
    
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

}
