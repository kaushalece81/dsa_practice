package object.pkg;

public class ElectricityBill {
    private int meterNo;
    private String name;
    private String address;
    public ElectricityBill(int meterNo, String name, String address){
        this.meterNo=meterNo;
        this.name=name;
        this.address=address;
    }
    
    public void setMeterNo(int meterNo){
        this.meterNo=meterNo;
    }
    public void setName(String name){
        this.name=name;
    }
     public void setAddress(String address){
        this.address=address;
    }
    
    public int getMeterNo(){
        return meterNo;
    }
    
    public String setName(){
        return name;
    }
    
    public String setAddress(){
        return address;
    }
    @Override
    public boolean equals(Object obj){
        ElectricityBill eb=(ElectricityBill)obj;
        return this.meterNo==eb.getMeterNo();
    }
    @Override
    public int hashCode(){
        return this.meterNo;
    }
    @Override
    public String toString(){
        return String.format("ElectricityBill [meterNo=%s, name=%s, address=%s]", meterNo,name,address);
    }


}
