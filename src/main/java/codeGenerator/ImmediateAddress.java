package codeGenerator;

public class ImmediateAddress extends Address {
    public ImmediateAddress(int num, varType varType) {
        super(num, varType);
    }

    public String toString() {
        return "#" + num;
    }
}
