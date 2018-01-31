/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author INT105
 */
public class Address {
    private String addressNo;
    private String city;
    private String province;

    public Address (String addressNo,String city,String province){
        this.addressNo = addressNo;
        this.city = city;
        this.province = province;
    }
    public Address(){
        
    }
    public String getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(String addressNo) {
        this.addressNo = addressNo;
    }

    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" + "addressNo=" + addressNo + ", city=" + city + ", province=" + province + '}';
    }

   
}
