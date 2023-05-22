package codeGenerator;

public class DirectAddress extends Address {
    public DirectAddress(int num, varType varType) {
        super(num, varType);
    }

    public String toString() {
        return num + "";
    }
}
