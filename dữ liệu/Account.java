package data;
import java.text.NumberFormat;
import java.util.Scanner;
 
public class Account {
 
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;
 
    Scanner sc = new Scanner(System.in);

    public Account() {
    }

    public Account(long soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }

    public long getSoTK() {
        return this.soTK;
    }
 
    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }
 
    public String getTenTK() {
        return this.tenTK;
    }
 
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }
 
    public double getSoTienTrongTK() {
        return this.soTienTrongTK;
    }
 
    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }
 
 
    public String toString() {
       
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        return soTK + "-" + tenTK + "-" + str1;
    }
}
// Demo Class Account 2 :
public class Account implements IFileInfor{
    String nameTK, stk, phoneNumber, address;
    int money;
    
    List<Receiver> receiverList = new ArrayList<>();
    List<Transfer> transferList = new ArrayList<>();

    public Account() {
    }

    public Account(String namestk, String stk, String phoneNumber, String address, int money) {
        this.namestk = namestk;
        this.stk = stk;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.money = money;
    }

    public String getNamestk() {
        return stkname;
    }

    public void setNamestk(String namestk) {
        this.namestk = namestk;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Receiver> getReceiverList() {
        return receiverList;
    }

    public List<Transfer> getTransferList() {
        return transferList;
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap Ten Tai Khoan : ");
        namestk = scan.nextLine();
        
        System.out.println("Nhap STK: ");
        stk = scan.nextLine();
        
        System.out.println("Nhap SDT: ");
        phoneNumber = scan.nextLine();
        
        System.out.println("Nhap dia chi: ");
        address = scan.nextLine();
        
        money = 0;
    }
 
