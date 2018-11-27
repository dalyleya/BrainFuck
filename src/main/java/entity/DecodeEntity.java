package entity;

public class DecodeEntity {
    private CPUData cpuData;
    private DirectivesData dirData;
    private BracketCounter bracketCounter;
    private StringBuilder response;

    public DecodeEntity(char[] directives) {
        cpuData = new CPUData();
        dirData = new DirectivesData(directives);
        bracketCounter = new BracketCounter();
        response = new StringBuilder();
    }

    public void increaseCPUByIndex() {
        cpuData.increaseCPUByIndex();
    }

    public void decreaseCPUByIndex() {
        cpuData.decreaseCPUByIndex();
    }

    public void increaseCPUIndex() {
        cpuData.increaseCPUIndex();
    }

    public void decreaseCPUIndex() {
        cpuData.decreaseCPUIndex();
    }

    public boolean isCpuOnCurrentIndexEqualsZero() {
        return cpuData.isCpuOnCurrentIndexEqualsZero();
    }

    public boolean isCpuOnCurrentIndexMoreThanZero() {
        return cpuData.isCpuOnCurrentIndexMoreThanZero();
    }

    public void setCpu(char[] cpu) {
        cpuData.setCpu(cpu);
    }

    public int getCpuIndex() {
        return cpuData.getCpuIndex();
    }

    public char[] getCpu() {
        return cpuData.getCpu();
    }

    public void setCpuIndex(int cpuIndex) {
        cpuData.setCpuIndex(cpuIndex);
    }

    public int getDirIndex() {
        return dirData.getDirIndex();
    }

    public void setDirIndex(int dirIndex) {
        dirData.setDirIndex(dirIndex);
    }

    public void increaseDirIndex() {
        dirData.increaseDirIndex();
    }

    public void decreaseDirIndex() {
        dirData.decreaseDirIndex();
    }

    public char getDirectiveByCurrentIndex() {
        return dirData.getDirectiveByCurrentIndex();
    }

    public void setDirectives(char[] directives) {
        dirData.setDirectives(directives);
    }

    public boolean hasMoreBrackets() {
        return bracketCounter.hasMoreBrackets();
    }

    public boolean hasNoMoreBrackets() {
        return bracketCounter.hasNoMoreBrackets();
    }

    public void increaseBracketCounter() {
        bracketCounter.increaseBracketCounter();
    }

    public void decreaseBracketCounter() {
        bracketCounter.decreaseBracketCounter();
    }

    public int getBracketCount() {
        return bracketCounter.getCount();
    }

    public void setBracketCount(int count) {
        bracketCounter.setCount(count);
    }

    public void setResponse(StringBuilder response) {
        this.response = response;
    }

    public String getResponse() {
        return response.toString();
    }

    public void appendCurrentCPUCharToResponse() {
        response.append(cpuData.getCurrentCPUChar());
    }

}
