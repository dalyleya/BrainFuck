package entity;

import compiler.exception.CPUIndexOutOfBounds;
import compiler.exception.NegativeCPUIndexException;
import compiler.exception.NegativeCPUValueException;

import java.util.Arrays;

/**
 * Contain array of chars and current index
 * Array maximum size is 30000 elements
 */

class CPUData {
    private char[] cpu;
    private int cpuIndex;
    private static final int MAX_CPU_SIZE = 30000;

    CPUData() {
        cpu = new char[MAX_CPU_SIZE];
        cpuIndex = 0;
    }

    void increaseCPUByIndex() {
        cpu[cpuIndex]++;
    }

    void decreaseCPUByIndex() throws NegativeCPUValueException {
        if (cpu[cpuIndex] <= 0) {
            throw new NegativeCPUValueException();
        }
        cpu[cpuIndex]--;
    }

    void increaseCPUIndex() throws CPUIndexOutOfBounds {

        checkIndex(cpuIndex + 1);
        cpuIndex++;
    }

    void decreaseCPUIndex() throws NegativeCPUIndexException {
        if (cpuIndex <= 0 ){
            throw new NegativeCPUIndexException();
        }
        cpuIndex--;
    }

    boolean isCpuOnCurrentIndexEqualsZero() throws CPUIndexOutOfBounds {
        checkIndex(cpuIndex);
        return cpu[cpuIndex] == 0;
    }

    private void checkIndex(int cpuIndex) throws CPUIndexOutOfBounds {
        if (cpuIndex >= MAX_CPU_SIZE) {
            throw new CPUIndexOutOfBounds();
        }
    }

    boolean isCpuOnCurrentIndexMoreThanZero() throws CPUIndexOutOfBounds {
        checkIndex(cpuIndex);
        return cpu[cpuIndex] > 0;
    }

    char getCurrentCPUChar() throws CPUIndexOutOfBounds {
        checkIndex(cpuIndex);
        return cpu[cpuIndex];
    }

    void setCpu(char[] newCpu) {
        cpu = new char[MAX_CPU_SIZE];
        System.arraycopy(newCpu, 0, cpu, 0, newCpu.length);
    }

    void setCpuIndex(int cpuIndex) {
        this.cpuIndex = cpuIndex;
    }

    int getCpuIndex() {
        return cpuIndex;
    }

    char[] getCpu() {
        return Arrays.copyOf(cpu , cpu.length);
    }
}
