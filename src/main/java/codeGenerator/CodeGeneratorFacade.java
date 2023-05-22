package codeGenerator;

import java.util.ArrayList;

public class CodeGeneratorFacade {
    private Memory memory;

    public CodeGeneratorFacade() {
        memory = new Memory();
    }

    public int getTemp() {
        return memory.getTemp();
    }

    public int getDateAddress() {
        return memory.getDateAddress();
    }

    public int saveMemory() {
        memory.saveMemory();
        return memory.sizeAfterSaveMemory();
    }

    public void add3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        memory.add3AddressCode(op, opr1, opr2, opr3);
    }

    public void add3AddressCode(int i, Operation op, Address opr1, Address opr2, Address opr3) {
        memory.add3AddressCode(i, op, opr1, opr2, opr3);
    }

    public int getCurrentCodeBlockAddress() {
        return memory.getCurrentCodeBlockAddress();
    }

    public void pintCodeBlock() {
        memory.pintCodeBlock();
    }
}
