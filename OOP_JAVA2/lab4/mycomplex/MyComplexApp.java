package lab4.mycomplex;

public class MyComplexApp {
    private double real;
    private double imag;

    public MyComplexApp(){
        real = 0.0;
        imag = 0.0;
    }

    public MyComplexApp(double real, double imag) {
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

    // public String toString(){
    //     if(imag >= 0)
    //         return "(" + this.real + " + " + this.imag + "i" + ")";
    //     else
    //         return "(" + this.real + " - " + Math.abs(this.imag) + "i" + ")";
    // }

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

    public double argument(){
        return Math.atan2(imag, real);
    }

    public MyComplexApp add(MyComplexApp right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplexApp addNew(MyComplexApp right) {
        return new MyComplexApp(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplexApp subtract(MyComplexApp right){
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplexApp subtractNew(MyComplexApp right) {
        return new MyComplexApp(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplexApp multiply(MyComplexApp right){
        double realNumber = (this.real*right.getReal()) - (this.imag*right.getImag());
        double imagNumber = (this.real*right.getImag()) + (this.imag*right.getReal());
        this.real = realNumber;
        this.imag = imagNumber;
        return this;
    } 

    public MyComplexApp divide(MyComplexApp right){
        // z1/z2 = (z1*đối z2)/(z2)^2
        double temp = right.getReal()*right.getReal() + right.getImag()*right.getImag();
        double realNumber = (this.real*right.getReal() + this.imag*right.getImag())/temp;
        double imagNumber =  (this.imag*right.getReal() - this.real*right.getImag())/temp;
        this.real = realNumber;
        this.imag = imagNumber;
        return this;
    }

    public MyComplexApp conjugate(){
        double imagNum = - imag;
        this.imag = imagNum;
        return this;
    }

}
