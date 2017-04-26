package com.rokyinfo.ble.toolbox.protocol.model;

import com.rokyinfo.convert.RkFieldConverter;
import com.rokyinfo.convert.exception.FieldConvertException;
import com.rokyinfo.convert.exception.RkFieldException;
import com.rokyinfo.convert.util.ByteConvert;

/**
 * Created by caoyy on 16/6/24.
 */
public class YadeaFault {
    /**
     * 0:请求成功
     * 1:请求失败
     */
    private int status;
    /**
     * 电机故障
     * 1：故障，0：无故障
     */
    private int electric;
    /**
     * 控制器故障
     * 1：故障，0：无故障
     */
    private int controller;
    /**
     * 转把故障
     * 1：故障，0：无故障
     */
    private int turnedHandle;
    /**
     * 刹把故障
     * 1：故障，0：无故障
     */
    private int brakeHandle;
    /**
     * 氛围灯故障
     * 1：故障，0：无故障
     */
    private int atmosphereLamp;
    /**
     * 近光灯故障
     * 1：故障，0：无故障
     */
    private int nearLight;
    /**
     * 远光灯故障
     * 1：故障，0：无故障
     */
    private int beam;
    /**
     * 行车灯故障
     * 1：故障，0：无故障
     */
    private int drivingLamp;
    /**
     * 刹车灯故障
     * 1：故障，0：无故障
     */
    private int brakeLight;
    /**
     * 左前转向灯故障
     * 1：故障，0：无故障
     */
    private int frontLeftTurn;
    /**
     * 右前转向灯故障
     * 1：故障，0：无故障
     */
    private int frontRightTurn;
    /**
     * 左后转向灯故障
     * 1：故障，0：无故障
     */
    private int backLeftTurn;
    /**
     * 右后转向灯故障
     * 1：故障，0：无故障
     */
    private int backRightTurn;
    /**
     * 喇叭故障
     * 1：故障，0：无故障
     */
    private int horn;
    /**
     * 转换器故障
     * 1：故障，0：无故障
     */
    private int converter;
    /**
     * 电池过充故障
     * 1：故障，0：无故障
     */
    private int batteryOverCharge;
    /**
     * 电芯高温故障
     * 1：故障，0：无故障
     */
    private int elecChipHighTemperature;
    /**
     * 电芯低温故障
     * 1：故障，0：无故障
     */
    private int elecChipLowTemperature;
    /**
     * 蓝牙通讯故障
     * 1：故障，0：无故障
     */
    private int btCommunication;
    /**
     * GPS通讯故障
     * 1：故障，0：无故障
     */
    private int gpsCommunication;
    /**
     * GSM网络故障
     * 1：故障，0：无故障
     */
    private int gsmNet;
    /**
     * 射频通讯故障
     * 1：故障，0：无故障
     */
    private  int radioFrequencyCommunication;
    /**
     * 中控通讯故障
     * 1：故障，0：无故障
     */
    private  int centerControllerCommunication;
    /**
     * 控制器通讯故障
     * 1：故障，0：无故障
     */
    private  int controllerCommunication;
    /**
     * 电池通讯故障
     * 1：故障，0：无故障
     */
    private  int batteryCommunication;
    /**
     * 电源管理器故障
     * 1：故障，0：无故障
     */
    private int powerManager;

    /**
     * 根据字节数组构建雅迪故障对象
     * @param orgs
     * @return
     * @throws IllegalAccessException
     * @throws RkFieldException
     * @throws FieldConvertException
     */
    public static YadeaFault build(byte[] orgs) throws IllegalAccessException, RkFieldException, FieldConvertException {

        RK4102Fault rk4102Fault = RkFieldConverter.bytes2entity(new RK4102Fault(), ByteConvert.byteMerger(new byte[]{0},orgs));

        YadeaFault yadeaFault = new YadeaFault();
        yadeaFault.setStatus(rk4102Fault.getStatus());
        yadeaFault.setElectric(rk4102Fault.getElectric());
        //1：故障，0：无故障
        if(rk4102Fault.getMos() == 0 && rk4102Fault.getPhase() == 0 && rk4102Fault.getHall() == 0){
            yadeaFault.setController(0);
        }else{
            yadeaFault.setController(1);
        }
        yadeaFault.setTurnedHandle(rk4102Fault.getTurnedHandle());
        yadeaFault.setBrakeHandle(rk4102Fault.getBrakeHandle());
        if(rk4102Fault.getCbBackgroundLight1() == 0 && rk4102Fault.getCbBackgroundLight2() == 0 && rk4102Fault.getCbBackgroundLight3() == 0
                && rk4102Fault.getScBackgroundLight1() == 0 && rk4102Fault.getScBackgroundLight2() == 0 && rk4102Fault.getScBackgroundLight3() == 0){
            yadeaFault.setAtmosphereLamp(0);
        }else{
            yadeaFault.setAtmosphereLamp(1);
        }
        if(rk4102Fault.getCbNearLight() == 0 && rk4102Fault.getScNearLight() == 0){
            yadeaFault.setNearLight(0);
        }else{
            yadeaFault.setNearLight(1);
        }
        if(rk4102Fault.getCbBeam() == 0 && rk4102Fault.getScBeam() == 0){
            yadeaFault.setBeam(0);
        }else{
            yadeaFault.setBeam(1);
        }
        if(rk4102Fault.getCbTaillight() == 0 && rk4102Fault.getScTaillight() == 0){
            yadeaFault.setDrivingLamp(0);
        }else{
            yadeaFault.setDrivingLamp(1);
        }
        if(rk4102Fault.getCbBrakeLight() == 0 && rk4102Fault.getScBrakeLight() == 0){
            yadeaFault.setBrakeLight(0);
        }else{
            yadeaFault.setBrakeLight(1);
        }
        if(rk4102Fault.getCbFrontLeftTurn() == 0 && rk4102Fault.getScFrontLeftTurn() == 0){
            yadeaFault.setFrontLeftTurn(0);
        }else{
            yadeaFault.setFrontLeftTurn(1);
        }
        if(rk4102Fault.getCbFrontRightTurn() == 0 && rk4102Fault.getScFrontRightTurn() == 0){
            yadeaFault.setFrontRightTurn(0);
        }else{
            yadeaFault.setFrontRightTurn(1);
        }
        if(rk4102Fault.getCbBackLeftTurn() == 0 && rk4102Fault.getScBackLeftTurn() == 0){
            yadeaFault.setBackLeftTurn(0);
        }else{
            yadeaFault.setBackLeftTurn(1);
        }
        if(rk4102Fault.getCbBackRightTurn() == 0 && rk4102Fault.getScBackRightTurn() == 0){
            yadeaFault.setBackRightTurn(0);
        }else{
            yadeaFault.setBackRightTurn(1);
        }
        if(rk4102Fault.getCbHornFault() == 0 && rk4102Fault.getScHornFault() == 0){
            yadeaFault.setHorn(0);
        }else{
            yadeaFault.setHorn(1);
        }
        if(rk4102Fault.getDcEnableControl() == 0 && rk4102Fault.getDcOutputOverVoltage() == 0 && rk4102Fault.getDcOutputUnderVoltage() == 0){
            yadeaFault.setConverter(0);
        }else{
            yadeaFault.setConverter(1);
        }
        if(rk4102Fault.getOverCharge() == 0){
            yadeaFault.setBatteryOverCharge(0);
        }else{
            yadeaFault.setBatteryOverCharge(1);
        }
        if(rk4102Fault.getElecChipHighTemperature() == 0){
            yadeaFault.setElecChipHighTemperature(0);
        }else{
            yadeaFault.setElecChipHighTemperature(1);
        }
        if(rk4102Fault.getElecChipLowTemperature() == 0){
            yadeaFault.setElecChipLowTemperature(0);
        }else{
            yadeaFault.setElecChipLowTemperature(1);
        }
        if(rk4102Fault.getBle() == 0){
            yadeaFault.setBtCommunication(0);
            yadeaFault.setCenterControllerCommunication(0);
        }else{
            yadeaFault.setBtCommunication(1);
            yadeaFault.setCenterControllerCommunication(1);
        }
        if(rk4102Fault.getGpsCommunication() == 0 && rk4102Fault.getGpsSignalAnomaly() == 0){
            yadeaFault.setGpsCommunication(0);
        }else{
            yadeaFault.setGpsCommunication(1);
        }
        if(rk4102Fault.getGsmSignalAnomaly() == 0 && rk4102Fault.getGpsCommunication() == 0){
            yadeaFault.setGsmNet(0);
        }else{
            yadeaFault.setGsmNet(1);
        }
        if(rk4102Fault.getRcAnomaly() == 0){
            yadeaFault.setRadioFrequencyCommunication(0);
        }else{
            yadeaFault.setRadioFrequencyCommunication(1);
        }
        if(rk4102Fault.getEcuCommunication() == 0){
            yadeaFault.setControllerCommunication(0);
        }else{
            yadeaFault.setControllerCommunication(1);
        }
        if(rk4102Fault.getBmsCommunication() == 0){
            yadeaFault.setBatteryCommunication(0);
        }else{
            yadeaFault.setBatteryCommunication(1);
        }
        if(rk4102Fault.getShortCircuit() == 0 && rk4102Fault.getHardwareFault() == 0 && rk4102Fault.getPowerManagerCommunication() == 0){
            yadeaFault.setPowerManager(0);
        }else{
            yadeaFault.setPowerManager(1);
        }
        return yadeaFault;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getElectric() {
        return electric;
    }

    public void setElectric(int electric) {
        this.electric = electric;
    }

    public int getController() {
        return controller;
    }

    public void setController(int controller) {
        this.controller = controller;
    }

    public int getTurnedHandle() {
        return turnedHandle;
    }

    public void setTurnedHandle(int turnedHandle) {
        this.turnedHandle = turnedHandle;
    }

    public int getBrakeHandle() {
        return brakeHandle;
    }

    public void setBrakeHandle(int brakeHandle) {
        this.brakeHandle = brakeHandle;
    }

    public int getAtmosphereLamp() {
        return atmosphereLamp;
    }

    public void setAtmosphereLamp(int atmosphereLamp) {
        this.atmosphereLamp = atmosphereLamp;
    }

    public int getNearLight() {
        return nearLight;
    }

    public void setNearLight(int nearLight) {
        this.nearLight = nearLight;
    }

    public int getBeam() {
        return beam;
    }

    public void setBeam(int beam) {
        this.beam = beam;
    }

    public int getDrivingLamp() {
        return drivingLamp;
    }

    public void setDrivingLamp(int drivingLamp) {
        this.drivingLamp = drivingLamp;
    }

    public int getBrakeLight() {
        return brakeLight;
    }

    public void setBrakeLight(int brakeLight) {
        this.brakeLight = brakeLight;
    }

    public int getFrontLeftTurn() {
        return frontLeftTurn;
    }

    public void setFrontLeftTurn(int frontLeftTurn) {
        this.frontLeftTurn = frontLeftTurn;
    }

    public int getFrontRightTurn() {
        return frontRightTurn;
    }

    public void setFrontRightTurn(int frontRightTurn) {
        this.frontRightTurn = frontRightTurn;
    }

    public int getBackLeftTurn() {
        return backLeftTurn;
    }

    public void setBackLeftTurn(int backLeftTurn) {
        this.backLeftTurn = backLeftTurn;
    }

    public int getBackRightTurn() {
        return backRightTurn;
    }

    public void setBackRightTurn(int backRightTurn) {
        this.backRightTurn = backRightTurn;
    }

    public int getHorn() {
        return horn;
    }

    public void setHorn(int horn) {
        this.horn = horn;
    }

    public int getConverter() {
        return converter;
    }

    public void setConverter(int converter) {
        this.converter = converter;
    }

    public int getBatteryOverCharge() {
        return batteryOverCharge;
    }

    public void setBatteryOverCharge(int batteryOverCharge) {
        this.batteryOverCharge = batteryOverCharge;
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

    public int getBtCommunication() {
        return btCommunication;
    }

    public void setBtCommunication(int btCommunication) {
        this.btCommunication = btCommunication;
    }

    public int getGpsCommunication() {
        return gpsCommunication;
    }

    public void setGpsCommunication(int gpsCommunication) {
        this.gpsCommunication = gpsCommunication;
    }

    public int getGsmNet() {
        return gsmNet;
    }

    public void setGsmNet(int gsmNet) {
        this.gsmNet = gsmNet;
    }

    public int getRadioFrequencyCommunication() {
        return radioFrequencyCommunication;
    }

    public void setRadioFrequencyCommunication(int radioFrequencyCommunication) {
        this.radioFrequencyCommunication = radioFrequencyCommunication;
    }

    public int getCenterControllerCommunication() {
        return centerControllerCommunication;
    }

    public void setCenterControllerCommunication(int centerControllerCommunication) {
        this.centerControllerCommunication = centerControllerCommunication;
    }

    public int getControllerCommunication() {
        return controllerCommunication;
    }

    public void setControllerCommunication(int controllerCommunication) {
        this.controllerCommunication = controllerCommunication;
    }

    public int getBatteryCommunication() {
        return batteryCommunication;
    }

    public void setBatteryCommunication(int batteryCommunication) {
        this.batteryCommunication = batteryCommunication;
    }

    public int getPowerManager() {
        return powerManager;
    }

    public void setPowerManager(int powerManager) {
        this.powerManager = powerManager;
    }

    @Override
    public String toString() {
        return "YadeaFault{" +
                "status=" + status +
                ", electric=" + electric +
                ", controller=" + controller +
                ", turnedHandle=" + turnedHandle +
                ", brakeHandle=" + brakeHandle +
                ", atmosphereLamp=" + atmosphereLamp +
                ", nearLight=" + nearLight +
                ", beam=" + beam +
                ", drivingLamp=" + drivingLamp +
                ", brakeLight=" + brakeLight +
                ", frontLeftTurn=" + frontLeftTurn +
                ", frontRightTurn=" + frontRightTurn +
                ", backLeftTurn=" + backLeftTurn +
                ", backRightTurn=" + backRightTurn +
                ", horn=" + horn +
                ", converter=" + converter +
                ", batteryOverCharge=" + batteryOverCharge +
                ", elecChipHighTemperature=" + elecChipHighTemperature +
                ", elecChipLowTemperature=" + elecChipLowTemperature +
                ", btCommunication=" + btCommunication +
                ", gpsCommunication=" + gpsCommunication +
                ", gsmNet=" + gsmNet +
                ", radioFrequencyCommunication=" + radioFrequencyCommunication +
                ", centerControllerCommunication=" + centerControllerCommunication +
                ", controllerCommunication=" + controllerCommunication +
                ", batteryCommunication=" + batteryCommunication +
                ", powerManager=" + powerManager +
                '}';
    }
}
