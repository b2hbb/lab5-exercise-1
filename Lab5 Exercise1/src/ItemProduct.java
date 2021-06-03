

public class ItemProduct{
    
 
    private int itemProductId = 0;

    //Product name space
    private String name = null;

    //Product price
    private float price = 0;

    public void setItemProductId(int pItemProductId){
        this.itemProductId = pItemProductId;
    }


    public int getItemProductId(){
        return this.itemProductId;
    }

    public void setName(String pName){
        this.name = pName;
    }


    public String getName(){
        return this.name;
    }

  
    public void setPrice(float pPrice){
        this.price = pPrice;
    }

    public float getPrice(){
        return this.price;
    }
}