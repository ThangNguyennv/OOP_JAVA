public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;
    
    public MyComplex() {
        
    }
    
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public double getReal() {
        return this.real;
    }
    
    public void setReal(double real) {
        this.real = real;
    }
    
    public double getImag() {
        return this.imag;
    }
    
    public void setImag(double imag) {
        this.imag = imag;
    }
    
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public String toString() {
        return "(" + this.real +  " + " + this.imag + "i)";
    }
    
    public boolean isReal() {
        if(this.imag == 0.0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isImaginary() {
        if(this.real == 0.0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean equals(double real, double imag) {
        if(this.real == this.imag) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean equals(MyComplex another) {
        if(this.real == another.getReal() && this.imag == another.getImag()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public double magnitude() {
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