package entity;

import java.util.Arrays;

/**
 * Contain array of chars and current index
 * Array maximum size is 30000 elements
 */

public class CPUData {
    private char[] cpu;
    private int cpuIndex;

    public CPUData() {
        cpu = new char[30000];
        cpuIndex = 0;
    }

    public void increaseCPUByIndex() {
        cpu[cpuIndex]++;
    }

    public void decreaseCPUByIndex() {
        cpu[cpuIndex]--;
    }

    public void increaseCPUIndex() {
        cpuIndex++;
    }

    public void decreaseCPUIndex() {
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
