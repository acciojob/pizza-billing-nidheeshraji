package com.driver;

public class Pizza {

    private int price=0;
    private Boolean isVeg;
    private String bill="";
    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean  addTakeaway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg==true)
        {

           price=price+300;
        }
        else {

            price=price+400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {

        if (addExtraCheese)
            return;
        else {
            price=price+80;
            addExtraCheese=true;
        }
    }

    public void addExtraToppings(){

        if(addExtraToppings)
            return;
        else
        {
            if(isVeg)
            {

                price=price+70;
                addExtraToppings=true;
            }
            else {

                price=price+170;
                addExtraToppings=true;

            }
        }
    }

    public void addTakeaway(){
        if(addTakeaway)
            return;

        price=price+20;
        addTakeaway=true;
    }

    public String getBill(){
        if(isVeg==true)
            bill=bill+"Base Price Of The Pizza: 300"+"\n" ;
        else
            bill=bill+"Base Price Of The Pizza: 400"+"\n";

        if(addExtraCheese)
            bill=bill+"Extra Cheese Added: 80"+"\n";

        if(addExtraToppings)
        {
            if(isVeg)
            {
                bill=bill+"Extra Toppings Added: 70 "+"\n";

            }
            else {
                bill = bill + "Extra Toppings Added: 120 " + "\n";
            }

        }
        if(addTakeaway)
        {
            bill=bill+"Paperbag Added: 20"+"\n";
        }

        bill=bill+"Total Price:"+price+"\n";
        return this.bill;
    }

}
