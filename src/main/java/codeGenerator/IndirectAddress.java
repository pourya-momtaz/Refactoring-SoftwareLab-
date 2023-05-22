package codeGenerator;

public class IndirectAddress extends Address {
    public IndirectAddress(int num, varType varType) {
        super(num, varType);
    }

    public String toString() {
        return "@" + num;
    }
}
