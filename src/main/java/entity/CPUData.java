package entity;

import compiler.exception.CPUIndexOutOfBounds;
import compiler.exception.NegativeCPUIndexException;
import compiler.exception.NegativeCPUValueException;

import java.util.Arrays;

/**
 * Contain array of chars and current index
 * Array maximum size is 30000 elements
 */

public class CPUData {
    private char[] cpu;
    private int cpuIndex;
    private static final int MAX_CPU_SIZE = 30000;

    public CPUData() {
        cpu = new char[MAX_CPU_SIZE];
        cpuIndex = 0;
    }

    public void increaseCPUByIndex() {
        cpu[cpuIndex]++;
    }

    public void decreaseCPUByIndex() throws NegativeCPUValueException {
        if (cpu[cpuIndex] <= 0) {
            throw new NegativeCPUValueException();
        }
        cpu[cpuIndex]--;
    }

    public void increaseCPUIndex() throws CPUIndexOutOfBounds {

        if (cpuIndex + 1 >= MAX_CPU_SIZE){
            throw new CPUIndexOutOfBounds();
        }
        cpuIndex++;
    }

    public void decreaseCPUIndex() throws NegativeCPUIndexException {
        if (cpuIndex <= 0 ){
            throw new NegativeCPUIndexException();
        }
        cpuIndex--;
    }

    public boolean isCpuOnCurrentIndexEqualsZero() {
        return cpu[cpuIndex] == 0;
    }

    public boolean isCpuOnCurrentIndexMoreThanZero() {
        return cpu[cpuIndex] > 0;
    }

    public char getCurrentCPUChar() {
        return cpu[cpuIndex];
    }

    public void setCpu(char[] newCpu) {
        cpu = new char[30000];
        System.arraycopy(newCpu, 0, cpu, 0, newCpu.length);
    }

    public void setCpuIndex(int cpuIndex) {
        this.cpuIndex = cpuIndex;
    }

    public int getCpuIndex() {
        return cpuIndex;
    }

    public char[] getCpu() {
        return Arrays.copyOf(cpu , cpu.length);
    }
}
