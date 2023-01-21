package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int chees;
    private int toppings;

    private boolean isExtracheesAdded;
    private boolean isExtractoppingsAdded;
    private boolean  isTakeawayadded;
    private boolean isBillGenarated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill="";

        if(isVeg==true)
        {

          this.price=300;
          this.toppings=70;
        }
        else {

           this.price=400;
           this.toppings=120;
        }
        this.chees=80;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
        this.isExtracheesAdded=false;
        this.isBillGenarated=false;
        this.isExtractoppingsAdded=false;
        this.isTakeawayadded=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {

        if (!isExtracheesAdded){
            this.price=this.price+chees;
            isExtracheesAdded=true;
        }
    }

    public void addExtraToppings(){

        if(!isExtractoppingsAdded){
               this.price=this.price+toppings;
                isExtractoppingsAdded=true;
            }

    }

    public void addTakeaway(){
        if(!isTakeawayadded)
       this.price=this.price+20;
        isTakeawayadded=true;
    }

    public String getBill() {
        if (!isBillGenarated) {

            if (isExtracheesAdded)
                bill = bill + "Extra Cheese Added: " + this.chees + "\n";

            if (isExtractoppingsAdded) {

                bill = bill + "Extra Toppings Added: " + this.toppings + "\n";

            }


            if (isTakeawayadded) {
                bill = bill + "Paperbag Added: 20" + "\n";
            }
            this.bill = this.bill + "Total Price: "+ this.price + "\n";
            isBillGenarated=true;
        }



        return this.bill;

        }

    }

