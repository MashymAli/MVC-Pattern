
package mvc;

public class ItemsController {
    private Items model;
    private ItemView view;
    private ItemView2 view2;
    
    public ItemsController(Items model, ItemView view){
    this.model = model;
    this.view = view;
    }
    
    public ItemsController(Items model, ItemView2 view2){
    this.model = model;
    this.view2 = view2;
    }
    
    public void setItemName1(String name){
    model.setItemName1(name);
    }
    public void getItemName1(){
    model.getItemName1();
    }
    
    public void setItemName2(String name){
    model.setItemName2(name);
    }
    public void getItemName2(){
    model.getItemName2();
    }
    
    public void setItemPrice1(String price){
    model.setItemPrice(price);
    }
    public void getItemPrice1(){
    model.getItemPrice1();
    }
    
    public void setItemPrice2(String price){
    model.setItemPrice2(price);
    }
    public void getItemPrice2(){
    model.getItemPrice2();
    }
   
    public void updateView(){
    view.details(model.getItemName1(), model.getItemPrice1(), model.getItemName2(), model.getItemPrice2());}
    public void updateView2(){
    view2.details2(model.getItemName1(), model.getItemPrice1(), model.getItemName2(), model.getItemPrice2());
  
    } 
}
