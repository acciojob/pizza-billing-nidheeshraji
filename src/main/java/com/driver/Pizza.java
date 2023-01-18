package com.driver;

public class Pizza {

    private int price=0;
    private Boolean isVeg;
    private String bill="";


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg==true)
        {
           bill=bill+"Base Price Of The Pizza: 300"+"\n" ;
           price=price+300;
        }
        else {
            bill=bill+"Base Price Of The Pizza: 400"+"\n";
            price=price+400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {

        if (bill.contains("Cheese"))
            return;
        else {
            bill = bill + "Extra Cheese Added: 80" + "\n";
            price=price+80;
        }
    }

    public void addExtraToppings(){

        if(bill.contains("Toppings"))
            return;
        else
        {
            if(isVeg)
            {
                bill=bill+"Extra Toppings Added: 70 "+"\n";
                price=price+70;
            }
            else {
                bill=bill+"Extra Toppings Added: 120 "+"\n";
                price=price+170;

            }
        }
    }

    public void addTakeaway(){
        if(bill.contains("Paperbag"))
            return;
        bill=bill+"Paperbag Added: 20"+"\n";
        price=price+20;
    }

    public String getBill(){
        bill=bill+"Total Price: "+price+"\n";
        return this.bill;
    }
    // getter and setters


    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }
}
