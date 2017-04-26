package com.rokyinfo.ble.toolbox.protocol.model;

import com.rokyinfo.convert.RkField;
/**
 * Created by apple on 16/4/29.
 */
public class RK4102Fault {
    /**
     * 0:请求成功
     * 1:请求失败
     */
    @RkField(position = 0, length = 1, bitPosition = 0, bitLength = 1)
    private int status;

    /**
     * 电机控制器/电机类:MOS故障  1：故障，0：无故障
     */
    @RkField(position = 1, length = 1, bitPosition = 0, bitLength = 1)
    private int mos;
    /**
     * 电机控制器/电机类:转把故障  1：故障，0：无故障
     */
    @RkField(position = 1, length = 1, bitPosition = 1, bitLength = 1)
    private int turnedHandle;
    /**
     * 电机控制器/电机类:缺相故障  1：故障，0：无故障
     */
    @RkField(position = 1, length = 1, bitPosition = 2, bitLength = 1)
    private int phase;
    /**
     * 电机控制器/电机类:霍尔故障  1：故障，0：无故障
     */
    @RkField(position = 1, length = 1, bitPosition = 3, bitLength = 1)
    private int hall;
    /**
     * 电机控制器/电机类:刹把故障  1：故障，0：无故障
     */
    @RkField(position = 1, length = 1, bitPosition = 4, bitLength = 1)
    private int brakeHandle;
    /**
     * 电机控制器/电机类:电机故障  1：故障，0：无故障
     */
    @RkField(position = 1, length = 1, bitPosition = 5, bitLength = 1)
    private int electric;
    /**
     * 电机控制器/电机类:ECU通信异常  1：故障，0：无故障
     */
    @RkField(position = 1, length = 1, bitPosition = 7, bitLength = 1)
    private int ecuCommunication;

    /**
     * 中控类:ble故障  1：故障，0：无故障
     */
    @RkField(position = 2, length = 1, bitPosition = 3, bitLength = 1)
    private int ble;

    /**
     * 电池故障:BMS通信故障  1：故障，0：无故障
     */
    @RkField(position = 3, length = 1, bitPosition = 0, bitLength = 1)
    private int bmsCommunication;
    /**
     * 电池故障:过充故障  1：故障，0：无故障
     */
    @RkField(position = 3, length = 1, bitPosition = 1, bitLength = 1)
    private int overCharge;
    /**
     * 电池故障:电芯高温故障  1：故障，0：无故障
     */
    @RkField(position = 3, length = 1, bitPosition = 2, bitLength = 1)
    private int elecChipHighTemperature;
    /**
     * 电池故障:电芯低温故障  1：故障，0：无故障
     */
    @RkField(position = 3, length = 1, bitPosition = 3, bitLength = 1)
    private int elecChipLowTemperature;
    /**
     * 电池故障:电池欠压  1：故障，0：无故障
     */
    @RkField(position = 3, length = 1, bitPosition = 4, bitLength = 1)
    private int batteryUnderVoltage;

    /**
     * GPS故障:GPS通信故障  1：故障，0：无故障
     */
    @RkField(position = 4, length = 1, bitPosition = 0, bitLength = 1)
    private int gpsCommunication;
    /**
     * GPS故障:GSP信号异常  1：故障，0：无故障
     */
    @RkField(position = 4, length = 1, bitPosition = 1, bitLength = 1)
    private int gpsSignalAnomaly;
    /**
     * GPS故障:GSM信号异常  1：故障，0：无故障
     */
    @RkField(position = 4, length = 1, bitPosition = 2, bitLength = 1)
    private int gsmSignalAnomaly;

    /**
     * 其他:RC异常  1：故障，0：无故障
     */
    @RkField(position = 5, length = 1, bitPosition = 3, bitLength = 1)
    private int rcAnomaly;

    /**
     * PCU故障:短路故障  1：故障，0：无故障
     */
    @RkField(position = 6, length = 1, bitPosition = 0, bitLength = 1)
    private int shortCircuit;
    /**
     * PCU故障:硬件故障  1：故障，0：无故障
     */
    @RkField(position = 6, length = 1, bitPosition = 1, bitLength = 1)
    private int hardwareFault;
    /**
     * PCU故障:DC使能控制  1：故障，0：无故障
     */
    @RkField(position = 6, length = 1, bitPosition = 2, bitLength = 1)
    private int dcEnableControl;
    /**
     * PCU故障:DC输出过压  1：故障，0：无故障
     */
    @RkField(position = 6, length = 1, bitPosition = 3, bitLength = 1)
    private int dcOutputOverVoltage;
    /**
     * PCU故障:DC输出欠压  1：故障，0：无故障
     */
    @RkField(position = 6, length = 1, bitPosition = 4, bitLength = 1)
    private int dcOutputUnderVoltage;
    /**
     * PCU故障:电源管理通信故障  1：故障，0：无故障
     */
    @RkField(position = 6, length = 1, bitPosition = 7, bitLength = 1)
    private int powerManagerCommunication;

    /**
     * 灯光断路故障:前左转  1：故障，0：无故障
     */
    @RkField(position = 7, length = 1, bitPosition = 0, bitLength = 1)
    private int cbFrontLeftTurn;
    /**
     * 灯光断路故障:后左转  1：故障，0：无故障
     */
    @RkField(position = 7, length = 1, bitPosition = 1, bitLength = 1)
    private int cbBackLeftTurn;
    /**
     * 灯光断路故障:前右转  1：故障，0：无故障
     */
    @RkField(position = 7, length = 1, bitPosition = 2, bitLength = 1)
    private int cbFrontRightTurn;
    /**
     * 灯光断路故障:后右转  1：故障，0：无故障
     */
    @RkField(position = 7, length = 1, bitPosition = 3, bitLength = 1)
    private int cbBackRightTurn;
    /**
     * 灯光断路故障:近光  1：故障，0：无故障
     */
    @RkField(position = 7, length = 1, bitPosition = 4, bitLength = 1)
    private int cbNearLight;
    /**
     * 灯光断路故障:远光  1：故障，0：无故障
     */
    @RkField(position = 7, length = 1, bitPosition = 5, bitLength = 1)
    private int cbBeam;
    /**
     * 灯光断路故障:尾灯  1：故障，0：无故障
     */
    @RkField(position = 7, length = 1, bitPosition = 6, bitLength = 1)
    private int cbTaillight;
    /**
     * 灯光断路故障:刹车灯  1：故障，0：无故障
     */
    @RkField(position = 7, length = 1, bitPosition = 7, bitLength = 1)
    private int cbBrakeLight;
    /**
     * 灯光断路故障:背景灯1  1：故障，0：无故障
     */
    @RkField(position = 8, length = 1, bitPosition = 0, bitLength = 1)
    private int cbBackgroundLight1;
    /**
     * 灯光断路故障:背景灯2  1：故障，0：无故障
     */
    @RkField(position = 8, length = 1, bitPosition = 1, bitLength = 1)
    private int cbBackgroundLight2;
    /**
     * 灯光断路故障:背景灯3  1：故障，0：无故障
     */
    @RkField(position = 8, length = 1, bitPosition = 2, bitLength = 1)
    private int cbBackgroundLight3;
    /**
     * 灯光断路故障:喇叭故障  1：故障，0：无故障
     */
    @RkField(position = 8, length = 1, bitPosition = 3, bitLength = 1)
    private int cbHornFault;
    /**
     * 灯光短路故障:前左转  1：故障，0：无故障
     */
    @RkField(position = 9, length = 1, bitPosition = 0, bitLength = 1)
    private int scFrontLeftTurn;
    /**
     * 灯光短路故障:后左转  1：故障，0：无故障
     */
    @RkField(position = 9, length = 1, bitPosition = 1, bitLength = 1)
    private int scBackLeftTurn;
    /**
     * 灯光短路故障:前右转  1：故障，0：无故障
     */
    @RkField(position = 9, length = 1, bitPosition = 2, bitLength = 1)
    private int scFrontRightTurn;
    /**
     * 灯光短路故障:后右转  1：故障，0：无故障
     */
    @RkField(position = 9, length = 1, bitPosition = 3, bitLength = 1)
    private int scBackRightTurn;
    /**
     * 灯光短路故障:近光  1：故障，0：无故障
     */
    @RkField(position = 9, length = 1, bitPosition = 4, bitLength = 1)
    private int scNearLight;
    /**
     * 灯光短路故障:远光  1：故障，0：无故障
     */
    @RkField(position = 9, length = 1, bitPosition = 5, bitLength = 1)
    private int scBeam;
    /**
     * 灯光短路故障:尾灯  1：故障，0：无故障
     */
    @RkField(position = 9, length = 1, bitPosition = 6, bitLength = 1)
    private int scTaillight;
    /**
     * 灯光短路故障:刹车灯  1：故障，0：无故障
     */
    @RkField(position = 9, length = 1, bitPosition = 7, bitLength = 1)
    private int scBrakeLight;
    /**
     * 灯光短路故障:背景灯1  1：故障，0：无故障
     */
    @RkField(position = 10, length = 1, bitPosition = 0, bitLength = 1)
    private int scBackgroundLight1;
    /**
     * 灯光短路故障:背景灯2  1：故障，0：无故障
     */
    @RkField(position = 10, length = 1, bitPosition = 1, bitLength = 1)
    private int scBackgroundLight2;
    /**
     * 灯光短路故障:背景灯3  1：故障，0：无故障
     */
    @RkField(position = 10, length = 1, bitPosition = 2, bitLength = 1)
    private int scBackgroundLight3;
    /**
     * 灯光短路故障:喇叭故障  1：故障，0：无故障
     */
    @RkField(position = 10, length = 1, bitPosition = 3, bitLength = 1)
    private int scHornFault;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getMos() {
        return mos;
    }

    public void setMos(int mos) {
        this.mos = mos;
    }

    public int getTurnedHandle() {
        return turnedHandle;
    }

    public void setTurnedHandle(int turnedHandle) {
        this.turnedHandle = turnedHandle;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public int getHall() {
        return hall;
    }

    public void setHall(int hall) {
        this.hall = hall;
    }

    public int getBrakeHandle() {
        return brakeHandle;
    }

    public void setBrakeHandle(int brakeHandle) {
        this.brakeHandle = brakeHandle;
    }

    public int getElectric() {
        return electric;
    }

    public void setElectric(int electric) {
        this.electric = electric;
    }

    public int getEcuCommunication() {
        return ecuCommunication;
    }

    public void setEcuCommunication(int ecuCommunication) {
        this.ecuCommunication = ecuCommunication;
    }

    public int getBle() {
        return ble;
    }

    public void setBle(int ble) {
        this.ble = ble;
    }

    public int getBmsCommunication() {
        return bmsCommunication;
    }

    public void setBmsCommunication(int bmsCommunication) {
        this.bmsCommunication = bmsCommunication;
    }

    public int getOverCharge() {
        return overCharge;
    }

    public void setOverCharge(int overCharge) {
        this.overCharge = overCharge;
    }

    public int getElecChipHighTemperature() {
        return elecChipHighTemperature;
    }

    public void setElecChipHighTemperature(int elecChipHighTemperature) {
        this.elecChipHighTemperature = elecChipHighTemperature;
    }

    public int getElecChipLowTemperature() {
        return elecChipLowTemperature;
    }

    public void setElecChipLowTemperature(int elecChipLowTemperature) {
        this.elecChipLowTemperature = elecChipLowTemperature;
    }

    public int getBatteryUnderVoltage() {
        return batteryUnderVoltage;
    }

    public void setBatteryUnderVoltage(int batteryUnderVoltage) {
        this.batteryUnderVoltage = batteryUnderVoltage;
    }

    public int getGpsCommunication() {
        return gpsCommunication;
    }

    public void setGpsCommunication(int gpsCommunication) {
        this.gpsCommunication = gpsCommunication;
    }

    public int getGpsSignalAnomaly() {
        return gpsSignalAnomaly;
    }

    public void setGpsSignalAnomaly(int gpsSignalAnomaly) {
        this.gpsSignalAnomaly = gpsSignalAnomaly;
    }

    public int getGsmSignalAnomaly() {
        return gsmSignalAnomaly;
    }

    public void setGsmSignalAnomaly(int gsmSignalAnomaly) {
        this.gsmSignalAnomaly = gsmSignalAnomaly;
    }

    public int getRcAnomaly() {
        return rcAnomaly;
    }

    public void setRcAnomaly(int rcAnomaly) {
        this.rcAnomaly = rcAnomaly;
    }

    public int getShortCircuit() {
        return shortCircuit;
    }

    public void setShortCircuit(int shortCircuit) {
        this.shortCircuit = shortCircuit;
    }

    public int getHardwareFault() {
        return hardwareFault;
    }

    public void setHardwareFault(int hardwareFault) {
        this.hardwareFault = hardwareFault;
    }

    public int getDcEnableControl() {
        return dcEnableControl;
    }

    public void setDcEnableControl(int dcEnableControl) {
        this.dcEnableControl = dcEnableControl;
    }

    public int getDcOutputOverVoltage() {
        return dcOutputOverVoltage;
    }

    public void setDcOutputOverVoltage(int dcOutputOverVoltage) {
        this.dcOutputOverVoltage = dcOutputOverVoltage;
    }

    public int getDcOutputUnderVoltage() {
        return dcOutputUnderVoltage;
    }

    public void setDcOutputUnderVoltage(int dcOutputUnderVoltage) {
        this.dcOutputUnderVoltage = dcOutputUnderVoltage;
    }

    public int getPowerManagerCommunication() {
        return powerManagerCommunication;
    }

    public void setPowerManagerCommunication(int powerManagerCommunication) {
        this.powerManagerCommunication = powerManagerCommunication;
    }

    public int getCbHornFault() {
        return cbHornFault;
    }

    public void setCbHornFault(int cbHornFault) {
        this.cbHornFault = cbHornFault;
    }

    public int getScHornFault() {
        return scHornFault;
    }

    public void setScHornFault(int scHornFault) {
        this.scHornFault = scHornFault;
    }

    public int getCbFrontLeftTurn() {
        return cbFrontLeftTurn;
    }

    public void setCbFrontLeftTurn(int cbFrontLeftTurn) {
        this.cbFrontLeftTurn = cbFrontLeftTurn;
    }

    public int getCbBackLeftTurn() {
        return cbBackLeftTurn;
    }

    public void setCbBackLeftTurn(int cbBackLeftTurn) {
        this.cbBackLeftTurn = cbBackLeftTurn;
    }

    public int getCbFrontRightTurn() {
        return cbFrontRightTurn;
    }

    public void setCbFrontRightTurn(int cbFrontRightTurn) {
        this.cbFrontRightTurn = cbFrontRightTurn;
    }

    public int getCbBackRightTurn() {
        return cbBackRightTurn;
    }

    public void setCbBackRightTurn(int cbBackRightTurn) {
        this.cbBackRightTurn = cbBackRightTurn;
    }

    public int getCbNearLight() {
        return cbNearLight;
    }

    public void setCbNearLight(int cbNearLight) {
        this.cbNearLight = cbNearLight;
    }

    public int getCbBeam() {
        return cbBeam;
    }

    public void setCbBeam(int cbBeam) {
        this.cbBeam = cbBeam;
    }

    public int getCbTaillight() {
        return cbTaillight;
    }

    public void setCbTaillight(int cbTaillight) {
        this.cbTaillight = cbTaillight;
    }

    public int getCbBrakeLight() {
        return cbBrakeLight;
    }

    public void setCbBrakeLight(int cbBrakeLight) {
        this.cbBrakeLight = cbBrakeLight;
    }

    public int getCbBackgroundLight1() {
        return cbBackgroundLight1;
    }

    public void setCbBackgroundLight1(int cbBackgroundLight1) {
        this.cbBackgroundLight1 = cbBackgroundLight1;
    }

    public int getCbBackgroundLight2() {
        return cbBackgroundLight2;
    }

    public void setCbBackgroundLight2(int cbBackgroundLight2) {
        this.cbBackgroundLight2 = cbBackgroundLight2;
    }

    public int getCbBackgroundLight3() {
        return cbBackgroundLight3;
    }

    public void setCbBackgroundLight3(int cbBackgroundLight3) {
        this.cbBackgroundLight3 = cbBackgroundLight3;
    }

    public int getScFrontLeftTurn() {
        return scFrontLeftTurn;
    }

    public void setScFrontLeftTurn(int scFrontLeftTurn) {
        this.scFrontLeftTurn = scFrontLeftTurn;
    }

    public int getScBackLeftTurn() {
        return scBackLeftTurn;
    }

    public void setScBackLeftTurn(int scBackLeftTurn) {
        this.scBackLeftTurn = scBackLeftTurn;
    }

    public int getScFrontRightTurn() {
        return scFrontRightTurn;
    }

    public void setScFrontRightTurn(int scFrontRightTurn) {
        this.scFrontRightTurn = scFrontRightTurn;
    }

    public int getScBackRightTurn() {
        return scBackRightTurn;
    }

    public void setScBackRightTurn(int scBackRightTurn) {
        this.scBackRightTurn = scBackRightTurn;
    }

    public int getScNearLight() {
        return scNearLight;
    }

    public void setScNearLight(int scNearLight) {
        this.scNearLight = scNearLight;
    }

    public int getScBeam() {
        return scBeam;
    }

    public void setScBeam(int scBeam) {
        this.scBeam = scBeam;
    }

    public int getScTaillight() {
        return scTaillight;
    }

    public void setScTaillight(int scTaillight) {
        this.scTaillight = scTaillight;
    }

    public int getScBrakeLight() {
        return scBrakeLight;
    }

    public void setScBrakeLight(int scBrakeLight) {
        this.scBrakeLight = scBrakeLight;
    }

    public int getScBackgroundLight1() {
        return scBackgroundLight1;
    }

    public void setScBackgroundLight1(int scBackgroundLight1) {
        this.scBackgroundLight1 = scBackgroundLight1;
    }

    public int getScBackgroundLight2() {
        return scBackgroundLight2;
    }

    public void setScBackgroundLight2(int scBackgroundLight2) {
        this.scBackgroundLight2 = scBackgroundLight2;
    }

    public int getScBackgroundLight3() {
        return scBackgroundLight3;
    }

    public void setScBackgroundLight3(int scBackgroundLight3) {
        this.scBackgroundLight3 = scBackgroundLight3;
    }

    @Override
    public String toString() {
        return "RK4102Fault{" +
                "status=" + status +
                ", mos=" + mos +
                ", turnedHandle=" + turnedHandle +
                ", phase=" + phase +
                ", hall=" + hall +
                ", brakeHandle=" + brakeHandle +
                ", electric=" + electric +
                ", ecuCommunication=" + ecuCommunication +
                ", ble=" + ble +
                ", bmsCommunication=" + bmsCommunication +
                ", overCharge=" + overCharge +
                ", elecChipHighTemperature=" + elecChipHighTemperature +
                ", elecChipLowTemperature=" + elecChipLowTemperature +
                ", batteryUnderVoltage=" + batteryUnderVoltage +
                ", gpsCommunication=" + gpsCommunication +
                ", gpsSignalAnomaly=" + gpsSignalAnomaly +
                ", gsmSignalAnomaly=" + gsmSignalAnomaly +
                ", rcAnomaly=" + rcAnomaly +
                ", shortCircuit=" + shortCircuit +
                ", hardwareFault=" + hardwareFault +
                ", dcEnableControl=" + dcEnableControl +
                ", dcOutputOverVoltage=" + dcOutputOverVoltage +
                ", dcOutputUnderVoltage=" + dcOutputUnderVoltage +
                ", powerManagerCommunication=" + powerManagerCommunication +
                ", cbFrontLeftTurn=" + cbFrontLeftTurn +
                ", cbBackLeftTurn=" + cbBackLeftTurn +
                ", cbFrontRightTurn=" + cbFrontRightTurn +
                ", cbBackRightTurn=" + cbBackRightTurn +
                ", cbNearLight=" + cbNearLight +
                ", cbBeam=" + cbBeam +
                ", cbTaillight=" + cbTaillight +
                ", cbBrakeLight=" + cbBrakeLight +
                ", cbBackgroundLight1=" + cbBackgroundLight1 +
                ", cbBackgroundLight2=" + cbBackgroundLight2 +
                ", cbBackgroundLight3=" + cbBackgroundLight3 +
                ", cbHornFault=" + cbHornFault +
                ", scFrontLeftTurn=" + scFrontLeftTurn +
                ", scBackLeftTurn=" + scBackLeftTurn +
                ", scFrontRightTurn=" + scFrontRightTurn +
                ", scBackRightTurn=" + scBackRightTurn +
                ", scNearLight=" + scNearLight +
                ", scBeam=" + scBeam +
                ", scTaillight=" + scTaillight +
                ", scBrakeLight=" + scBrakeLight +
                ", scBackgroundLight1=" + scBackgroundLight1 +
                ", scBackgroundLight2=" + scBackgroundLight2 +
                ", scBackgroundLight3=" + scBackgroundLight3 +
                ", scHornFault=" + scHornFault +
                '}';
    }
}